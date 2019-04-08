package ar.com.jnm;

import java.util.concurrent.Callable;

class False extends Boolean {

  @Override
  public Boolean and(Boolean b) {
    return this;
  }

  @Override
  public Boolean not() {
    return Boolean.TRUE;
  }

  @Override
  public Boolean or(Boolean b) {
    return b;
  }

  @Override
  public <T> T runWhenFalse(Callable<T> callable) throws Exception {
    return callable.call();
  }

  @Override
  public <T> T runWhenTrue(Callable<T> callable) throws Exception {
    return null;
  }

  @Override
  public String toString() {
    return "false";
  }

  @Override
  public Boolean xor(Boolean b) {
    return b;
  }

}
