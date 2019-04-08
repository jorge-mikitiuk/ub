package ar.com.jnm;

import java.util.concurrent.Callable;

class True extends Boolean {

  @Override
  public Boolean and(Boolean b) {
    return b;
  }

  @Override
  public Boolean not() {
    return Boolean.FALSE;
  }

  @Override
  public Boolean or(Boolean b) {
    return this;
  }

  @Override
  public <T> T runWhenFalse(Callable<T> callable) throws Exception {
    return null;
  }

  @Override
  public <T> T runWhenTrue(Callable<T> callable) throws Exception {
    return callable.call();
  }

  @Override
  public String toString() {
    return "true";
  }

  @Override
  public Boolean xor(Boolean b) {
    return b.not();
  }
}
