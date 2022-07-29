package models;

import java.util.List;
import jlunk.ExceptionOr;

public abstract class DataSource<GenericData extends DataType> {
  protected DataOrigin origin;

  public DataSource(DataOrigin origin) {
    this.origin = origin;
  }

  public abstract ExceptionOr<List<GenericData>> fetch(Parameters parameters);
}
