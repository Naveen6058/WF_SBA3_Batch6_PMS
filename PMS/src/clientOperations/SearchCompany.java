package clientOperations;

public class SearchCompany 
{
	private String CompanyCode;
	private String Exchange;
	public SearchCompany(String companyCode, String exchange) {
		super();
		CompanyCode = companyCode;
		Exchange = exchange;
	}
	public String getCompanyCode() {
		return CompanyCode;
	}
	public void setCompanyCode(String companyCode) {
		CompanyCode = companyCode;
	}
	public String getExchange() {
		return Exchange;
	}
	public void setExchange(String exchange) {
		Exchange = exchange;
	}
	
	
}
