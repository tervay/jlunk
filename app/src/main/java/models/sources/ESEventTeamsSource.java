package models.sources;

import com.google.common.base.Optional;
import generated.es2022.eventTeams.Converter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import jlunk.ExceptionOr;
import jlunk.NetUtil;
import models.DataOrigin;
import models.DataSource;
import models.Parameters;
import models.db.EventTeams;
import models.db.RegisteredTeam;
import okhttp3.Response;

public class ESEventTeamsSource extends DataSource<EventTeams> {
  public ESEventTeamsSource(DataOrigin origin) {
    super(origin);
  }

  @Override
  public ExceptionOr<List<EventTeams>> fetch(Parameters parameters) {
    List<ExceptionOr<EventTeams>> maybeTeams =
        parameters.getEventIds().or(List.of()).stream()
            .map(
                id -> {
                  var url =
                      String.format(
                          """
%steams/_search?size=2000&from=0&source_content_type=application/json&source=
    {
        "_source": [
            "team_number_yearly",
            "team_nickname",
            "profile_year",
            "team_stateprov",
            "team_city",
            "events.*",
            "*"
        ],
        "sort": [
            {
            "team_number_yearly": {
                "order": "asc"
            }
            }
        ],
        "query": {
            "bool": {
                "must": [
                    {
                        "match": {
                            "team_type": "FRC"
                        }
                    },
                    {
                        "match": {
                            "profile_year": "%s"
                        }
                    },
                    {
                        "match": {
                            "events.event_season": "%s"
                        }
                    },
                    {
                        "match": {
                            "events.fk_events": %s
                        }
                    }
                ]
            }
        }
    }
"""
                              .replaceAll("\n", "")
                              .replaceAll(" ", ""),
                          origin.url(),
                          parameters.getSeason(),
                          parameters.getSeason(),
                          id);

                  try (Response response = NetUtil.get(url)) {
                    var z = Converter.fromJsonString(response.body().string());
                    var teams =
                        EventTeams.builder()
                            .teams(
                                Optional.of(
                                    z.getHits().getHits().stream()
                                        .map(hit -> hit.getSource())
                                        .map(
                                            src ->
                                                RegisteredTeam.builder()
                                                    .teamNumber(
                                                        Optional.of(src.getTeamNumberYearly()))
                                                    .city(Optional.of(src.getTeamCity()))
                                                    .country(Optional.of(src.getTeamCountry()))
                                                    .countryCode(Optional.of(src.getCountryCode()))
                                                    .fullName(Optional.of(src.getTeamNameCalc()))
                                                    .hqTeamId(Optional.of(src.getId()))
                                                    .nickname(Optional.of(src.getTeamNickname()))
                                                    .origin(this.origin)
                                                    .postalCode(
                                                        Optional.of(src.getTeamPostalcode()))
                                                    .profileYear(Optional.of(src.getProfileYear()))
                                                    .programCode(
                                                        Optional.of(src.getProgramCodeDisplay()))
                                                    .programName(Optional.of(src.getProgramName()))
                                                    .programSeason(
                                                        Optional.of(src.getFkProgramSeasons()))
                                                    .rookieYear(
                                                        Optional.of(src.getTeamRookieyear()))
                                                    .stateProv(Optional.of(src.getTeamStateprov()))
                                                    .teamType(Optional.of(src.getTeamType()))
                                                    .websiteUrl(Optional.of(src.getTeamWebUrl()))
                                                    .build())
                                        .collect(Collectors.toList())))
                            .build();

                    return new ExceptionOr<EventTeams>(teams);
                  } catch (IOException e) {
                    return new ExceptionOr<EventTeams>(e);
                  }
                })
            .collect(Collectors.toList());

    if (maybeTeams.stream().anyMatch(t -> !t.ok())) {
      return new ExceptionOr<>(
          new Exception("Failed on " + maybeTeams.stream().filter(mt -> !mt.ok())));
    }

    return new ExceptionOr<>(
        maybeTeams.stream().map(mt -> mt.value()).collect(Collectors.toList()));
  }
}
