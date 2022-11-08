<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- 2022.11.08 20:16 - 20:23 --%>
	
	<%
	
		request.setCharacterEncoding("utf-8");
		
		String me = request.getParameter("me");
		String com = request.getParameter("com");
		String data = "";
		
		if (me.equals("바위")) { data = "비겼다."; }
		else if (me.equals("보")) { data = "내가 이겼다."; }
		else if (me.equals("가위")) { data = "내가 졌다."; }
		else { data = "잘못된 입력값 입니다. 가위 혹은 바위 혹은 보를 입력해주세요."; }
	
	%>
	
	<h2>me : <%=me %></h2>
	<h2>com : <%=com %></h2>
	
	<h2>Result : <%=data %></h2>
	
</body>
</html>