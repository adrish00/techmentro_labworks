<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<%@include file="header.jsp" %><br>
<hr>
	<div style="color : White;font-style: bold;font-size: 25px; background-color: orange;">
		<marquee behavior="alternate">Techmentro Example Menu</marquee>
	</div>
<hr>
<br>
	<a href="index_str_jsp.jsp" target="_blank">Customized Result and interceptor use</a>
<br>
	<a href="index_vm_res.jsp" target="_blank">Velocity Result</a>
<br>
	<a href="divideForm.jsp" target="_blank">Division operation (Exception Test)</a>
<br>
	<a href="exWait.jsp" target="_blank">ExecAndWait Interceptor Test</a>
<br>
	<a href="register.jsp" target="_blank">New User Sign Up</a>
<br>
	<!-- <a href="login.jsp" target="_blank">Existing User Login</a> -->
	<a href="loginPage.jsp" target="_blank">Existing User Login</a>
<br>
	<a href="users.action" target="_blank">User List</a>
<br><br><br><br><br>
<br><br><br><br><br>
<br><br><br><br><br>
<%@include file="footer.jsp" %>
</body>
</html>