package com.manipal.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.model.TempCalculatorBean;

@FeignClient(name="temp-conversion-service", url = "localhost:7000")
public interface TempConversionProxy {
	
	@GetMapping("temp-conversion/from/{from}/to/{to}")
	public TempCalculatorBean retrieveCalculatedValue(@PathVariable String from, @PathVariable String to);

}
