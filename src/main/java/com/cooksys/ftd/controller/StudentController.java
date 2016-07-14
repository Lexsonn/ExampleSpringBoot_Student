package com.cooksys.ftd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.ftd.entity.City;
import com.cooksys.ftd.entity.State;
import com.cooksys.ftd.entity.Student;
import com.cooksys.ftd.model.CityResponse;
import com.cooksys.ftd.model.StateResponse;
import com.cooksys.ftd.repository.CityRepository;
import com.cooksys.ftd.repository.StateRepository;
import com.cooksys.ftd.repository.StudentRepository;
import com.cooksys.ftd.service.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	Student get(@PathVariable Long id) {
		return studentRepository.getById(id);
	}
	
	@RequestMapping(value="allStudents", method=RequestMethod.GET)
	List<Student> getAllStudents() {
		return studentRepository.getAll();
	}	
	
	@RequestMapping(value="first/{firstName}", method=RequestMethod.GET)
	List<Student> getByFirstName(@PathVariable String firstName) {
		return studentRepository.getByFirstName(firstName);
	}
	
	@RequestMapping(value="last/{lastName}", method=RequestMethod.GET)
	List<Student> getByLastName(@PathVariable String lastName) {
		return studentRepository.getByLastName(lastName);
	}
	
	@RequestMapping(value="city/{cityName}", method=RequestMethod.GET)
	CityResponse getByCity(@PathVariable String cityName) {
		return studentService.getAllByCity(cityRepository.getByName(cityName));
	}
	
	@RequestMapping(value="state/{stateName}", method=RequestMethod.GET)
	StateResponse getByState(@PathVariable String stateName) {
		return studentService.getAllByState(stateRepository.getByName(stateName));
	}
	
	@RequestMapping(value="verify/{id}/{password}", method=RequestMethod.GET)
	Student verify(@PathVariable Long id, @PathVariable String password) {
		return studentRepository.verifyPassword(id, password);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	Student createNew(@RequestBody Student student) {
		return studentRepository.createNew(student);
	}
	
	@RequestMapping(value="/", method=RequestMethod.PUT)
	Student update(@RequestBody Student student) {
		return studentRepository.update(student);
	}
	
	@RequestMapping(value="/", method=RequestMethod.DELETE)
	Student delete(@RequestBody Student student) {
		return studentRepository.delete(student);
	}
}
