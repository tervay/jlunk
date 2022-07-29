package models.db;

import com.google.common.base.Optional;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import models.DataType;

@SuperBuilder
@Getter
@ToString
public class EventTeams extends DataType {

  @Builder.Default private Optional<List<RegisteredTeam>> teams = Optional.absent();

  @Override
  public void save() {}
}
