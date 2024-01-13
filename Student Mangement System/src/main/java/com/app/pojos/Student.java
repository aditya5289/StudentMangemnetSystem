package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 	id (PK), first_name,last_name, dob,batting_avg,wickets_taken....
	+team_id (FK)
 */
@Entity
@Table(name = "students_details")
public class Student  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rollno;
	
	private String firstName;
	private String lastName;
	private String city;
	private String courseName;
	

	public Student() {
		// TODO Auto-generated constructor stub
	}
	

	public Student(String firstName, String lastName, String city, String courseName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.courseName = courseName;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", courseName=" + courseName + "]";
	}

	
	
}
