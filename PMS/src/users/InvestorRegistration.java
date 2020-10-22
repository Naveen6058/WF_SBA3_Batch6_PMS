package users;

public class InvestorRegistration 
{
	private String userid;
	private String password;
	private String PAN;
	private double InitialAmount;
	private String Currency;
	
		public InvestorRegistration(String userid, String password, String pAN, double initialAmount, String currency) {
		super();
		this.userid = userid;
		this.password = password;
		PAN = pAN;
		InitialAmount = initialAmount;
		Currency = currency;
	}
		
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public double getInitialAmount() {
		return InitialAmount;
	}
	public void setInitialAmount(double initialAmount) {
		InitialAmount = initialAmount;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
}
