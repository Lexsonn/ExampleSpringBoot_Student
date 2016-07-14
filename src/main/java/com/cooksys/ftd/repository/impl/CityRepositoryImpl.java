package com.cooksys.ftd.repository.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.ftd.entity.City;
import com.cooksys.ftd.repository.CityRepository;
import com.cooksys.ftd.repository.SpringDataCityRepository;

@Transactional
@Repository
public class CityRepositoryImpl implements CityRepository {

	@Autowired
	SpringDataCityRepository repo;
	
	@Override
	public City getById(Long id) {
		return repo.findOne(id);
	}

	@Override
	public City getByName(String name) {
		return repo.findByCity(name);
	}

}
