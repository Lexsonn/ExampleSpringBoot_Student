package com.cooksys.ftd.model;

import java.util.ArrayList;
import java.util.List;

import com.cooksys.ftd.entity.Student;

public class StudentResponse {

	private long id;
	private String firstName;
	private String lastName;
	
	public StudentResponse(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static List<StudentResponse> list(List<Student> list) {
		ArrayList<StudentResponse> result = new ArrayList<>();
		for(Student student : list)
			result.add(new StudentResponse(student.getId(), student.getFirstName(), student.getLastName()));
		return result;
	}
}
