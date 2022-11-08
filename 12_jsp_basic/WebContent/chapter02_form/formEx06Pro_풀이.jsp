<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- 2022.11.08 20:28 - 20:45 --%>

	<%
	
		request.setCharacterEncoding("UTF-8");
		
		double height = Double.parseDouble(request.getParameter("height"));
		String withParents = request.getParameter("withParents");
		
		String result = "놀이기구를 이용할 수 있습니다.";
		
		if (height < 120.0 && withParents.equals("no")) {
			result = "놀이기구를 이용할 수 없습니다.";
		}
	
	%>
	
	<h1>결과 : <%=result %></h1>
	
</body>
</html>