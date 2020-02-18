<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AirPort Management</title>
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
}
</style>
</head>
<body onload='document.loginForm.username.focus();'>
<h1 align="center">AirPort Management System</h1>
<h3>Login Page</h3>
Hi I am  login Page!

	 <%
		String errorString = (String) request.getAttribute("error");
		if (errorString != null && errorString.trim().equals("true")) {
			out.println("<span class=\"errorblock\">Incorrect login name or password. Please try again");
		}
	%> 
<c:url var="action" value="/login/auth${userName}"></c:url>
<form:form method="post" action="${action}" commandName="userForm" cssClass="customerForm"> 
	 <%-- <form name='loginForm' action="/login/auth" method='POST'> --%> 

		<table>
		<tr>
				<td>Role:</td>
				<td><input type='text' name='userType' value=''></td>
			</tr>
			<tr>
			<tr>
				<td>User:</td>
				<td><input type='text' name='userName' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="submit" /></td>
				<td><input name="reset" type="reset" /></td>
			</tr>
		</table>
		<br>
		 <c:if test="${not empty message}"><div>${message}</div></c:if>
<a href="register">Signup as Admin?</a>
	<a href="register">Signup as Manager?</a>
	</form:form>
	
	
</body>
</html>