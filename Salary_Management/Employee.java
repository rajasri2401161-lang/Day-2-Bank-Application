package Salary_Management;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private int experience;
	private double basicSalary;
	
	public Employee(int employeeId, String employeeName, int experience, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.experience = experience;
		this.basicSalary = basicSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee Id   : "+this.employeeId);
		System.out.println("Employee Name : "+this.employeeName);
		System.out.println("Experience    : "+this.experience);
		System.out.println("Basic Salary  : "+this.basicSalary);
	}
	
}
