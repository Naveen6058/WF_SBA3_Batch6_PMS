package borDuties;

import java.util.Date;

public class AddStockPrices 
{
	private String CompanyCode;
	private double stockPrice;
	private String Currency;
	private String StockExchange;
	private double currentPriceinUSD;
	private Date introductoryDate;
	private Date currentTime;
		
	public AddStockPrices(String companyCode, double stockPrice, String currency, String stockExchange,
			double currentPriceinUSD, Date introductoryDate, Date currentTime) {
		super();
		CompanyCode = companyCode;
		this.stockPrice = stockPrice;
		Currency = currency;
		StockExchange = stockExchange;
		this.currentPriceinUSD = currentPriceinUSD;
		this.introductoryDate = introductoryDate;
		this.currentTime = currentTime;
	}

	public String getCompanyCode() {
		return CompanyCode;
	}

	public void setCompanyCode(String companyCode) {
		CompanyCode = companyCode;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getStockExchange() {
		return StockExchange;
	}

	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}

	public double getCurrentPriceinUSD() {
		return currentPriceinUSD;
	}

	public void setCurrentPriceinUSD(double currentPriceinUSD) {
		this.currentPriceinUSD = currentPriceinUSD;
	}

	public Date getIntroductoryDate() {
		return introductoryDate;
	}

	public void setIntroductoryDate(Date introductoryDate) {
		this.introductoryDate = introductoryDate;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}
	
	
}
