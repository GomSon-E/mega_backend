package step1_06.loop;

//2022.08.23 21:03 - 21:13

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */

public class LoopEx09_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = sc.nextInt();
			
			// 입금
			if (selectMenu == 1) {
				System.out.print("입금할 금액을 입력해주세요 : ");
				int in = sc.nextInt();
				System.out.println("입금하였습니다.");
				myMoney += in;
			}
			
			// 출금
			else if (selectMenu == 2) {
				System.out.print("출금할 금액을 입력해주세요 : ");
				int out = sc.nextInt();
				
				if (out > myMoney) {
					System.out.println("잔액이 부족하여 출금에 실패하였습니다.");
				}
				else {
					System.out.println("출금하였습니다.");
					myMoney -= out;
				}
				
			}
			
			// 이체
			else if (selectMenu == 3) {
				System.out.print("이체할 계좌번호를 입력해주세요 : ");
				int transAcc = sc.nextInt();
				
				System.out.print("이체할 금액을 입력해주세요 : ");
				int transMoney = sc.nextInt();
				
				if (transAcc != yourAcc) {
					System.out.println("입력한 계좌번호가 맞지 않습니다. 다시 시도해주세요.");
				}
				else if (transMoney > myMoney) {
					System.out.println("잔액이 부족하여 이체에 실패하였습니다.");
				}
				else {
					myMoney -= transMoney;
					yourMoney += transMoney;
					System.out.println("이체하였습니다.");
				}
				
			}
			
			// 조회
			else if (selectMenu == 4) {
				System.out.println("현재 " + myAcc +"님의 잔액은 "+ myMoney + "원입니다.");
				System.out.println("현재 " + yourAcc +"님의 잔액은 "+ yourMoney + "원입니다.");
			}
			
			// 종료
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		sc.close();
		
	}

}
