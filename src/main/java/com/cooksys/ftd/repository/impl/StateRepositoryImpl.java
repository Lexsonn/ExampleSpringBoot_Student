package com.cooksys.ftd.repository.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.ftd.entity.State;
import com.cooksys.ftd.repository.SpringDataStateRepository;
import com.cooksys.ftd.repository.StateRepository;

@Transactional
@Repository
public class StateRepositoryImpl implements StateRepository {
	
	@Autowired
	SpringDataStateRepository repo;
	
	@Override
	public State getById(Long id) {
		return repo.findOne(id);
	}

	@Override
	public State getByName(String name) {
		return repo.findByState(name);
	}

}
