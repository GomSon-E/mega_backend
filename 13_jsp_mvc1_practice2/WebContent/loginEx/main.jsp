<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = (String) session.getAttribute("id");
	
		if (id == null) {
	%>
			<h1>JUST DO IT!</h1>
			<p><a href="join.jsp">JOIN</a></p>
			<p><a href="login.jsp">LOGIN</a></p>	
	<%
		}
		else {
	%>
			<h1>WELCOME <%=id %></h1>
			<p><a href="logout.jsp">LOGOUT</a></p>
			<p><a href="delete.jsp">DELETE</a></p>	
			<p><a href="update.jsp">UPDATE</a></p>	
	<%
		}
	
	%>

</body>
</html>