package step2_00_loginEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
