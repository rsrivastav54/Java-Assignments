package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manipal.model.Country;

public interface ICountryRepository extends JpaRepository<Country, Integer>{

	Country findByCountryName(String countryName);

}
