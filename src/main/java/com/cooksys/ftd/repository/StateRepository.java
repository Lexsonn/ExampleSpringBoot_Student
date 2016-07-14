package com.cooksys.ftd.repository;

import com.cooksys.ftd.entity.State;

public interface StateRepository {
	
	public State getById(Long id);
	public State getByName(String name);
}
