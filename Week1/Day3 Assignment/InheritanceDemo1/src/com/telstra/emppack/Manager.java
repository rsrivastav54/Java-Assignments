package com.telstra.emppack;

// Manager IS-A employee
public class Manager extends Employee {

	private String deptName;
	private int empCount;

	public Manager(int empId, String empName, int bSal, String deptName, int empCount) {
		super(empId, empName, bSal); // one level higher constructor
		this.deptName = deptName;
		this.empCount = empCount;
	}

	// constructor chaining super()
	@Override
	public String getDetails() { // function overriding
		return (super.getDetails() + " " + deptName + " " + empCount);
	}

	public String getDeptName() {
		return deptName;
	}

	public int getEmpCount() {
		return empCount;
	}

	@Override
	public double getTax() {
		double tax = 0;
		if (getDeptName() == "IT") {
			tax = bSal * 0.10 * (0.25 * getEmpCount());
		} else if (getDeptName() == "HR") {
			tax = bSal * 0.15 * (0.25 * getEmpCount());
		} else if (getDeptName() == "Sales") {
			tax = bSal * 0.20 * (0.25 * getEmpCount());
		} else {
			tax = bSal * 0.05 * (0.25 * getEmpCount());
		}
		return tax;
	}
	
	@Override
	public double getPremium() {
		double premium = 0;
		if (getDeptName() == "IT") {
			premium = bSal * 0.10;
		} else if (getDeptName() == "HR") {
			premium = bSal * 0.15;
		} else if (getDeptName() == "Sales") {
			premium = bSal * 0.20;
		} else {
			premium = bSal * 0.05;
		}
		return premium;
	}

}
