package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.TempCalculatorBean;
import com.manipal.proxy.TempConversionProxy;

@RestController
public class TempCalculatorController {

	@Autowired
	TempConversionProxy proxy;

	@GetMapping("temp-calculator/from/{from}/to/{to}/unit/{unit}")
	public TempCalculatorBean convert(@PathVariable String from, @PathVariable String to, @PathVariable int unit) {
		TempCalculatorBean bean = proxy.retrieveCalculatedValue(from, to);
		double convVal = unit * bean.getMultiplier() + bean.getAdder();
		return new TempCalculatorBean(from, to, bean.getMultiplier(), bean.getAdder(), unit, convVal);
	}

}
