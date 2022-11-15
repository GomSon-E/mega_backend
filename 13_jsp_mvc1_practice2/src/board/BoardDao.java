package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDao {
	
	private BoardDao() {}
	private static BoardDao instance = new BoardDao();
	public static BoardDao getInstance () {
		return instance;
	}
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/step3_board_ex?serverTimezone=UTC", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getClose() {
		if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
		if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
		if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
	}
	
	// Insert
	public void insertBoard() {
		try {
			getConnection();
			
			String sql = "INSERT INTO BOARD(WRITER, EMAIL, SUBJECT, PASSWORD, REG_DATE, READ_COUNT, CONTENT)";
			sql += "VALUES(?, ?, ?, ?, NOW(), 0, ?)";
			
			pstmt = conn.prepareStatement(sql);
			// pstmt.setString(parameterIndex, x);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
	}
	
	// All List
	
	// Info Detail
	
}
