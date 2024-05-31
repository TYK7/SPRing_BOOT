<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	
		<h1>User Registration Form</h1>
	
	<form:form action="userReg" modelAttribute="users" method="POST">
		<table>
			<tr>
				<td>User Name:</td>
				<td><form:input path="userName"/> 
						<form:errors path="userName" cssClass="error"/></td>

			</tr>
			<tr>
				<td>User Password:</td>
				<td><form:password path="userPassword" /> 
						 <form:errors path="userPassword" cssClass="error"/></td>

			</tr>
			<tr>
				<td>User Mail:</td>
				<td><form:input path="userMail" />
					<form:errors path="userMail" cssClass="error" /></td>
			</tr>
			<tr>
				<td>User Phone Number:</td>
				<td><form:input path="userPhoneNum" />
					<form:errors path="userPhoneNum" cssClass="error" /></td>
			</tr>
			<tr>
				<td>User Age:</td>
				<td><form:input path="userAge" />
					<form:errors path="userAge"  cssClass="error"/></td>

			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="REGISTER" /></td>

			</tr>


		</table>
	</form:form>
</body>
</html>