package models.db;

import com.google.common.base.Optional;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import models.DataType;

@SuperBuilder
@Getter
@ToString
public class Event extends DataType {
  @Builder.Default private Optional<String> city = Optional.absent();
  @Builder.Default private Optional<String> code = Optional.absent();
  @Builder.Default private Optional<String> country = Optional.absent();
  @Builder.Default private Optional<String> eventSubtype = Optional.absent();
  @Builder.Default private Optional<String> name = Optional.absent();
  @Builder.Default private Optional<String> startDate = Optional.absent();
  @Builder.Default private Optional<String> stateProv = Optional.absent();
  @Builder.Default private Optional<String> venue = Optional.absent();

  @Builder.Default private Optional<Long> openCapacity = Optional.absent();
  @Builder.Default private Optional<Long> hqEventId = Optional.absent();

  @Override
  public void save() {}
}
