<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select</title>
</head>
<body>
	<%
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC", "root", "1234");
			
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER");
			rs = pstmt.executeQuery();
	
	%>
	
		<table border=1>
			<tr>
				<th>ID</th>
				<th>PASSWORD</th>
				<th>NAME</th>
				<th>JOIN DATE</th>
			</tr>
		
	
	<%	
		
			while (rs.next()) {
				
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nm = rs.getString(3);
				String dt = rs.getString(4);
	
	%>
	
			<tr>
				<td><%=id %></td>
				<td><%=pw %></td>
				<td><%=nm %></td>
				<td><%=dt %></td>
			</tr>
	
	<%	
			
			}
	
	%>
	
		</table>
	
	<%
			
			
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