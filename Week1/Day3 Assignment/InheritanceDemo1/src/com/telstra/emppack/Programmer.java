package com.telstra.emppack;

public class Programmer extends Employee {

	private int noOfProjects;
	private String skillset;

	public Programmer(int empId, String empName, int bSal, int noOfProjects, String skillset) {
		super(empId, empName, bSal);
		this.noOfProjects = noOfProjects;
		this.skillset = skillset;
	}

	@Override
	public String getDetails() {
		return super.getDetails() + " " + noOfProjects + " " + skillset;
	}

	public int getNoOfProjects() {
		return noOfProjects;
	}

	public String getSkillset() {
		return skillset;
	}

	@Override
	public double getTax() {
		double tax = 0;
		if (getSkillset() == "C++") {
			tax = bSal * 0.05 * (0.4 * getNoOfProjects());
		} else if (getSkillset() == "Java") {
			tax = bSal * 0.10 * (0.4 * getNoOfProjects());
		} else if (getSkillset() == "Python") {
			tax = bSal * 0.15 * (0.4 * getNoOfProjects());
		} else {
			tax = bSal * 0.02 * (0.4 * getNoOfProjects());
		}
		return tax;
	}
	
	@Override
	public double getPremium() {
		double premium = 0;
		if (getSkillset() == "C++") {
			premium = bSal * 0.05;
		} else if (getSkillset() == "Java") {
			premium = bSal * 0.10;
		} else if (getSkillset() == "Python") {
			premium = bSal * 0.15;
		} else {
			premium = bSal * 0.02;
		}
		return premium;
	}
}
