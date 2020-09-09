package com.manipal.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.manipal.model.Country;

public interface ICountryService {
	
	Country getCountryByName(String countryName);
	
	void addCountry(Country country);


}
