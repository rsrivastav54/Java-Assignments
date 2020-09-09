package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Capital;
import com.manipal.repository.ICapitalRepository;

@Service
public class CapitalService implements ICapitalService{

	@Autowired
	ICapitalRepository repository;
	
	@Override
	public void addCapital(Capital capital) {
		repository.save(capital);
	}

	@Override
	public List<Capital> showAllCapital() {
		return repository.findAll();
	}

	@Override
	public Capital getCapitalByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public Capital getCapitalByZipcode(String zipcode) {
		return repository.findByZipcode(zipcode);
	}

	@Override
	public Capital getCapitalByCountryCode(int countryCode) {
		return repository.findById(countryCode).orElse(null);
	}

}
