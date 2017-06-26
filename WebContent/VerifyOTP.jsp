<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<%String otp = request.getAttribute("otp").toString(); %>
<marquee>Welcome to Kisan Network!</marquee>
<a href="AddContact.jsp">Add Number</a>
<br>
<form action="">
<input type="text" name="otpverify" placeholder="Enter your OTP">
<input type="submit" value="Verify">
</form>
</center>
</body>
</html>