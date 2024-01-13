<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- display an list of departments here using form  -->


	<table style="background-color: lightgrey; margin: auto">
		<caption>Students List</caption>
		<tr>
		<%-- <th>Student rollNo</th> --%>
		<th>First Name</th>
		<th>Last Name</th>
		<th>City</th>
		<%-- <th>Course Name</th> --%>
		
		
		</tr>
		<c:forEach var="student" items="${requestScope.student_details}">
			<tr>
				<%-- <td>${student.rollno}</td> --%>
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
				<td>${student.city}</td>
				
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>