<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Welcome to App Login</h1>
	<form:form action="/register" method="POST" commandName="frmdata">

		<label> EMail ID </label>
		<form:input type="text" id="email" path="email" /> 
		<br>

		<label>User Name </label>
		<form:input type="text" id="name" path="rollno" /> 
		<br>

		<label>Password </label>
		<form:input type="password" id="pass" path="password" /> 
		<br>
		<input type="submit" value="Register"/>
</form:form>




</body>
</html>