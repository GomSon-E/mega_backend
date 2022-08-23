package step1_06.loop;

//2022.08.23 21:13 - 21:35

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int id = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		int loginId = 0;
		int loginPw = 0;
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			// 로그인
			if (sel == 1) {
				if (id == -1) {		
					
					System.out.print("아이디를 입력해주세요 : ");
					loginId = sc.nextInt();
					System.out.print("비밀번호를 입력해주세요 : ");
					loginPw = sc.nextInt();
					
					if (loginId == dbAcc1 && loginPw == dbPw1) {
						System.out.println("로그인 되었습니다. '1번 유저님 환영합니다.'");
						id = 1;
					}
					else if (loginId == dbAcc2 && loginPw == dbPw2) {
						System.out.println("로그인 되었습니다. '2번 유저님 환영합니다.'");
						id = 2;
					}
					else {
						System.out.println("로그인에 실패하셨습니다.");
					}
				}
				else {
					System.out.println("'현재 " + id + "번 유저님 로그인중'");
				}
			}
			
			// 로그아웃
			else if (sel == 2) {
				if (id == -1)  System.out.println("로그인 후 이용가능합니다.");
				else {
					System.out.println("로그아웃 되었습니다.");
					id = -1;
				}
			}
			
			// 입금
			else if (sel == 3) {
				if (id == -1)  System.out.println("로그인 후 이용가능합니다.");
				else if (id == 1) {
					System.out.println("입금할 금액을 입력해주세요 : ");
					int in  = sc.nextInt();
					dbMoney1 += in;
					System.out.println("입금하였습니다.");
				}
				else if (id == 2) {
					System.out.println("입금할 금액을 입력해주세요 : ");
					int in  = sc.nextInt();
					dbMoney2 += in;
					System.out.println("입금하였습니다.");
				}
			}
			
			// 출금
			else if (sel == 4) {
				if (id == -1)  System.out.println("로그인 후 이용가능합니다.");
				else if (id == 1) {
					System.out.print("출금할 금액을 입력해주세요 : ");
					int out = sc.nextInt();
					
					if (out > dbMoney1) {
						System.out.println("잔액이 부족하여 출금에 실패하였습니다.");
					}
					else {
						System.out.println("출금하였습니다.");
						dbMoney1 -= out;
					}
				}
				else if (id == 2) {
					System.out.print("출금할 금액을 입력해주세요 : ");
					int out = sc.nextInt();
					
					if (out > dbMoney2) {
						System.out.println("잔액이 부족하여 출금에 실패하였습니다.");
					}
					else {
						System.out.println("출금하였습니다.");
						dbMoney2 -= out;
					}
				}
			}
			
			// 이체
			else if (sel == 5) {
				if (id == -1)  System.out.println("로그인 후 이용가능합니다.");
				else if (id == 1) {
					System.out.print("이체할 계좌번호를 입력해주세요 : ");
					int transAcc = sc.nextInt();
					
					System.out.print("이체할 금액을 입력해주세요 : ");
					int transMoney = sc.nextInt();
					
					if (transAcc != dbAcc2) {
						System.out.println("입력한 계좌번호가 맞지 않습니다. 다시 시도해주세요.");
					}
					else if (transMoney > dbMoney1) {
						System.out.println("잔액이 부족하여 이체에 실패하였습니다.");
					}
					else {
						dbMoney1 -= transMoney;
						dbMoney2 += transMoney;
						System.out.println("이체하였습니다.");
					}
				}
				else if (id == 2) {
					System.out.print("이체할 계좌번호를 입력해주세요 : ");
					int transAcc = sc.nextInt();
					
					System.out.print("이체할 금액을 입력해주세요 : ");
					int transMoney = sc.nextInt();
					
					if (transAcc != dbAcc1) {
						System.out.println("입력한 계좌번호가 맞지 않습니다. 다시 시도해주세요.");
					}
					else if (transMoney > dbMoney2) {
						System.out.println("잔액이 부족하여 이체에 실패하였습니다.");
					}
					else {
						dbMoney2 -= transMoney;
						dbMoney1 += transMoney;
						System.out.println("이체하였습니다.");
					}
				}
			}
			
			// 조회
			else if (sel == 6) {
				if (id == -1)  System.out.println("로그인 후 이용가능합니다.");
				else if (id == 1) {
					System.out.println("현재 " + dbAcc1 +"님의 잔액은 "+ dbMoney1 + "원입니다.");
				}
				else if (id == 2) {
					System.out.println("현재 " + dbAcc2 +"님의 잔액은 "+ dbMoney2 + "원입니다.");
				}
			}
			
			// 종료
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		sc.close();
		
	}

}
