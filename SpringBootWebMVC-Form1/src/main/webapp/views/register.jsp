<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Save Product Data</h2>

<table>
	<form:form action="product" method="post" modelAttribute="product">

		<tr>
			<td>ProductId:</td>

			<td><form:input path="productId" /></td>

		</tr>
		<tr>
			<td>ProductName:</td>

			<td><form:input path="productName" /></td>

		</tr>
		<tr>
			<td>ProductPrice:</td>

			<td><form:input path="productPrice" /></td>

		</tr>
		<tr>
			<td></td>

			<td><input type="submit" value="SUBMIT"/></td>

		</tr>
		

	</form:form></table>

</body>
</html>