<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Management System</title>
</head>
<body>
<h1 style="color:red">Book Management System</h1>
<h2 style="color:blue">ADD A BOOK</h2>
<form action="addBook" method="get">
	Enter Book id:<br> <input type="text" name="regno"><br><br>
	Enter Book's Author:<br> <input type="text" name="author"><br><br>
	Enter Book's Cost:<br> <input type="text" name="cost"><br><br>
	<input type="submit" value="ADD BOOK">
</form>
</body>
</html>