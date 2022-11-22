package rentcar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import rentcar.model.CarReserveBean;
import rentcar.model.CarViewBean;
import rentcar.model.MemberBean;
import rentcar.model.RentcarBean;

public class RentcarDao {
	
	private RentcarDao() {}
	private static RentcarDao instance = new RentcarDao();
	public static RentcarDao getInstance() {
		return instance;
	}
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public void getConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/RENTCAR?serverTimezone=UTC", "root", "1234");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void getClose() {
		if (rs != null)    {try {rs.close();}    catch (SQLException e) {}}
		if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
		if (conn != null)  {try {conn.close();}  catch (SQLException e) {}}
	}
	
	
	// 회원가입 DAO
	public boolean joinMember(MemberBean bean) {

		boolean isJoinMember = false;
		
		
		try {
			
			getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID=? AND PW=?");
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPw());
			rs = pstmt.executeQuery();

			if (!rs.next()) {
				
				pstmt = conn.prepareStatement("INSERT INTO MEMBER VALUES(? , ? , ? , ? , ? , ? , ? ,?)");
				pstmt.setString(1, bean.getId());
				pstmt.setString(2, bean.getPw());
				pstmt.setString(3, bean.getEmail());
				pstmt.setString(4, bean.getTel());
				pstmt.setString(5, bean.getHobby());
				pstmt.setString(6, bean.getJob());
				pstmt.setString(7, bean.getAge());
				pstmt.setString(8, bean.getInfo());
				
				pstmt.executeUpdate();
				
				isJoinMember = true;
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return isJoinMember;
		
	}
	
	
	
	// 로그인 DAO
	public boolean login(String id, String pw) {
		
		boolean isLogin = false;
		
		
		try {
			
			getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID = ? AND PW = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				isLogin = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return isLogin;
		
	}
	
	
	//선택한 1대의 차량 정보를 조회하는 DAO
	public RentcarBean getOneCar(int no) {
		
		RentcarBean bean = new RentcarBean();
		
		
		try {
			
			getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM RENTCAR WHERE NO = ?");
			pstmt.setInt(1, no);		
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				bean.setNo(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setCategory(rs.getInt(3));
				bean.setPrice(rs.getInt(4));
				bean.setUsePeople(rs.getInt(5));
				bean.setCompany(rs.getString(6));
				bean.setImg(rs.getString(7));
				bean.setInfo(rs.getString(8));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return bean;
		
	}
	
	
	//예약 차량 정보 저장
	public void setReserveCar(CarReserveBean bean) {
		
		int num = 0;
		
		try {
			
			getConnection();
			
			//DB에 저장된 예약된 차량의 마지막 순서
			pstmt = conn.prepareStatement("SELECT MAX(RESERVE_SEQ) FROM CARRESERVE");
			rs = pstmt.executeQuery();
			
			//num 은 마지막 순서 + 1
			if (rs.next()) {
				num = rs.getInt(1) + 1;
			}
			
			String sql = "INSERT INTO CARRESERVE (RESERVE_SEQ, NO, ID, QTY, DDAY, RDAY, USEIN, USEWIFI, USENAVI, USESEAT) ";
				   sql += "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setInt(2, bean.getNo());
			pstmt.setString(3, bean.getId());
			pstmt.setInt(4, bean.getQty());
			pstmt.setInt(5, bean.getDday());
			pstmt.setString(6, bean.getRday());
			pstmt.setInt(7, bean.getUseIn());
			pstmt.setInt(8, bean.getUseWifi());
			pstmt.setInt(9, bean.getUseNavi());
			pstmt.setInt(10, bean.getUseSeat());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
	}
	
	
	//모든 차량 정보를 조회하는 DAO
	public ArrayList<RentcarBean> getAllCar() {
		
		ArrayList<RentcarBean> rentcarList = new ArrayList<>();
		
		try {
			
			getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM RENTCAR");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				RentcarBean bean = new RentcarBean();
				bean.setNo(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setCategory(rs.getInt(3));
				bean.setPrice(rs.getInt(4));
				bean.setUsePeople(rs.getInt(5));
				bean.setCompany(rs.getString(6));
				bean.setImg(rs.getString(7));
				bean.setInfo(rs.getString(8));
				
				rentcarList.add(bean);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return rentcarList;
		
	}
	
	
	
	// 전체 예약 현황(관리자)
	public ArrayList<CarViewBean> getAllReserve() {
		
		ArrayList<CarViewBean> reserveList = new ArrayList<>();
		
		try {
			
			getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM RENTCAR A2, CARRESERVE A1 WHERE A1.NO = A2.NO");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				CarViewBean bean = new CarViewBean();
				
				bean.setName(rs.getString("name"));
				bean.setId(rs.getString("id"));
				bean.setPrice(rs.getInt("price"));
				bean.setImg(rs.getString("img"));
				bean.setQty(rs.getInt("qty"));
				bean.setDday(rs.getInt("dday"));
				bean.setRday(rs.getString("rday"));
				bean.setUseIn(rs.getInt("usein"));
				bean.setUseWifi(rs.getInt("usewifi"));
				bean.setUseNavi(rs.getInt("usenavi"));
				bean.setUseSeat(rs.getInt("useseat"));
				
				reserveList.add(bean);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			getClose();
		}
		
		return reserveList;
		
	}
	
	
	// 전체 예약 현황을 조회하는 DAO(회원)
	public ArrayList<CarViewBean> getAllReserve(String id) {
		
		ArrayList<CarViewBean> carviewList = new ArrayList<>();
		
		try {
			
			getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM RENTCAR A2, CARRESERVE A1 WHERE A1.ID = ? AND A1.NO = A2.NO");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				CarViewBean bean = new CarViewBean();
				bean.setName(rs.getString("name"));
				bean.setPrice(rs.getInt("price"));
				bean.setImg(rs.getString("img"));
				bean.setQty(rs.getInt("qty"));
				bean.setDday(rs.getInt("dday"));
				bean.setRday(rs.getString("rday"));
				bean.setUseIn(rs.getInt("usein"));
				bean.setUseWifi(rs.getInt("usewifi"));
				bean.setUseNavi(rs.getInt("usenavi"));
				bean.setUseSeat(rs.getInt("useseat"));
				
				carviewList.add(bean);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return carviewList;
		
	}
	
	
	// 예약내역을 삭제하는 DAO
	public void carRemoveReserve(String id, String rday) {
		
		try {
			
			getConnection();
			pstmt = conn.prepareStatement("DELETE FROM CARRESERVE WHERE ID = ? AND RDAY = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, rday);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
	}

}
