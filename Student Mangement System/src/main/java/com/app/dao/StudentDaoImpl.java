package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private EntityManager mgr;

	@Override
	public String addStudentDetails(Student student) {
		mgr.persist(student);
		return "Details added successfully";
	}

	@Override
	public List<Student> getAllStudentsDetails() {
		String jpql = "select s from Student s";
		return mgr.createQuery(jpql, Student.class).getResultList();
	}

	@Override
	public List<Student> displayRollnoAndNameByCourseName(String course) {
		String  jpql="select s from Student s where s.courseName=:type";
		return mgr.createQuery(jpql, Student.class).setParameter("type", course).getResultList();
	}
}
