package Default;

public class DefaultPageResponse {
	private String message;
	private String h2message;
	private String postmanString;

	public DefaultPageResponse(String message, String h2message, String postmanString) {
		super();
		this.message = message;
		this.h2message = h2message;
		this.postmanString = postmanString;
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

	public String getPostmanString() {
		return postmanString;
	}

	public void setPostmanString(String postmanString) {
		this.postmanString = postmanString;
	}

	@Override
	public String toString() {
		return "DefaultPageResponse [message=" + message + ", h2message=" + h2message + ", postmanString="
				+ postmanString + "]";
	}

}
