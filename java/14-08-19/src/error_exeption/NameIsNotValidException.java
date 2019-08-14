package error_exeption;

public class NameIsNotValidException extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5819228574375001706L;
	private String message;
	public NameIsNotValidException(String message) {
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
