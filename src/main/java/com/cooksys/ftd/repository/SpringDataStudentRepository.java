package com.cooksys.ftd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.ftd.entity.City;
import com.cooksys.ftd.entity.State;
import com.cooksys.ftd.entity.Student;

public interface SpringDataStudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByCity(City city);
	List<Student> findByState(State state);

}
