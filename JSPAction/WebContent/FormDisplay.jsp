<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="emp" scope="request" class="com.capgemini.web.entities.Employee"></jsp:useBean>

<b>Employee Id:</b> <jsp:getProperty property="id" name="emp"  /></br>
<b>Employee Name:</b><jsp:getProperty property="name" name="emp" /></br>
<b>Employee Department:</b><jsp:getProperty property="department" name="emp" /></br>

</body>
</html>