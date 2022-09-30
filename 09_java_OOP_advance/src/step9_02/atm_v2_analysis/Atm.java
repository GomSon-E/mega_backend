package step9_02.atm_v2_analysis;

import java.util.Scanner;

public class Atm {
	
	Scanner sc = new Scanner(System.in);
	int identifier = -1;
	FileManager fm = FileManager.getInstance();
	UserManager um = UserManager.getInstance();
	AccountManager am = AccountManager.getInstance();
	
	void play() {
		
		fm.load();
		um.printAllUser();
		
		while (true) {
			
			System.out.println("[ATM]");
			System.out.println("[1.회원가입]\n[2.로그인]\n[0.종료]");
			System.out.println("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if (sel == 1)  		join();
			else if (sel == 2)  login();
			else if (sel == 0)  break;
			
		}		
	}
	
	void login() {
		
		identifier = um.logUser();
		if (identifier != -1) loginMenu();
		else System.out.println("[메세지]아이디와 패스워드를 확인해주세요.");
		
	}
	
	void loginMenu() {
		
		while (true) {
			
			System.out.println("[" + um.userList[identifier].id + "님, 환영합니다.]");
			System.out.println("[1.계좌생성]\n[2.계좌삭제]\n[3.조    회]\n[4.회원탈퇴]\n[0.로그아웃]");
			System.out.println("메뉴 선택 : ");
			int selectMenu = sc.nextInt();
			
			if (selectMenu == 1) {
				am.createAcc(identifier);
				fm.save();
			}
			else if (selectMenu == 2) {
				// // //
			}
			else if (selectMenu == 3) {
				am.printAcc(identifier);
			}
			else if (selectMenu == 4) {
				identifier = um.deleteMember(identifier);
				break;
			}
			else if (selectMenu == 0) {
				identifier = -1;
				System.out.println("로그아웃 되었습니다.");
				break;
			}
			
		}
		
	}
	
	void join() {
		um.joinMember();
	}
	
}
