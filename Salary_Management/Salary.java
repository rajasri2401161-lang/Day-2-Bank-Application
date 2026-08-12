package Salary_Management;

public class Salary {
	private double experienceBonus;
	private double hrExpense;
	private double tlExpense;
	private double otherExpense;
	private double grossSalary;
	private double finalSalary;
	
	public Salary( double hrExpense, double tlExpense, double otherExpense) {
		this.hrExpense = hrExpense;
		this.tlExpense = tlExpense;
		this.otherExpense = otherExpense;
	}

	public double getExperienceBonus() {
		return experienceBonus;
	}

	public double getHrExpense() {
		return hrExpense;
	}

	public void setHrExpense(double hrExpense) {
		this.hrExpense = hrExpense;
	}

	public double getTlExpense() {
		return tlExpense;
	}

	public void setTlExpense(double tlExpense) {
		this.tlExpense = tlExpense;
	}

	public double getOtherExpense() {
		return otherExpense;
	}

	public void setOtherExpense(double otherExpense) {
		this.otherExpense = otherExpense;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public double getFinalSalary() {
		return finalSalary;
	}
	
	public double calculateExperienceBonus(Employee employee) {
		experienceBonus = employee.getExperience()*1000;
		return experienceBonus;
	}
	public double calculateGrossSalary(Employee employee) {
		grossSalary = employee.getBasicSalary() + calculateExperienceBonus(employee); 
		return grossSalary;
	}
	public double calculateTotalExpence(Employee employee) {
		return hrExpense+tlExpense+otherExpense;
	}
	public double calculateFinalSalary(Employee employee) {
		finalSalary = calculateGrossSalary(employee)-calculateTotalExpence(employee);
		return finalSalary;
	}
	public void displaySalaryDetails(Employee employee) {
		System.out.println("Basic salary       : "+employee.getBasicSalary());
		System.out.println("Experience bonous  : "+calculateExperienceBonus(employee));
		System.out.println("Gross Salary       : "+calculateGrossSalary(employee));
		System.out.println("HR Expence         : "+hrExpense);
		System.out.println("TL Expence         : "+tlExpense);
		System.out.println("Other Expence      : "+otherExpense);
		System.out.println("Total Expence      : "+calculateTotalExpence(employee));
		System.out.println("Final Salary       : "+calculateFinalSalary(employee));
	}

}
