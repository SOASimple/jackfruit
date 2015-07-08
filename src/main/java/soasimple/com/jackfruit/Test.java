package soasimple.com.jackfruit;

/**
 * An implementation of this interface contains a single test
 * which emits events to the TODO test result collector.
 * Implementations will be created by a TestSuite which is responsible for
 * collating the tests, creating Test instances and calling run().
 * @author roy
 *
 */
public interface Test {
	/**
	 * The run() methods implements the execution of the actual test.
	 */
	public void run();
	
	public String getTestName();
}
