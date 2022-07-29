/* (C)2022 */
package generated.es2022.events;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Hit {
  @lombok.Getter(onMethod_ = {@JsonProperty("_index")})
  @lombok.Setter(onMethod_ = {@JsonProperty("_index")})
  private String index;

  @lombok.Getter(onMethod_ = {@JsonProperty("_type")})
  @lombok.Setter(onMethod_ = {@JsonProperty("_type")})
  private String type;

  @lombok.Getter(onMethod_ = {@JsonProperty("_id")})
  @lombok.Setter(onMethod_ = {@JsonProperty("_id")})
  private String id;

  @lombok.Getter(onMethod_ = {@JsonProperty("_score")})
  @lombok.Setter(onMethod_ = {@JsonProperty("_score")})
  private double score;

  @lombok.Getter(onMethod_ = {@JsonProperty("_source")})
  @lombok.Setter(onMethod_ = {@JsonProperty("_source")})
  private Source source;
}
