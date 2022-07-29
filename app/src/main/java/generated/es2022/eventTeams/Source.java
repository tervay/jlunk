package generated.es2022.eventTeams;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Source {
  @lombok.Getter(onMethod_ = {@JsonProperty("team_name_calc")})
  @lombok.Setter(onMethod_ = {@JsonProperty("team_name_calc")})
  private String teamNameCalc;

  @lombok.Getter(onMethod_ = {@JsonProperty("team_stateprov")})
  @lombok.Setter(onMethod_ = {@JsonProperty("team_stateprov")})
  private String teamStateprov;

  @lombok.Getter(onMethod_ = {@JsonProperty("team_country")})
  @lombok.Setter(onMethod_ = {@JsonProperty("team_country")})
  private String teamCountry;

  @lombok.Getter(onMethod_ = {@JsonProperty("fk_program_seasons")})
  @lombok.Setter(onMethod_ = {@JsonProperty("fk_program_seasons")})
  private long fkProgramSeasons;

  @lombok.Getter(onMethod_ = {@JsonProperty("program_code_display")})
  @lombok.Setter(onMethod_ = {@JsonProperty("program_code_display")})
  private String programCodeDisplay;

  @lombok.Getter(onMethod_ = {@JsonProperty("profile_year")})
  @lombok.Setter(onMethod_ = {@JsonProperty("profile_year")})
  private long profileYear;

  @lombok.Getter(onMethod_ = {@JsonProperty("program_name")})
  @lombok.Setter(onMethod_ = {@JsonProperty("program_name")})
  private String programName;

  @lombok.Getter(onMethod_ = {@JsonProperty("team_nickname")})
  @lombok.Setter(onMethod_ = {@JsonProperty("team_nickname")})
  private String teamNickname;

  @lombok.Getter(onMethod_ = {@JsonProperty("team_city")})
  @lombok.Setter(onMethod_ = {@JsonProperty("team_city")})
  private String teamCity;

  @lombok.Getter(onMethod_ = {@JsonProperty("team_rookieyear")})
  @lombok.Setter(onMethod_ = {@JsonProperty("team_rookieyear")})
  private long teamRookieyear;

  @lombok.Getter(onMethod_ = {@JsonProperty("team_web_url")})
  @lombok.Setter(onMethod_ = {@JsonProperty("team_web_url")})
  private String teamWebUrl;

  @lombok.Getter(onMethod_ = {@JsonProperty("countryCode")})
  @lombok.Setter(onMethod_ = {@JsonProperty("countryCode")})
  private String countryCode;

  @lombok.Getter(onMethod_ = {@JsonProperty("team_number_yearly")})
  @lombok.Setter(onMethod_ = {@JsonProperty("team_number_yearly")})
  private long teamNumberYearly;

  @lombok.Getter(onMethod_ = {@JsonProperty("team_postalcode")})
  @lombok.Setter(onMethod_ = {@JsonProperty("team_postalcode")})
  private String teamPostalcode;

  @lombok.Getter(onMethod_ = {@JsonProperty("team_type")})
  @lombok.Setter(onMethod_ = {@JsonProperty("team_type")})
  private String teamType;

  @lombok.Getter(onMethod_ = {@JsonProperty("location")})
  @lombok.Setter(onMethod_ = {@JsonProperty("location")})
  private List<Location> location;

  @lombok.Getter(onMethod_ = {@JsonProperty("id")})
  @lombok.Setter(onMethod_ = {@JsonProperty("id")})
  private long id;

  @lombok.Getter(onMethod_ = {@JsonProperty("events")})
  @lombok.Setter(onMethod_ = {@JsonProperty("events")})
  private List<Event> events;
}
