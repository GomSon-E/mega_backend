<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Process</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nm = request.getParameter("nm");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC", "root", "1234");
			
			pstmt = conn.prepareStatement("INSERT INTO MEMBER VALUES(?,?,?,NOW())");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, nm);
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();			
		} finally {
			pstmt.close();
			conn.close();
		}
	
	%>
	
	<script >
		alert("회원가입 되었습니다.");
		history.go(-2);
	</script>
</body>
</html>