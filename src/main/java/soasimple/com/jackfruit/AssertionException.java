package soasimple.com.jackfruit;

public class AssertionException extends RuntimeException {

	public AssertionException(String message) {
		super(message);
	}


	public AssertionException(String message, Throwable cause) {
		super(message, cause);
	}
}