<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BOOK MANAGEMENT SYSTEM</title>
</head>
<body>
<body>
<h1 style="color:red">BOOK MANAGEMENT SYSTEM</h1>
<h2 style="color:blue">VIEW BOOK</h2>
<form action="viewBook" method="get">
	Enter BOOK ID:<br> <input type="text" name="regno"><br><br>
	<input type="submit" value="VIEW BOOK">
</form><br><br>
<h2 style="color:blue">VIEW ALL BOOKS</h2>
<form action="viewAllBook" method="get">
	<input type="submit" value="VIEW ALL BOOKS">
</form>
</body>
</html>