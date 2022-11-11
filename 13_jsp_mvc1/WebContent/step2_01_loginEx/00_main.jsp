<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>

	<%
	
		String id = (String) session.getAttribute("id");
	
		if (id == null) {
			
			
	%>
		<h1>JUST DO IT</h1>
		<p><a href="01_insert.jsp">JOIN!</a></p>
		<p><a href="03_login.jsp">LOGIN!</a></p>
	<%	
	
		}
		else {
			
	%>
		<h1>WELCOME <%=id %>!</h1>
		<p><a href="05_logout.jsp">LOGOUT!</a></p>
		<p><a href="06_delete.jsp">DELETE!</a></p>
		<p>UPDATE!</p>
	<%
			
		}
	
	%>

</body>
</html>