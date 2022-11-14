package step2_00_loginEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO (Data Access Object) : 데이터 접근 객체
public class MemberDao {

	// SingleTon 패턴
	private MemberDao() {}	// > new를 할 수 없게 됨
 	private static MemberDao instance = new MemberDao();
	public static MemberDao getInstance() {
		return instance;
	}
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getClose() {
		if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
		if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
		if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
	}
	
	// Join DAO
	public boolean insertMember(MemberDto memberDto) {
		
		boolean isFirstMember = false;
		
		try {
			getConnection();
			
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID = ?");
			pstmt.setString(1, memberDto.getId());
			rs = pstmt.executeQuery();
			
			if (!rs.next()) {				
				pstmt = conn.prepareStatement("INSERT INTO MEMBER VALUES (?,?,?,NOW())");
				pstmt.setString(1, memberDto.getId());
				pstmt.setString(2, memberDto.getPasswd());
				pstmt.setString(3, memberDto.getName());
				pstmt.executeUpdate();
				
				isFirstMember = true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return isFirstMember;
		
	}
	
	// Login DAO
	public boolean login(String id, String passwd) {
		boolean isValidMember = false;
		
		try {
			getConnection();
			
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID = ? AND PASSWD = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				isValidMember = true;				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return isValidMember;
	}
	
	// Delete DAO
	public boolean deleteMember(MemberDto memberDto) {
		
		boolean isDelete = false;
		
		try {
			getConnection();
			
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID = ? AND PASSWD = ?");
			pstmt.setString(1, memberDto.getId());
			pstmt.setString(2, memberDto.getPasswd());
			rs = pstmt.executeQuery();
			
			if (rs.next()) {				
				pstmt = conn.prepareStatement("DELETE FROM MEMBER WHERE ID = ?");
				pstmt.setString(1, memberDto.getId());
				pstmt.executeUpdate();
				
				isDelete = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}		
		
		return isDelete;
		
	}
	
	// Update DAO
	public boolean updateMember(MemberDto memberDto) {
		
		boolean isUpdate = false;
		
		try {
			getConnection();
			
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID = ? AND PASSWD = ?");
			pstmt.setString(1, memberDto.getId());
			pstmt.setString(2, memberDto.getPasswd());
			rs = pstmt.executeQuery();
			
			if (rs.next()) {				
				pstmt = conn.prepareStatement("UPDATE MEMBER SET NAME = ? WHERE ID = ?");
				pstmt.setString(1, memberDto.getName());
				pstmt.setString(2, memberDto.getId());
				pstmt.executeUpdate();
				
				isUpdate = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}		
		
		return isUpdate;
		
	}
	
}
