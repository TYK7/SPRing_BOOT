<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Book Details</h2>

<table  style="padding: 5px">
<tr>
<th>BookId</th>
<th>BookName</th>
<th>BookPrice</th>
</tr>
	
		<tr>




			<td>${b.bookId}</td>
			<td>${b.bookName}</td>
			<td>${b.bookPrice}</td>


		</tr>
		
		

	</table>

<%-- <h3>Book Id:${book.bookId}</h3>
<h3>Book Name:${book.bookName}</h3>
<h3>Book Price:${book.bookPrice}</h3> --%>
</body>
</html>