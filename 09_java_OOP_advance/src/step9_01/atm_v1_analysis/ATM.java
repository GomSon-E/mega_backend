package step9_01.atm_v1_analysis;

import java.util.Scanner;

public class ATM {
	
	Scanner sc = new Scanner(System.in);
	UserManager um = new UserManager();
	int identifier = -1;

	void printMainMenu() {
		
		while (true) {
			
			System.out.println("\n[ MEGA ATM ]");
			System.out.print("[1.로그인] [2.로그아웃] [3.회원가입] [4.회원탈퇴] [0.종료] : ");
			int sel = sc.nextInt();
			
			if (sel == 1)  		login();
			else if (sel == 2)  logout();
			else if (sel == 3)  join();
			else if (sel == 4)  leave();
			else if (sel == 0)  break;
		}
		
		System.out.println("[메시지] 프로그램을 종료합니다.");
		
	}
	
	void login() {
		
		identifier = um.logUser();
		
	}
	
}
