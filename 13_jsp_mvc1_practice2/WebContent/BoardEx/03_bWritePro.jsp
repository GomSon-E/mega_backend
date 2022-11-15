<%@page import="board.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_bWritePro</title>
</head>
<body>

	<!-- 인코딩 세팅 -->
	<%
		request.setCharacterEncoding("utf-8");
	%>
	
	<!-- boardDto에 입력값 연결 -->
	<jsp:useBean id="boardDto" class="board.BoardDto">
		<jsp:setProperty property="*" name="boardDto"/>
	</jsp:useBean>
	
	<!-- DB에 값 넣기 -->
	<%
		BoardDao.getInstance().insertBoard(boardDto);
	%>
	
	<script>
		alert("새 글이 등록되었습니다.")
		location.href = "02_bWrite.jsp";
	</script>
	
</body>
</html>