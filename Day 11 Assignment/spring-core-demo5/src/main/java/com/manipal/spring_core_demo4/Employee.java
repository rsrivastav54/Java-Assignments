package com.manipal.spring_core_demo4;

public class Employee {
	private long empId;
	private String empName;
	private double salary;
	private Address address;
	
	
	public Employee(long empId, String empName, double salary,Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address=address;
		
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
	

	
	
	

}
