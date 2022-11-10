<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Process</title>
</head>
<body>
	<%
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC", "root", "1234");
			
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				pstmt = conn.prepareStatement("DELETE FROM MEMBER WHERE ID = ?");
				pstmt.setString(1, id);
				pstmt.executeUpdate();
				
		%>
		
				<script>
					alert("회원삭제 되었습니다.");
					history.go(-2);
				</script>
		
		<%	
			
			} else {
				
		%>
				
				<script>
					alert("아이디나 비밀번호를 다시 확인해주십시오.");
					history.go(-1);
				</script>
		
		<%	
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			pstmt.close();
			conn.close();
		}
	
	%>
</body>
</html>