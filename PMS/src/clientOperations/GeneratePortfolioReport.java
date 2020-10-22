package clientOperations;

import java.util.Date;

public class GeneratePortfolioReport {
	private Date startDate;
	private Date endDate;
	private String TimePeriod;
	public GeneratePortfolioReport(Date startDate, Date endDate, String timePeriod) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		TimePeriod = timePeriod;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getTimePeriod() {
		return TimePeriod;
	}
	public void setTimePeriod(String timePeriod) {
		TimePeriod = timePeriod;
	}
	
}
