package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Capital;
import com.manipal.service.ICapitalService;

@RestController
@RequestMapping("/capital-service")
public class CapitalMicroservicesController {

	@Autowired
	ICapitalService capitalService;

	@PostMapping("/addCapital")
	public String addCapitalDetails(@RequestBody Capital capital) {
		capitalService.addCapital(capital);
		return "Capital Added Successfully";
	}

	@GetMapping("/all")
	public List<Capital> showCapitalDetails() {
		return capitalService.showAllCapital();
	}
	
	@GetMapping("/capital/{capitalName}")
	public Capital getCapitalByName(@PathVariable String capitalName) {
		Capital capital = capitalService.getCapitalByName(capitalName);
		return capital;
	}
	
	@GetMapping("/zipcode/{zipcode}")
	public Capital getCapitalByZipcode(@PathVariable String zipcode) {
		Capital capital = capitalService.getCapitalByZipcode(zipcode);
		return capital;
	}
	
	@GetMapping("/countrycode/{countryCode}")
	public Capital getCapitalByCountryCode(@PathVariable int countryCode) {
		Capital capital = capitalService.getCapitalByCountryCode(countryCode);
		return capital;
	}

}
