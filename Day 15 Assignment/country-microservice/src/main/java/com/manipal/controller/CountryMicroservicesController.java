package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Country;
import com.manipal.proxy.CapitalProxy;
import com.manipal.service.ICountryService;

@RestController
public class CountryMicroservicesController {

	@Autowired
	CapitalProxy proxy;

	@Autowired
	ICountryService countryService;

	@GetMapping("country-service/countrycode/{countryCode}")
	public Country findCapital(@PathVariable int countryCode) {
		Country bean = proxy.retrieveCapital(countryCode);
		return new Country("India", bean.getZipcode(), bean.getName(), bean.getLanguage(), bean.getPopulation(),
				bean.getCountryCode(), bean.getPort());

	}

	@GetMapping("country-service/country/{countryName}")
	public Country findCapitalByCountryCode(@PathVariable String countryName) {
		Country country = countryService.getCountryByName(countryName);
		int countryCode = country.getCountryCode();
		Country bean = proxy.retrieveCapital(countryCode);
		//String temp = country.getCountryName();
		if (country.getCountryCode() == bean.getCountryCode()) {
			country.setLanguage(bean.getLanguage());
			country.setName(bean.getName());
			country.setPopulation(bean.getPopulation());
			country.setZipcode(bean.getZipcode());
			country.setPort(bean.getPort());
			//country.setCountryName(temp);
			countryService.addCountry(country);
		}

		return country;
	}

}
