package error_exeption;

public class ObjectSameException extends Throwable{
	private static final long serialVersionUID = -5819228574375001706L;
	private String message;
	public ObjectSameException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
