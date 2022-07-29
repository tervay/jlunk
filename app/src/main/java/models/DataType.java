package models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public abstract class DataType implements Saveable {
  DataOrigin origin;
}
