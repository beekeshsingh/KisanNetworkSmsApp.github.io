<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/style.css"/>
</head>
<body>
<center>

<marquee>Welcome to Kisan Network</marquee>
<a href="AddContact.jsp">Add Number</a>
<form action="SmsServlet" method="get">

<br>

<select name="number">
	<option>---Select Number---</option>
	<option value="919650158586">919650158586</option>
	<option value="919650158586">919650158586</option>
	<option value="919650158586">919650158586</option>
	<option value="918287225540">918287225540</option>
	<option value="918287225540">918287225540</option>
	<option value="918287225540">918287225540</option>
	
</select>
<br>
<input type="submit" value="Send OTP">
</form>
</center>


</body>
</html>