package ar.com.jnm.project13.exceptions;

public class ValueNotSupportedException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public ValueNotSupportedException(String msg) {
		super(msg);
	}

}
