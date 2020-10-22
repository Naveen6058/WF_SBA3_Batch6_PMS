package borDuties;

public class CreateCompany 
{
	private String CompanyCode;
	private String CompanyTitle;
	private String Operations;
	private int ShareCount;
	private double sharePriceinUSD;
	private String Sector;
	private String Currency;
	private double Turnover;
	public CreateCompany(String companyCode, String companyTitle, String operations, int shareCount,
			double sharePriceinUSD, String sector, String currency, double turnover) {
		super();
		CompanyCode = companyCode;
		CompanyTitle = companyTitle;
		Operations = operations;
		ShareCount = shareCount;
		this.sharePriceinUSD = sharePriceinUSD;
		Sector = sector;
		Currency = currency;
		Turnover = turnover;
	}
	public String getCompanyCode() {
		return CompanyCode;
	}
	public void setCompanyCode(String companyCode) {
		CompanyCode = companyCode;
	}
	public String getCompanyTitle() {
		return CompanyTitle;
	}
	public void setCompanyTitle(String companyTitle) {
		CompanyTitle = companyTitle;
	}
	public String getOperations() {
		return Operations;
	}
	public void setOperations(String operations) {
		Operations = operations;
	}
	public int getShareCount() {
		return ShareCount;
	}
	public void setShareCount(int shareCount) {
		ShareCount = shareCount;
	}
	public double getSharePriceinUSD() {
		return sharePriceinUSD;
	}
	public void setSharePriceinUSD(double sharePriceinUSD) {
		this.sharePriceinUSD = sharePriceinUSD;
	}
	public String getSector() {
		return Sector;
	}
	public void setSector(String sector) {
		Sector = sector;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public double getTurnover() {
		return Turnover;
	}
	public void setTurnover(double turnover) {
		Turnover = turnover;
	}
	
	
}
