package com.cooksys.ftd.repository;

import java.util.List;

import com.cooksys.ftd.entity.Student;
import com.cooksys.ftd.model.StudentResponse;

public interface StudentRepository {
	
	public Student getById(Long id);
	public List<Student> getAll();
	public List<Student> getByFirstName(String firstName);
	public List<Student> getByLastName(String lastName);
	public List<Student> getByCity(String city);
	public List<Student> getByState(String state);
	public Student verifyPassword(Long id, String password);
	public Student createNew(Student student);
	public Student update(Student student);
	public Student delete(Student student);
	
//	public List<StudentResponse> getAllStudentsByCity(String city);
//	public List<StudentResponse> getAllStudentsByState(String state);
}
