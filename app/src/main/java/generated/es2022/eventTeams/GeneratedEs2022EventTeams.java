package generated.es2022.eventTeams;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class GeneratedEs2022EventTeams {
  @lombok.Getter(onMethod_ = {@JsonProperty("took")})
  @lombok.Setter(onMethod_ = {@JsonProperty("took")})
  private long took;

  @lombok.Getter(onMethod_ = {@JsonProperty("timed_out")})
  @lombok.Setter(onMethod_ = {@JsonProperty("timed_out")})
  private boolean timedOut;

  @lombok.Getter(onMethod_ = {@JsonProperty("_shards")})
  @lombok.Setter(onMethod_ = {@JsonProperty("_shards")})
  private Shards shards;

  @lombok.Getter(onMethod_ = {@JsonProperty("hits")})
  @lombok.Setter(onMethod_ = {@JsonProperty("hits")})
  private Hits hits;
}
