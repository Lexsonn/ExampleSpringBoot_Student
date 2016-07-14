package com.cooksys.ftd.repository;

import com.cooksys.ftd.entity.City;

public interface CityRepository {
	
	public City getById(Long id);
	public City getByName(String name);
}
