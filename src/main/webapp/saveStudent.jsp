<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:form action="addStudent" modelAttribute="student">
<f:input path="student_Name"/>
<f:input path="student_PhNo"/>
<input type="submit">

</f:form>



</body>
</html>