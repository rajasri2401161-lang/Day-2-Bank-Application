package Bank_Application;

public class CurrentAccount extends Account{
	
	private double overdraftLimit;
	
	public CurrentAccount(long accountNumber , String accountHolderName, double overdraftLimit) {
		super(accountNumber,accountHolderName);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if(getBalance()+overdraftLimit >= amount) {
			super.withdraw(amount);
		}
		else {
			System.out.println("Withdraw denied");
			System.out.println("overdraft limit"+this.overdraftLimit+"is exceeded");
		}
	}
}
