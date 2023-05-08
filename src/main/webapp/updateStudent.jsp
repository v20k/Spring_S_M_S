<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="updatedStudent"  modelAttribute="student">
<form:input path="student_id"  readonly="true"/>
<form:input path="student_Name"/>
<form:input path="student_PhNo"/>
<input type="submit" value="Update">
</form:form>
</body>
</html>