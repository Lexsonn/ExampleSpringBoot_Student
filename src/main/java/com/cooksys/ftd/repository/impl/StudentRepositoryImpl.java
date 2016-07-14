package com.cooksys.ftd.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.ftd.entity.Student;
import com.cooksys.ftd.model.StudentResponse;
import com.cooksys.ftd.repository.StudentRepository;

@Transactional
@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	EntityManager em;
	
	@Override
	public List<Student> getAll() {
		return em.createQuery("select student from Student student", Student.class).getResultList();
	}
	
	@Override
	public Student getById(Long id) {
		return em.createQuery("select student from Student student where student.id = :id", Student.class)
				.setParameter("id", id)
				.getSingleResult();
	}
	
	@Override
	public List<Student> getByFirstName(String firstName) {
		return em.createQuery("select student from Student student where student.firstName = :firstName", Student.class)
				.setParameter("firstName", firstName)
				.getResultList();
	}

	@Override
	public List<Student> getByLastName(String lastName) {
		return em.createQuery("select student from Student student where student.lastName = :lastName", Student.class)
				.setParameter("lastName", lastName)
				.getResultList();
	}

	@Override
	public List<Student> getByCity(String city) {
		return em.createQuery("select student from Student student where student.city = :city", Student.class)
				.setParameter("city", city)
				.getResultList();
	}

	@Override
	public List<Student> getByState(String state) {
		return em.createQuery("select student from Student student where student.state = :state", Student.class)
				.setParameter("state", state)
				.getResultList();
	}

	@Override
	public Student verifyPassword(Long id, String password) {
		Student student = getById(id);
		if (student == null)
			return null;
		if (!student.getPassword().equals(password))
			return null;
		
		return student;
	}

	@Override
	public Student createNew(Student student) {
		em.persist(student);
		return student;
	}

	@Override
	public Student update(Student student) {
		em.merge(student);
		return student;
	}

	@Override
	public Student delete(Student student) {
		Student s = em.find(Student.class, student.getId());
		em.remove(s);
		return s;
	}

}
