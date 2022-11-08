<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>import</title>
</head>
<body>

	<% 
	
		Random ran = new Random();
		
		String[] languages = {"JSP" , "JAVA " , "HTML" ,"CSS" , "JS" , "MYSQL"};
		int r = ran.nextInt(6);
		
	%>
	<h3><%=languages[r] %></h3>

	<hr>
	
	<% 
	
		Date temp = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String now = sdf.format(temp);
	
	%>
	<p>현재시간 : <%=now %></p>



</body>
</html>


