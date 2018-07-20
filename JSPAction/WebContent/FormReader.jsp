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

<jsp:setProperty property="id" name="emp" value="${param.id}" />
<jsp:setProperty property="name" name="emp" value="${param.name}" />
<jsp:setProperty property="department" name="emp" value="${param.department}" />

<jsp:forward page="FormDisplay.jsp"></jsp:forward>

</body>
</html>