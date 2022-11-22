<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 2022.11.22 21:06 - 22:16 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습문제</title>
</head>
<body>

	<!--  
	
		# 가위 바위 보
		
		1. com은 바위만 낼 수 있다.
		2. me는 가위 바위 보 중에 하나의 값을 JstlEx07_정답 Servlet파일에서 넘겨받는다.
		3. me의 데이터에 따라
			1) 비겼다.
			2) 내가 이겼다.
			3) 내가 졌다.			를 출력한다.	
	-->
	
	<p>${me}</p> 
	
	<c:choose>
		<c:when test='${me eq "바위" }'>
			<p>비겼다.</p>
		</c:when>
		<c:when test='${me eq "보" }'>
			<p>내가 이겼다.</p>
		</c:when>
		<c:otherwise>
			<p>내가 졌다.</p>
		</c:otherwise>
	</c:choose>
 	
</body>
</html>