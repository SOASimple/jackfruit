package soasimple.com.jackfruit;

import java.util.Date;
import java.util.ArrayList;

public class TestReport extends ArrayList<TestResult>{

	private Date startDate;
	private Date endDate;
	
	public TestReport() {
		setStartDate(new Date());
	}

	public Date getStartDate() {
		return startDate;
	}

	void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
