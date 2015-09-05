<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
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
	<s:form action="divide">
		<s:textfield name="num1" label="First No:"></s:textfield>
		<s:textfield name="num2" label="Second No:"></s:textfield>
		<s:submit value="DIVIDE"></s:submit>
	</s:form>
<br><br><br><br><br>
<br><br><br><br><br>
<br><br><br><br><br>
<%@include file="footer.jsp" %>
</body>
</html>