package com.manipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="capitals")
public class Capital {

	
	private String zipcode;
	
	private String name;
	
	private String language;
	
	private Long population;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="country_code")
	private int countryCode;
	
	private int port;
	
	public Capital() {
		
	}
	
	public Capital(String zipcode, String name, String language, Long population, int countryCode, int port) {
		super();
		this.zipcode = zipcode;
		this.name = name;
		this.language = language;
		this.population = population;
		this.countryCode = countryCode;
		this.port = port;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Capital [zipcode=" + zipcode + ", name=" + name + ", language=" + language + ", population="
				+ population + ", countryCode=" + countryCode + ", port=" + port + "]";
	}
	
	
	
	
	
}
