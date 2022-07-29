package models;

import com.google.common.base.Optional;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Parameters {
  @Builder.Default private int size = 2000;
  @Builder.Default private int from = 0;
  @Builder.Default private String competitionType = "FRC";
  @Builder.Default private int season = 2022;

  @Builder.Default private Optional<List<Integer>> eventIds = Optional.absent();
}
