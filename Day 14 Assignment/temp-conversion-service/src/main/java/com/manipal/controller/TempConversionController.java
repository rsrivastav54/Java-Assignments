package com.manipal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.ConversionRate;

@RestController
public class TempConversionController {

	@GetMapping("temp-conversion/from/{from}/to/{to}")
	public ConversionRate getConversion(@PathVariable String from, @PathVariable String to) {
		return new ConversionRate(from, to);
	}
	
}
