package Default;

public class DefaultPageResponse {
	private String message;
	private String h2message;

	public DefaultPageResponse(String message, String h2message) {
		super();
		this.message = message;
		this.h2message = h2message;
	}

	@Override
	public String toString() {
		return "DefaultPageResponse [message=" + message + ", h2message=" + h2message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getH2message() {
		return h2message;
	}

	public void setH2message(String h2message) {
		this.h2message = h2message;
	}

}
