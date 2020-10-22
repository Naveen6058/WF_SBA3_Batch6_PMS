package clientOperations;

public class SelectCurrency {
	private String Currency;
	private String StockExchange;
	public SelectCurrency(String currency, String stockExchange) {
		super();
		Currency = currency;
		StockExchange = stockExchange;
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
	
	
}
