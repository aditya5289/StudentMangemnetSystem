package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Student;
import com.app.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	
	@GetMapping("/add")
	public String addStudentForm(Student student) {
		
//		model.add("student", new Studetn()
		
		return "/student/add_student_form";
	}
	
	@PostMapping("/add")
	public String addStudent(Model model, Student transietStudent) {
		
		try {
			studentService.addStudentDetails(transietStudent);
			model.addAttribute("message", "student added successfully");
		}catch(Exception e){
			model.addAttribute("message", "Failed to add student");
			e.printStackTrace();
		}
		
		
		return "/student/message";
	}
	
	
	

	@GetMapping("/all")
	public String showAllStudents(Model map) {
		
		map.addAttribute("student_details", studentService.getAllStudentsDetails());
		
		return "/student/list";
	}

	
	
	@GetMapping("/course")
	public String studentsByCourse() {
	
		return "/student/course_name_form";
	}
	
	@PostMapping("/course")
	public String getStudentsByCourse(@RequestParam String courseName, Model map) {
		
		map.addAttribute("student_details", studentService.displayRollnoAndNameByCourseName(courseName));
		
		return "/student/list";
	}
}
