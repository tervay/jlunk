package generated.es2022.eventTeams;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Event {
  @lombok.Getter(onMethod_ = {@JsonProperty("event_name")})
  @lombok.Setter(onMethod_ = {@JsonProperty("event_name")})
  private String eventName;

  @lombok.Getter(onMethod_ = {@JsonProperty("fk_team_profiles")})
  @lombok.Setter(onMethod_ = {@JsonProperty("fk_team_profiles")})
  private long fkTeamProfiles;

  @lombok.Getter(onMethod_ = {@JsonProperty("fk_events")})
  @lombok.Setter(onMethod_ = {@JsonProperty("fk_events")})
  private long fkEvents;

  @lombok.Getter(onMethod_ = {@JsonProperty("id")})
  @lombok.Setter(onMethod_ = {@JsonProperty("id")})
  private long id;

  @lombok.Getter(onMethod_ = {@JsonProperty("event_season")})
  @lombok.Setter(onMethod_ = {@JsonProperty("event_season")})
  private String eventSeason;
}
