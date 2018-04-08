package ar.com.jnm.project13.exceptions;

public class AgeOutOfRangeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AgeOutOfRangeException() {
		super("Age must be in the range [0 - 130]");
	}
}
