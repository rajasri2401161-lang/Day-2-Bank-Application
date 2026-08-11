package Bank_Application;

public class Account {
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	public Account(long accountNumber, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 0;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void displayAccountDetails() {
	    System.out.println("Account Number        : " + accountNumber);
	    System.out.println("Account Holder Name   : " + accountHolderName);
	    System.out.println("Account Balance       : " + balance);

	}
	
	
}
