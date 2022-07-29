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
public class RegisteredTeam extends DataType {
  @Builder.Default private Optional<String> fullName = Optional.absent();
  @Builder.Default private Optional<String> stateProv = Optional.absent();
  @Builder.Default private Optional<String> country = Optional.absent();
  @Builder.Default private Optional<String> city = Optional.absent();
  @Builder.Default private Optional<String> programCode = Optional.absent();
  @Builder.Default private Optional<String> programName = Optional.absent();
  @Builder.Default private Optional<String> nickname = Optional.absent();
  @Builder.Default private Optional<String> websiteUrl = Optional.absent();
  @Builder.Default private Optional<String> countryCode = Optional.absent();
  @Builder.Default private Optional<String> postalCode = Optional.absent();
  @Builder.Default private Optional<String> teamType = Optional.absent();
  @Builder.Default private Optional<Long> programSeason = Optional.absent();
  @Builder.Default private Optional<Long> profileYear = Optional.absent();
  @Builder.Default private Optional<Long> rookieYear = Optional.absent();
  @Builder.Default private Optional<Long> teamNumber = Optional.absent();
  @Builder.Default private Optional<Long> hqTeamId = Optional.absent();

  @Override
  public void save() {}
}
