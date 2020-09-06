package com.manipal.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	private int athleteId;

	private String athleteName;

	private String gender;
	
	private String category;
	
	private String emailId;
	
	private String mobile;
	
	public int getAthleteId() {
		 return athleteId;
	}

	public void setAthleteId(int athleteId) {
		this.athleteId = athleteId;
	}

	public String getAthleteName() {
		return athleteName;
	}
	
	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
	
}
