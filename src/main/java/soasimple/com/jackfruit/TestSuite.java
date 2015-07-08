package soasimple.com.jackfruit;

import java.util.Date;
import java.util.List;

public abstract class TestSuite {

	public abstract void prepareTests();
	public abstract List<Test> getTests();
	
	public TestReport runTests() {
		TestReport report = new TestReport();
		
		for (Test test : getTests()) {
			try {
				test.run();
				report.add(new TestResult(test.getTestName(), TestStatus.SUCESS));
			}
			catch (AssertionException aE) {
				Cause cause = new Cause(aE);
				report.add(new TestResult(test.getTestName(), TestStatus.FAILURE, cause));
			}
			catch (Throwable tE) {
				Cause cause = new Cause(tE);
				report.add(new TestResult(test.getTestName(), TestStatus.ERROR, cause));
			}
		}
		
		report.setEndDate(new Date());
		return report;
	}
}
