package generated.es2022.eventTeams;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Hits {
  @lombok.Getter(onMethod_ = {@JsonProperty("total")})
  @lombok.Setter(onMethod_ = {@JsonProperty("total")})
  private Total total;

  @lombok.Getter(onMethod_ = {@JsonProperty("max_score")})
  @lombok.Setter(onMethod_ = {@JsonProperty("max_score")})
  private Object maxScore;

  @lombok.Getter(onMethod_ = {@JsonProperty("hits")})
  @lombok.Setter(onMethod_ = {@JsonProperty("hits")})
  private List<Hit> hits;
}
