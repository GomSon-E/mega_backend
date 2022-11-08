<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- 2022.11.08 20:33 - 20:37 --%>

	<%
	
		request.setCharacterEncoding("UTF-8");
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int answer = Integer.parseInt(request.getParameter("answer"));

		String result = "땡";
		
		if (answer == num1 * num2) {
			result = "정답";
		}
	
	%>
	
	<h1><%=num1 %> * <%=num2 %> = <%=num1 * num2 %></h1>
	<h1>결과 : <%=result %></h1>

</body>
</html>