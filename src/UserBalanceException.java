
@SuppressWarnings("serial")
public class UserBalanceException extends Exception {
	private String reason;
	
	public UserBalanceException(String reason) {
		this.reason = reason;
	}
	
	public String getReason() {
		return this.reason;
	}
}
