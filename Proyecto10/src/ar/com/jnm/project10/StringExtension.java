package ar.com.jnm.project10;

public class StringExtension {

	private String target;

	public StringExtension(String target) {
		setTarget(target);
	}
	
	public StringExtension firstToEnd(String substring) {
		int since=indexOf(substring);
		if(notFound(since)) {
			return new StringExtension("");
		}
		return new StringExtension(getTarget().substring(since + substring.length()));
	}

	public String getTarget() {
		return target;
	}
	
	private int indexOf(String substring) {
		return getTarget().indexOf(substring);
	}

	private int lastIndexOf(String substring) {
		return getTarget().lastIndexOf(substring);
	}
	
	public StringExtension lastToEnd(String substring) {
		int since=lastIndexOf(substring);
		if(notFound(since)) {
			return new StringExtension("");
		}
		return new StringExtension(getTarget().substring(since + substring.length()));
	}

	private boolean notFound(int position) {
		return position == -1;
	}

	private void setTarget(String target) {
		this.target = target;
	}
	
	public StringExtension startToFirst(String substring) {
		int since=indexOf(substring);
		if(notFound(since)) {
			return this;
		}
		return new StringExtension(getTarget().substring(0,since));
	}
	
	
	
	
	public StringExtension startToLast(String substring) {
		int since=lastIndexOf(substring);
		if(notFound(since)) {
			return this;
		}
		return new StringExtension(getTarget().substring(0,since));
	}

	public StringExtension subtring(String from, String to) {
		return startToLast(to).firstToEnd(from);
	}
	
	
	
	@Override
	public String toString() {
		return getTarget();
	}
}
