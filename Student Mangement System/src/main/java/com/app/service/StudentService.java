package com.app.service;

import java.util.List;

import com.app.pojos.Student;

public interface StudentService {
	String addStudentDetails(Student student);

	List<Student> getAllStudentsDetails();

	List<Student> displayRollnoAndNameByCourseName(String course);
}
