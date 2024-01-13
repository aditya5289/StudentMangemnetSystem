<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Student Management System</title>
</head>
<body>
 <h2>Welcome to Student Management System Portal </h2>
 <br>
 <br>
 <br>
 <br>

	<table>
		<tr>
			<td><spring:url var="url" value="/student/add" /> <a
				href="${url}">1.Add Student Form</a></td>
		</tr>
		<tr>
			<td><spring:url var="all" value="/student/all" /> <a
				href="${all}">2.Show All Students</a></td>
		</tr>
		<tr>
			<td><spring:url var="bycourse" value="/student/course" /> <a
				href="${bycourse}">3.Display students by course name</a></td>
		</tr>
	</table>





</body>
</html>