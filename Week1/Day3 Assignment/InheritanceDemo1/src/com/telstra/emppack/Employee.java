package com.telstra.emppack;

public class Employee {

	// access and visibility for derived classes and within the package
	protected int empId;
	protected String empName;
	protected int bSal;

	public Employee(int empId, String empName, int bSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.bSal = bSal;
	}

	public String getDetails() {
		return (empId + " " + empName + " " + bSal);
	}

	public double getTax() {
		return (bSal * 0.25);
	}
	
	public double getPremium() {
		return (bSal * 0.10);
	}

}
