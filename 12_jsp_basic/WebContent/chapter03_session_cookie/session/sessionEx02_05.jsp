<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>

	<%
	
		// session.removeAttribute("id");	// 대상만 지움
		session.invalidate();				// 전체를 지움
	
	%>
	
	<script>
		alert("로그아웃 되었습니다.");
		location.href = "sessionEx02_03.jsp"
	</script>

</body>
</html>