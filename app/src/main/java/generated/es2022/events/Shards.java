/* (C)2022 */
package generated.es2022.events;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Shards {
  @lombok.Getter(onMethod_ = {@JsonProperty("total")})
  @lombok.Setter(onMethod_ = {@JsonProperty("total")})
  private long total;

  @lombok.Getter(onMethod_ = {@JsonProperty("successful")})
  @lombok.Setter(onMethod_ = {@JsonProperty("successful")})
  private long successful;

  @lombok.Getter(onMethod_ = {@JsonProperty("skipped")})
  @lombok.Setter(onMethod_ = {@JsonProperty("skipped")})
  private long skipped;

  @lombok.Getter(onMethod_ = {@JsonProperty("failed")})
  @lombok.Setter(onMethod_ = {@JsonProperty("failed")})
  private long failed;
}
