package com.cooksys.ftd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.ftd.entity.State;

public interface SpringDataStateRepository  extends JpaRepository<State, Long> {
	
	public State findByState(String state);
	
}
