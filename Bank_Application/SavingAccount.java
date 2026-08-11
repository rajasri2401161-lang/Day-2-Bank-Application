package Bank_Application;

public class SavingAccount extends Account{
	
	private double minimumBalance;
	
	public SavingAccount(long accountNumber,String accountHolderName, double minimumBalance) {
		super(accountNumber,accountHolderName);
		this.minimumBalance = minimumBalance;
	}
	
	@Override
	public void withdraw(double amount) {
		if(getBalance()-amount>=minimumBalance) {
			super.withdraw(amount);
		}
		else {
			System.out.println("Withdraw denied !");
			System.out.println("Minimum balance of "+this.minimumBalance+"should maintained");
		}
	}
}
