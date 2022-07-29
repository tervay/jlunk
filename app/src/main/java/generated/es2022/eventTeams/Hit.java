package generated.es2022.eventTeams;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

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
  private Object score;

  @lombok.Getter(onMethod_ = {@JsonProperty("_source")})
  @lombok.Setter(onMethod_ = {@JsonProperty("_source")})
  private Source source;

  @lombok.Getter(onMethod_ = {@JsonProperty("sort")})
  @lombok.Setter(onMethod_ = {@JsonProperty("sort")})
  private List<Long> sort;
}
