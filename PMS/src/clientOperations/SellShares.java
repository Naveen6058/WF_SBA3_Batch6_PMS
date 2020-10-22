package clientOperations;

import java.util.Date;

public class SellShares 
{
	private String CompanyCode;
	private String Currency;
	private String StockExchange;
	private int stockCount;
	private double walletAmount;
	public SellShares(String companyCode, String currency, String stockExchange, int stockCount, double walletAmount) {
		super();
		CompanyCode = companyCode;
		Currency = currency;
		StockExchange = stockExchange;
		this.stockCount = stockCount;
		this.walletAmount = walletAmount;
	}
	public String getCompanyCode() {
		return CompanyCode;
	}
	public void setCompanyCode(String companyCode) {
		CompanyCode = companyCode;
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
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	public double getWalletAmount() {
		return walletAmount;
	}
	public void setWalletAmount(double walletAmount) {
		this.walletAmount = walletAmount;
	}
	
	
}
