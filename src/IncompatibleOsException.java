
@SuppressWarnings("serial")
public class IncompatibleOsException extends Exception {
	private String reason;

	public IncompatibleOsException(String reason) {
		this.reason = reason;
	}

	public String getReason() {
		return this.reason;
	}
}
