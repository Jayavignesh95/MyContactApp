<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Welcome to App Login</h1>
	<form action="/register" method="POST" commandName="frmdata">

		<label> EMail ID </label>
		<input type="text" name="email"  /> 
		<br>

		<label>User Name </label>
		<input type="text"  name="name"  /> 
		<br>

		<label>Password </label>
		<input type="password" name="pass"  /> 
		<br>
		<input type="submit" value="Register"/>
</form>



</body>
</html>