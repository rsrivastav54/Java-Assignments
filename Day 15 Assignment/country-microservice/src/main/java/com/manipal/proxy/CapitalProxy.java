package com.manipal.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.model.Country;


@FeignClient(name="capital-microservice", url = "localhost:8000")
public interface CapitalProxy {
	
	@GetMapping("capital-service/countrycode/{countryCode}")
	public Country retrieveCapital(@PathVariable int countryCode);

}
