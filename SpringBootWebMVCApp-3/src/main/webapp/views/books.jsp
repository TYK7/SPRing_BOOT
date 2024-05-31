<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<thead>
<tr>
<th>BookId</th>
<th>BookName</th>
<th>BookPrice</th>

</tr>
</thead>
<tbody>

<c:forEach items="${list}" var="b">
<tr>

<td>${b.bookId}</td>
<td>${b.bookName}</td>
<td>${b.bookPrice}</td>
</tr>

</c:forEach>
</tbody>


</table>
</body>
</html>