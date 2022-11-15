package step3_00_boardEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDao {
	
	private BoardDao() {}
	private static BoardDao instance = new BoardDao();
	public static BoardDao getInstance() {
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
	
	public void insertBoard(BoardDto boardDto) {
		try {
			getConnection();
			
			
			String sql = "INSERT INTO BOARD(WRITER, EMAIL, SUBJECT, PASSWORD, REG_DATE, READ_COUNT, CONTENT)";
				   sql += "VALUES(?, ?, ?, ?, NOW(), 0, ?);";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardDto.getWriter());
			pstmt.setString(2, boardDto.getEmail());
			pstmt.setString(3, boardDto.getSubject());
			pstmt.setString(4, boardDto.getPassword());
			pstmt.setString(5, boardDto.getContent());
			pstmt.executeUpdate(); 			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
	}
	
	public ArrayList<BoardDto> getAllBoard() {
		
		ArrayList<BoardDto> boardList = new ArrayList<BoardDto>();
		
		try {
			getConnection();	
			
			pstmt = conn.prepareStatement("SELECT * FROM BOARD");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardDto temp = new BoardDto();
				temp.setNum(rs.getInt("NUM"));
				temp.setWriter(rs.getString("WRITER"));
				temp.setEmail(rs.getString("EMAIL"));
				temp.setSubject(rs.getString("SUBJECT"));
				temp.setPassword(rs.getString("PASSWORD"));
				temp.setRedDate(rs.getDate("REG_DATE"));
				temp.setReadCount(rs.getInt("READ_COUNT"));
				temp.setContent(rs.getString("CONTENT"));
				boardList.add(temp);			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return boardList;
	}
	
	
	public BoardDto getOneBoard(int num) {
		
		BoardDto boardDto = new BoardDto();
		
		try {
			getConnection();
			
			pstmt = conn.prepareStatement("SELECT * FROM BOARD WHERE NUM = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				
				boardDto.setNum(rs.getInt("NUM"));
				boardDto.setWriter(rs.getString("WRITER"));
				boardDto.setEmail(rs.getString("EMAIL"));
				boardDto.setSubject(rs.getString("SUBJECT"));
				boardDto.setPassword(rs.getString("PASSWORD"));
				boardDto.setRedDate(rs.getDate("REG_DATE"));
				boardDto.setReadCount(rs.getInt("READ_COUNT"));
				boardDto.setContent(rs.getString("CONTENT"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return boardDto;
		
	}
	
	 
}
