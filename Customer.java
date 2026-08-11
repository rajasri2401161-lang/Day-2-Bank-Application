package Bank_Application;

public class Customer {
	private int customerId;
	private String customerName;
	private int age;
	private String gender;
	private long phoneNumber;
	private String emailId;
	
	public Customer(int customerId, String customerName, int age, String gender, long phoneNumber, String emailId) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public void displayCustomerDetails() {
	    System.out.println("Customer ID : " + customerId);
	    System.out.println("Name        : " + customerName);
	    System.out.println("Age         : " + age);
	    System.out.println("Gender      : " + gender);
	    System.out.println("Phone       : " + phoneNumber);
	    System.out.println("Email       : " + emailId);
	}
	

}
