<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Date: <%= new Date() %><br/>

<!-- declaration of scripting element -->
<%!
//instance variable
int hitCount=0;
%>

<%!
	public int incrementCounter()
	{
		return ++hitCount;
	}
%>
hey<br/>
<%
	out.println("HitCount is: "+ incrementCounter());
%>
</body>
</html>