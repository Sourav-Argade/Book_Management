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
<h2 style="color:blue">VIEW BOOK</h2>
	<%
	String mode = (String) request.getAttribute("mode");
	if (mode.equals("single")) {
		boolean flag = (Boolean) request.getAttribute("flag");
		if (flag) {
			Book b = (Book) request.getAttribute("result");
			out.println("<table border=1px><tr><th>REG NO</th><th>BRAND</th><th>COST</th></tr>");
			out.println("<tr><td>" + b.getRegno() + "</td><td>" + b.getAuthor() + "</td><td>" + b.getCost()
			+ "</td></tr></table>");
		} else {
			out.println("<h1> " + (String) request.getAttribute("result") + "</h1>");
		}
	} else if (mode.equals("list")) {
		ArrayList<Book> clist = (ArrayList<Book>) request.getAttribute("result");
		out.println("<table border=1px><tr><th>BOOK_ID</th><th>AUTHOR</th><th>COST</th></tr>");
		for(Book b:blist)
		{
			out.println("<tr><td>" + b.getRegno() + "</td><td>" + b.getAuthor() + "</td><td>" + b.getCost()
			+ "</td></tr>");
		}
		out.println("</table>");
	}
	%>
	<h1>${result}</h1>
</body>
</html>