package step9_02.atm_v2_analysis;

import java.util.Random;
import java.util.Scanner;

public class UserManager {

	private UserManager() {}
	static private UserManager instance = new UserManager();
	static public UserManager getInstance() {
		return instance;
	}
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	final int ACC_MAX_CNT = 3;
	User[] userList = null;
	int userCnt = 0;
	
	void printAllUser() {
		
		for (int i = 0; i < userCnt; i++) {
			System.out.println((i+1) + ".ID(" + userList[i].id + ")\tPW(" + userList[i].pw + ")\t");
			if (userList[i].accCnt != 0) {
				for (int j = 0; j < userList[i].accCnt; j++) {
					System.out.println("(" + userList[i].acc[j].accNumber + ":" + userList[i].acc[j].money + ")");
				}
			}
			System.out.println();
		}
		
	}
	
	// 중복되는 계좌번호가 있는지 없는지 boolean 값 리턴
	boolean getCheckAcc(String account) {
		
		boolean isDuple = false;
		
		for (int i = 0; i < userCnt; i++) {
			for (int j = 0; j < userList[i].accCnt; j++) {
				if (account.equals(userList[i].acc[i].accNumber)) {
					isDuple = true;
				}
			}
		}
		
		return isDuple;
		
	}
	
	int logUser() {
		
		int identifier = -1;
		
		System.out.print("[로그인]아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("[로그인]패스워드를 입력하세요 : ");
		String pw = sc.next();
		
		////////////
		for (int i = 0; i < UserManager.instance.userCnt; i++) {
			if (userList[i].id.equals(id) && userList[i].pw.contentEquals(pw)) {
				identifier = i;
			}
		}
		
		return identifier;
		
	}
	
	boolean checkId(String id) {
		
		boolean isDuple = false;
		
		for (int i = 0; i < userCnt; i++) {
			if (userList[i].id.equals(id)) {
				isDuple = true;
			}
		}
			
		return isDuple;
		
	}
	
	void joinMember() {
		
		System.out.print("[회원가입]아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("[회원가입]패스워드를 입력하세요 : ");
		String pw = sc.next();
		
		boolean isResult = checkId(id);
		
		// 회원가입 실패
		if (isResult) {
			System.out.println("[메세지]아이디가 중복됩니다.");
			return;
		}
		
		// 회원가입 성공
		if (userCnt == 0) {
			
		}
		
	}
	
}
