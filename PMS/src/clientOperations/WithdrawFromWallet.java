package clientOperations;

public class WithdrawFromWallet {
	private double DepositAmount;
	private double Total;
	public WithdrawFromWallet(double depositAmount, double total) {
		super();
		DepositAmount = depositAmount;
		Total = total;
	}
	public double getDepositAmount() {
		return DepositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		DepositAmount = depositAmount;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	
	
}
