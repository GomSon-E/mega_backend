<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>

	<h3>마이페이지</h3>
	
	<%
	
		String id = request.getParameter("id");
	
	%>
	
	<p><%=id %>님 로그인 중</p>

</body>
</html>