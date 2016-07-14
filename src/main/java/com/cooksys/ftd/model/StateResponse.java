package com.cooksys.ftd.model;

import java.util.List;

public class StateResponse {
	
	String state;
	List<StudentResponse> students;
	
	public StateResponse() {
		super();
	}
	
	public StateResponse(String state, List<StudentResponse> students) {
		super();
		this.state = state;
		this.students = students;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<StudentResponse> getStudents() {
		return students;
	}

	public void setStudents(List<StudentResponse> students) {
		this.students = students;
	}
	
}
