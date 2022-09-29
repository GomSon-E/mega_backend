package step9_01.atm_v1_analysis;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	
	Random rd = new Random();
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
		
		if (identifier != -1) {
			printAccountMenu();
		}
		else {
			System.out.println("[메세지] 로그인실패.");
		}
		
	}
	
	void logout() {
		
		if (identifier == -1) {
			System.out.println("메시지] 로그인을 하신 후 이용하실 수 있습니다.");
		}
		else {
			identifier = -1;
			System.out.println("메시지] 로그아웃 되었습니다.");
		}
		
	}
 	
	void join() {
		
		um.addUser();
		
	}
	
	void leave() {
		um.leave();
	}
	
	void printAccountMenu() {
		
		while (true) {
			
			System.out.println("[1.계좌생성] [2.계좌삭제] [3.조회] [0.로그아웃] : ");
			int sel = sc.nextInt();
			
			String makeAccount = Integer.toString(rd.nextInt(90001) + 10000);
			int curAccCount = um.user[identifier].accCount;
			
			// 계좌생성
			if (sel == 1) {
				
				System.out.println(curAccCount);
				
				if (curAccCount == 0) {
					um.user[identifier].acc = new Account[1];			
				}
				else  {
					Account[] temp = um.user[identifier].acc;
					um.user[identifier].acc = new Account[curAccCount + 1];
					for (int i = 0; i < temp.length; i++) {
						um.user[identifier].acc[i] = temp[i];
					}
				}
				
				um.user[identifier].acc[curAccCount] = new Account();
				um.user[identifier].acc[curAccCount].number = makeAccount;
				um.user[identifier].accCount++;
				
				System.out.println("[메시지]'"+makeAccount +"'계좌가 생성되었습니다.\n");
				
			}
			
			// 계좌 삭제
			else if (sel == 2) {
				System.out.println(curAccCount);
				
				if (curAccCount == 0) {
					System.out.println("[메시지] 더 이상 삭제할 계좌가 없습니다.\n");
					continue;
				}
				else if (curAccCount == 1) {
					System.out.println("[메시지] 계좌번호 :'"+ um.user[identifier].acc[0].number+"' 삭제 되었습니다.\n");
					um.user[identifier].acc = null;
				}
				else {
					
					System.out.println("삭제하고 싶은 계좌 번호를 입력하세요 : ");
					String deleteAccNum = sc.next();
					
					int delIdx = -1;
					for (int i = 0; i < curAccCount; i++) {
						if (deleteAccNum.equals(um.user[identifier].acc[i].number)) {
							delIdx = -1;
						}
					}
					
					if (delIdx == -1) {
						System.out.println("[메시지] 계좌번호를 확인하세요.\n");
						continue;
					}
					else {
						
						System.out.println("[메시지] 계좌번호 :'"+ um.user[identifier].acc[delIdx].number+"' 삭제 되었습니다.\n");
						
						Account[] temp = um.user[identifier].acc;
						um.user[identifier].acc = new Account[curAccCount + 1];
						
						for (int i = 0; i < temp.length; i++) {
							if (i < delIdx) {
								um.user[identifier].acc[i] = temp[i];
							}
							else {
								um.user[identifier].acc[i] = temp[i + 1];
							}
						}
						
					}
					
					um.user[identifier].accCount--;
				}
				
			}
			
			// 조회
			else if (sel == 3) {
				
				if (um.user[identifier].accCount == 0) {
					System.out.println("[메시지] 생성된 계좌가 없습니다.\n");
				}
				else {
					um.user[identifier].printAccount();
				}
				
			}
			
			// 로그아웃
			else if (sel == 4) {
				logout();
				break;
			}
			
		}
		
	}
	
}
