<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<spring:url var="url" value="/student/add" />
	<form:form action="${url}" method="post" modelAttribute="student">
		<table style="background-color: lightgrey; margin: auto">
			
			<tr>
				<td>Enter First Name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			
			<tr>
				<td>Enter City</td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td>Enter Course Name</td>
				<td><form:input path="courseName" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add a student" /></td>
			</tr>
		</table>
	</form:form>
	
</body>


</html>