<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="x" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Students List</h1>
<table cellpadding=10 cellspacing=0 border="">
<tr><th>S_Id</th><th>S_Name</th><th>S_PhNo</th><th>Update</th><th>Delete</th></tr>

<x:forEach var="stud" items="${stu}">
<tr><td>${stud.getStudent_id()}</td><td>${stud.getStudent_Name() }</td><td>${stud.getStudent_PhNo() }</td>
<td><a href="updateStudent?S_ID=${stud.getStudent_id()}">Update</a></td>
<td><a href="DeleteStudent?s_id=${stud.getStudent_id()}">Delete</a></td></tr>
</x:forEach>


</table>


</body>
</html>