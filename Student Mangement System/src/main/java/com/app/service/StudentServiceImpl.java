package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.StudentDao;
import com.app.pojos.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	private void StudentDao() {
		// TODO Auto-generated method stub
	}

	@Override
	public String addStudentDetails(Student student) {
//		student=new Student(@RequestParam String fName, @RequestParam String lName, @RequestParam String city, @RequestParam String courseName)
		studentDao.addStudentDetails(student);
		return "added successfully";
	}


	public List<Student> getAllStudentsDetails() {
		return studentDao.getAllStudentsDetails();
	}

	@Override
	public List<Student> displayRollnoAndNameByCourseName(String course) {
		return studentDao.displayRollnoAndNameByCourseName(course);
	}
	
	

}
