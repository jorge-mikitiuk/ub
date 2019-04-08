package ar.com.jnm;

import java.util.concurrent.Callable;

public abstract class Boolean {

  public final static Boolean FALSE = new False();

  public final static Boolean TRUE = new True();

  public abstract Boolean and(Boolean b);

  public abstract Boolean not();

  public abstract Boolean or(Boolean b);

  public abstract <T> T runWhenFalse(Callable<T> callable) throws Exception;

  public abstract <T> T runWhenTrue(Callable<T> callable) throws Exception;

  public abstract Boolean xor(Boolean b);
}
