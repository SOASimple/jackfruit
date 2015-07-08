package soasimple.com.jackfruit;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Cause extends ArrayList<StackTraceElement> {
	private Cause                   cause;
	private String                  message;
	
	Cause(Throwable exception) {
		setMessage(exception.getMessage());
		for (int i = 0; i < exception.getStackTrace().length; i++) {
			this.add(new StackTraceElement(exception.getStackTrace()[i].getClassName(),
										   exception.getStackTrace()[i].getMethodName(),
										   exception.getStackTrace()[i].getLineNumber()));
		}
		
		if (exception.getCause() != null) {
			setCause(new Cause(exception.getCause()));
		}
	}
	
	public Cause getCause() {
		return cause;
	}
	void setCause(Cause cause) {
		this.cause = cause;
	}
	public String getMessage() {
		return message;
	}
	void setMessage(String message) {
		this.message = message;
	}
}