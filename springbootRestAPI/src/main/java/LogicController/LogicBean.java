package LogicController;

public class LogicBean {
	private String message;

	public LogicBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LogicBean [message=" + message + "]";
	}

}
