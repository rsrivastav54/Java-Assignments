package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Capital;

@Repository
public interface ICapitalRepository extends JpaRepository<Capital, Integer>{
	Capital findByName(String name);
	
	Capital findByZipcode(String zipcode);

}
