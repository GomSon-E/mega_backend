package step9_01.atm_v1_analysis;

import java.util.Scanner;

public class UserManager {
	
	Scanner sc = new Scanner(System.in);

	User[] user = null;
	int userCnt = 0;
	
	void printAllUser() {
		for (int i = 0; i < userCnt; i++) {
			user[i].printAccount();
		}
	}
	
	void addUser() {
		
		if (userCnt == 0) {
			user = new User[1];
		}
		
		else {
			User[] temp = user;
			user = new User[userCnt + 1];
			
			for (int i = 0; i < temp.length; i++) {
				user[i] = temp[i];
			}
			temp = null;
		}
		
		System.out.println("[가입] 아이디를 입력하세요 : ");
		String id = sc.next();
		
		boolean isDuple = false;
		for (int i = 0; i < userCnt; i++) {
			if (user[i].id.equals(id)) {
				isDuple = true;
			}
		}
		
		if (!isDuple) {
			
			user[userCnt] = new User();
			user[userCnt].id = id;
			System.out.println("[메시지] ID : '" + id+ "' 가입 되었습니다.\n");
			userCnt++;
			
		}
		else {
			
			System.out.println("[메시지] '"+ id + "'은 이미 가입된 아이디 입니다.\n");
			
		}
		
	}
	
	User getUser(int idx) {
		
		return user[idx];
		
	}
	
	int logUser() {
		
		int identifier = -1;
		
		System.out.println("[입력] 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for (int i = 0; i < userCnt; i++) {
			
			if (id.contentEquals(user[i].id)) {
				identifier = i;
				System.out.println("[" + user[identifier].id + "] 님 로그인.\n");
				break;
			}
			
		}
		
		return identifier;		
		
	}
	
	void leave() {
		
		System.out.println("[입력] 탈퇴할 아이디를 입력하세요 : ");
		String id = sc.next();
		
		int identifier = -1;
		
		for (int i = 0; i < userCnt; i++) {
			if (id.equals(user[i].id)) {
				identifier = i;
			}
		}
		
		if (identifier == -1) {
			System.out.println("[메시지] 아이디를 다시 확인하세요.");
		}
		else {
			
			System.out.println("ID : '" +user[identifier].id + "' 가 탈퇴되었습니다.");
			
			User[] temp = user;
			user = new User[userCnt--];
			
			for (int i = 0; i < temp.length; i++) {
				if (i < identifier) {
					user[i] = temp[i];
				}
				else {
					user[i] = temp[i + 1];
				}
			}
			
			userCnt--;
			
		}
		
	}
	
}
