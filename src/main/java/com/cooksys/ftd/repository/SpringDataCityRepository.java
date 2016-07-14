package com.cooksys.ftd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.ftd.entity.City;

public interface SpringDataCityRepository  extends JpaRepository<City, Long> {
	
	City findByCity(String city);
	
}
