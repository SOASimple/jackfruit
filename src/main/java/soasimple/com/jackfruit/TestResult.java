package soasimple.com.jackfruit;

public class TestResult {
	
	private String     testName;
	private TestStatus testStatus;
	private Cause      cause;
	
	TestResult(String testName, TestStatus testStatus) {
		setTestName(testName);
		setTestStatus(testStatus);
	}
	
	TestResult(String testName, TestStatus testStatus, Cause cause) {
		this(testName, testStatus);
		setCause(cause);
	}
	
	public String getTestName() {
		return this.testName;
	}
	
	void setTestName(String testName) {
		this.testName = testName;
	}
	
	public TestStatus getTestStatus() {
		return this.testStatus;
	}
	
	void setTestStatus(TestStatus testStatus) {
		this.testStatus = testStatus;
	}
	
	public Cause getCause() {
		return this.cause;
	}
	
	void setCause(Cause cause) {
		this.cause = cause;
	}
}