<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- 2022.11.08 20:28 - 20:31 --%>
	
	<%
		
		request.setCharacterEncoding("utf-8");
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String dbId = request.getParameter("dbId");
		String dbPw = request.getParameter("dbPw");
		
		String result = "";
		
		if (id.equals(dbId) && pw.equals(dbPw)) {
			result = "로그인에 성공하였습니다.";
		}
		else {
			result = "아이디나 비밀번호를 다시 확인하여 주십시오.";
		}
	
	%>
	
	<h1><%=result %></h1>

</body>
</html>