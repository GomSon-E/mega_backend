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
		String passwd = request.getParameter("passwd");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC", "root", "1234");
			
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID = ? AND PASSWD = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			
			rs = pstmt.executeQuery();
			
			// 아이디와 비밀번호가 일치하면 true (둘 중 하나라도 일치하지 않을 경우 쿼리문의 실행결과는 없을 것이므로 false)
			if (rs.next()) {
				pstmt = conn.prepareStatement("DELETE FROM MEMBER WHERE ID = ?");
				pstmt.setString(1, id);
				pstmt.executeUpdate();		
	%>
	
				<script>
					alert("회원탈퇴 되었습니다.");
					location.href = "00_main.jsp";
				</script>
	
	<%
			} 
			else {
	%>
				
				<script>
					alert("아이디와 패스워드를 확인하세요.");
					
					/* 
						# 한페이지 이전으로 이동하는 자바스크립트 메서드
						history.back();
						history.go(-1);
					
						+@)
						history.forward(); 한 페이지 앞으로 이동
						history.go(-2);	   두 페이지 이전으로 이동
						history.go(-3);    세 페이지 이전으로 이동
					*/ 
					
					// location.href = "03_delete.jsp";
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