package jlunk;

public class ExceptionOr<T> {
  private T value;
  private Exception exception;

  public ExceptionOr() {
    this(new Exception());
  }

  public ExceptionOr(Exception e) {
    this.exception = e;
    this.value = null;
  }

  public ExceptionOr(T value) {
    this.value = value;
    this.exception = null;
  }

  public T value() {
    if (ok()) {
      return value;
    }

    throw new IllegalStateException("Cannot access ExceptionOr::value when value is null!");
  }

  public T valueOr(T other) {
    return ok() ? value : other;
  }

  public boolean ok() {
    return value != null;
  }
}
