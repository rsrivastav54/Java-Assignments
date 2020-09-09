package com.manipal.service;

import java.util.List;

import com.manipal.model.Capital;

public interface ICapitalService {

	void addCapital(Capital capital);
	
	List<Capital> showAllCapital();
	
	Capital getCapitalByName(String name);
	
	Capital getCapitalByZipcode(String zipcode);
	
	Capital getCapitalByCountryCode(int countryCode);
}
