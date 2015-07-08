package soasimple.com.jackfruit;

class StackTraceElement {
	private String className;
	private String methodName;
	private int    lineNumber;
	
	StackTraceElement(String className, String methodName, int lineNumber) {
		setClassName(className);
		setMethodName(methodName);
		setLineNumber(lineNumber);
	}
	
	public String getClassName() {
		return className;
	}
	void setClassName(String className) {
		this.className = className;
	}
	public String getMethodName() {
		return methodName;
	}
	void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
}