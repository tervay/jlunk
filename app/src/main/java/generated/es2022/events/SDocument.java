/* (C)2022 */
package generated.es2022.events;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SDocument {
  @lombok.Getter(onMethod_ = {@JsonProperty("name")})
  @lombok.Setter(onMethod_ = {@JsonProperty("name")})
  private String name;

  @lombok.Getter(onMethod_ = {@JsonProperty("uRL")})
  @lombok.Setter(onMethod_ = {@JsonProperty("uRL")})
  private String uRl;
}
