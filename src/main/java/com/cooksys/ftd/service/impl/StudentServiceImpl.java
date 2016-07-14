package com.cooksys.ftd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.ftd.entity.City;
import com.cooksys.ftd.entity.State;
import com.cooksys.ftd.model.CityResponse;
import com.cooksys.ftd.model.StateResponse;
import com.cooksys.ftd.model.StudentResponse;
import com.cooksys.ftd.repository.SpringDataStudentRepository;
import com.cooksys.ftd.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	SpringDataStudentRepository repo;
	
	@Override
	public CityResponse getAllByCity(City city) {
		if (city == null)
			return null;
		return new CityResponse(city.getCity(), StudentResponse.list(repo.findByCity(city)));
	}

	@Override
	public StateResponse getAllByState(State state) {
		if (state == null)
			return null;
		return new StateResponse(state.getState(), StudentResponse.list(repo.findByState(state)));
	}
	
}
