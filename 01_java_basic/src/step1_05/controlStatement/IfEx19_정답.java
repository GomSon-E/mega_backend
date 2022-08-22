package step1_05.controlStatement;

//2022.08.22 19:44 - 19:50

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("이체할 계좌번호를 입력해주세요.");
		int sendtoAcc = scan.nextInt();
		
		if (sendtoAcc == yourAcc) {
			System.out.println("이체할 금액을 입력해주세요.");
			int sendMoney = scan.nextInt();
			
			if (myMoney >= sendMoney) {
				System.out.println("이체 가능합니다.");
				myMoney -= sendMoney;
				yourMoney += sendMoney;
			}
			else {
				System.out.println("이체 불가능합니다.");
			}
		}
		else {
			System.out.println("계좌번호를 잘못 입력하셨습니다.");
		}
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
	
	}

}
