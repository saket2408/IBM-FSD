package com.example.firstspringboot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentImpl {
	@Autowired
	private  EntityManager en;
	private Session session;
	private List<Student> list;
	
	public StudentImpl() {
		super();
		
	}

	@Transactional
	public List<Student> getAll(){
		session = en.unwrap(Session.class);
		list = session.createQuery("from Student", Student.class).getResultList();
		return list;
	}
	
	@Transactional
	public void addStudent(Student student) {
		session = en.unwrap(Session.class);
		session.saveOrUpdate(student);
	}
	
	@Transactional
	public Student findStudent(int id) {
		session = en.unwrap(Session.class);
		Student student = session.get(Student.class, id);
		return student;
	}

}
