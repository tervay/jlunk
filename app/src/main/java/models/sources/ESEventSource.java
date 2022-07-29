package models.sources;

import com.google.common.base.Optional;
import generated.es2022.events.Converter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import jlunk.App;
import jlunk.ExceptionOr;
import models.DataOrigin;
import models.DataSource;
import models.Parameters;
import models.db.Event;
import okhttp3.Request;
import okhttp3.Response;

public class ESEventSource extends DataSource<Event> {
  public ESEventSource(DataOrigin origin) {
    super(origin);
  }

  @Override
  public ExceptionOr<List<Event>> fetch(Parameters parameters) {
    var queryParams =
        List.of(
            "size=" + parameters.getSize(),
            "from=" + parameters.getFrom(),
            "source_content_type=application/json",
            "source={"
                + "\"_source\":["
                + String.join(",", List.of("*").stream().map(s -> "\"" + s + "\"").toList())
                + "], "
                + String.format(
                    "\"query\":{\"bool\":{\"must\":[{\"match\":{\"event_type\":\"%s\"}},{\"match\":{\"event_season\":\"%s\"}}]}}",
                    parameters.getCompetitionType(), parameters.getSeason())
                + "}");

    var url =
        String.format(this.origin.url() + "%s?%s", "events/_search", String.join("&", queryParams));

    try (Response response =
        App.httpClient.newCall(new Request.Builder().url(url).build()).execute()) {

      return new ExceptionOr<List<Event>>(
          Converter.fromJsonString(response.body().string()).getHits().getHits().stream()
              .map(hit -> hit.getSource())
              .map(
                  src ->
                      Event.builder()
                          .city(Optional.of(src.getEventCity()))
                          .code(Optional.of(src.getEventCode()))
                          .country(Optional.of(src.getEventCountry()))
                          .eventSubtype(Optional.of(src.getEventSubtypeMoniker()))
                          .name(Optional.of(src.getEventName()))
                          .startDate(Optional.of(src.getDateStart()))
                          .stateProv(Optional.of(src.getEventStateprov()))
                          .venue(Optional.of(src.getEventVenue()))
                          .openCapacity(Optional.of(src.getOpenCapacity()))
                          .hqEventId(Optional.of(src.getId()))
                          .build())
              .collect(Collectors.toList()));
    } catch (IOException e) {
      return new ExceptionOr<>(e);
    }
  }
}
