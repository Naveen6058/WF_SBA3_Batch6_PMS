package borDuties;

public class CreateCommodity {
	private String CommodityName;
	private double CommodityPrice;
	private String Currency;
	public CreateCommodity(String commodityName, double commodityPrice, String currency) {
		super();
		CommodityName = commodityName;
		CommodityPrice = commodityPrice;
		Currency = currency;
	}
	public String getCommodityName() {
		return CommodityName;
	}
	public void setCommodityName(String commodityName) {
		CommodityName = commodityName;
	}
	public double getCommodityPrice() {
		return CommodityPrice;
	}
	public void setCommodityPrice(double commodityPrice) {
		CommodityPrice = commodityPrice;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	
	

}
