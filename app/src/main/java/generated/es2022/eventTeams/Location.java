package generated.es2022.eventTeams;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Location {
  @lombok.Getter(onMethod_ = {@JsonProperty("lon")})
  @lombok.Setter(onMethod_ = {@JsonProperty("lon")})
  private double lon;

  @lombok.Getter(onMethod_ = {@JsonProperty("lat")})
  @lombok.Setter(onMethod_ = {@JsonProperty("lat")})
  private double lat;
}
