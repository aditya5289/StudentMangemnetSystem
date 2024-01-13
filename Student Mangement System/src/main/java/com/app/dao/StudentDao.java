package com.app.dao;

import java.util.List;

import com.app.pojos.Student;

public interface StudentDao {
	
	
	String addStudentDetails(Student student);
	
	List<Student> getAllStudentsDetails();
	
	List<Student> displayRollnoAndNameByCourseName(String course);
}
