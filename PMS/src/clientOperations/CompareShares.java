package clientOperations;

import java.util.List;
import java.util.Map;

public class CompareShares {
	private Map Companies;
	private String Sector;
	
	public void compareShareValues(List companies)
	{
		
	}

	public CompareShares(Map companies, String sector) {
		super();
		Companies = companies;
		Sector = sector;
	}

	public Map getCompanies() {
		return Companies;
	}

	public void setCompanies(Map companies) {
		Companies = companies;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}
	
	
}
