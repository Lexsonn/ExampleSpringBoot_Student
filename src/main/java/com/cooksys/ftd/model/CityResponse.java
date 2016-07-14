package com.cooksys.ftd.model;

import java.util.List;

public class CityResponse {
	
	String city;
	List<StudentResponse> students;
	
	public CityResponse() {
		super();
	}

	public CityResponse(String city, List<StudentResponse> students) {
		super();
		this.city = city;
		this.students = students;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<StudentResponse> getStudents() {
		return students;
	}

	public void setStudents(List<StudentResponse> students) {
		this.students = students;
	}
	
}
