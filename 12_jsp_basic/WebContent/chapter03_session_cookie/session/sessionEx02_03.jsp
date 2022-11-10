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
	
		// .getAttribute() 메서드의 기본 반환 타입은 Object형이므로 형변환 작업이 필요하다.
		String id = (String) session.getAttribute("id");
	
	%>
	
	<p><%=id %>님 로그인 중</p>

</body>
</html>