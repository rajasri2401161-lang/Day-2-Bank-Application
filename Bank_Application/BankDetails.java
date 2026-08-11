package Bank_Application;

public class BankDetails {
	
	private String bankName;
	private String branchName;
	
	public BankDetails() {
		this.bankName = "SBI";
		this.branchName = "Coimbatore";
	}

	public String getBankName() {
		return bankName;
	}


	public String getBranchName() {
		return branchName;
	}

}
