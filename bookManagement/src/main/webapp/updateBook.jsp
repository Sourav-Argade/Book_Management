<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red">BOOK MANAGEMENT SYSTEM</h1>
<h2 style="color:blue">UPDATE BOOK</h2>
<form action="updateBook" method="get">
	Enter BOOK ID:<br> <input type="text" name="regno"><br><br>
	Enter AUTHOR:<br> <input type="text" name="author"><br><br>
	Enter Book's Cost:<br> <input type="text" name="cost"><br><br>
	<input type="submit" value="UPDATE BOOK">
</form>
</body>
</html>