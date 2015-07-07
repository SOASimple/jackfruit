package soasimple.com.jackfruit;

/**
 * A ResultHandler is responsible for handling events emitted by
 * Test implementations and building TestReports containing TestResults.
 * @author roy
 *
 */
public interface ResultHandler {
	public void testStarted(String testName);
	public void testFailed(String testName, Throwable exception);
	public void testError(String testName, Throwable exception);
}
