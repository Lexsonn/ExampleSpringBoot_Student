package com.cooksys.ftd.service;

import com.cooksys.ftd.entity.City;
import com.cooksys.ftd.entity.State;
import com.cooksys.ftd.model.CityResponse;
import com.cooksys.ftd.model.StateResponse;

public interface StudentService {
	
	public CityResponse getAllByCity(City city);
	public StateResponse getAllByState(State state);
	
}
