/* (C)2022 */
package generated.es2022.events;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Total {
  @lombok.Getter(onMethod_ = {@JsonProperty("value")})
  @lombok.Setter(onMethod_ = {@JsonProperty("value")})
  private long value;

  @lombok.Getter(onMethod_ = {@JsonProperty("relation")})
  @lombok.Setter(onMethod_ = {@JsonProperty("relation")})
  private String relation;
}
