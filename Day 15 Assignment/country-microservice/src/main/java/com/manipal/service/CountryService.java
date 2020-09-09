package com.manipal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Country;
import com.manipal.repository.ICountryRepository;

@Service
public class CountryService implements ICountryService{

	@Autowired
	ICountryRepository repository;
	
	@Override
	public Country getCountryByName(String countryName) {
		return repository.findByCountryName(countryName);
	}

	@Override
	public void addCountry(Country country) {
		repository.save(country);
	}

	
}
