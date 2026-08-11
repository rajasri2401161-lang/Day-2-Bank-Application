package Bank_Application;
import java.util.*;

public class BankApplication {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		BankDetails bank = new BankDetails();
		Customer customer = null;
		SavingAccount account = null;
		
		int choice;
		displayWelcome(bank);
		
		do {
			displayMenu();
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				customer = createCustomer();
				account = createSavingsAccount(customer);
				System.out.println("\n Account created successfully!");
				break;
			case 2:
				login(account);
				break;
			case 3:
				if(account != null) {
					depositMoney(account);
				}
				else {
					System.out.println("\n Please create an account first");
				}
				break;
			case 4:
				if(account != null) {
					withdrawMoney(account);
				}
				else {
					System.out.println("\n Please create an account first");
				}
				break;
			case 5:
				if(account != null) {
					checkBalance(account);
				}
				else {
					System.out.println("\n Please create an account first");
				}
				break;
			case 6:
				if(account != null) {
					displayCustomerDetails(customer);
				}
				else {
					System.out.println("\n Please create an account first");
				}
				break;
			case 7:
				System.out.println("\nThank you!");
				break;
			default:
				System.out.println("\n Invalid choice Please try again!");
			}
		}while(choice != 7);
	}
		
		public static void displayWelcome(BankDetails Bank) {
			System.out.println("\nWelcome To "+Bank.getBankName()+","+Bank.getBranchName());
		}
		public static void displayMenu() {
			System.out.println("\n1.Create Account");
			System.out.println("\n2.Login");
			System.out.println("\n3.Deposit");
			System.out.println("\n4.Withdraw");
			System.out.println("\n5.Check Balance");
            System.out.println("\n6.Display Customer Details");
            System.out.println("\n7.Exit");
		}
		public static Customer createCustomer() {
			System.out.print("Enter Customer ID: "); 
			int customerId = sc.nextInt();
			sc.nextLine(); 
			System.out.print("Enter Name: "); 
			String customerName = sc.nextLine(); 
			System.out.print("Enter Age: "); 
			int age = sc.nextInt(); 
			sc.nextLine(); 
			System.out.print("Enter Gender: "); 
			String gender = sc.nextLine();
			System.out.print("Enter Phone Number: ");
			long phoneNumber = sc.nextLong(); 
			sc.nextLine(); 
			System.out.print("Enter Email ID: "); 
			String emailId = sc.nextLine(); 
			return new Customer( customerId, customerName, age, gender, phoneNumber, emailId );
		}		
		
		public static SavingAccount createSavingsAccount(Customer customer) {

		    System.out.print("Enter Account Number: ");
		    long accountNumber = sc.nextLong();

		    System.out.print("Enter Minimum Balance: ");
		    double minimumBalance = sc.nextDouble();

		    return new SavingAccount(
		            accountNumber,
		            customer.getCustomerName(),
		            minimumBalance
		    );
		}


		public static void login(SavingAccount account) {

		    if (account == null) {
		        System.out.println("\nPlease create an account first.");
		        return;
		    }

		    System.out.print("\nEnter Account Number: ");
		    long accountNumber = sc.nextLong();

		    if (account.getAccountNumber() == accountNumber) {
		        System.out.println("Login successful!");
		    } else {
		        System.out.println("Invalid Account Number.");
		    }
		}


		public static void depositMoney(SavingAccount account) {

		    System.out.print("\nEnter amount to deposit: ");
		    double amount = sc.nextDouble();

		    if (amount > 0) {
		        account.deposit(amount);

		        System.out.println("Amount deposited successfully.");
		        System.out.println("Current Balance: " + account.getBalance());
		    } else {
		        System.out.println("Invalid amount.");
		    }
		}

		public static void withdrawMoney(SavingAccount account) {

		    System.out.print("\nEnter amount to withdraw: ");
		    double amount = sc.nextDouble();

		    if (amount > 0) {
		        account.withdraw(amount);
		        System.out.println("Amount withdrawed successfully!");
		    } else {
		        System.out.println("Invalid amount.");
		    }
		}

		public static void checkBalance(SavingAccount account) {
		    System.out.println("Available Balance: " + account.getBalance());
		}

		public static void displayCustomerDetails(Customer customer) {
		    System.out.println("Customer ID : " + customer.getCustomerId());
		    System.out.println("Name        : " + customer.getCustomerName());
		    System.out.println("Age         : " + customer.getAge());
		    System.out.println("Gender      : " + customer.getGender());
		    System.out.println("Phone       : " + customer.getPhoneNumber());
		    System.out.println("Email       : " + customer.getEmailId());
		}


	

}
