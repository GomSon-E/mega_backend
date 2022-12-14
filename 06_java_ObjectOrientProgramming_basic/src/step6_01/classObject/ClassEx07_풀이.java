package step6_01.classObject;

import java.util.Arrays;

//2022.09.13 21:13 - 21:17

/*
 * # 영화관 좌석예매 : 클래스 + 변수
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

import java.util.Scanner;


class Ex07_ans {

	int[] seat = new int[7];
	int money = 0;
	int bookCnt = 0;
	
}


public class ClassEx07_풀이 {

	public static void main(String[] args) {
		
		Ex07_ans e = new Ex07_ans();
		Scanner sc = new Scanner(System.in);
		
		e.money = 12000;
		
		while (true) {
			
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if		(sel == 1) {
				System.out.println("좌석 번호를 입력해주세요 : ");
				int idx = sc.nextInt();
				
				if (e.seat[idx] == 0) {
					e.seat[idx] = 1;
					e.bookCnt++;
					System.out.println("seat : " + Arrays.toString(e.seat));
				}
				else {
					System.out.println("seat : " + Arrays.toString(e.seat));
					System.out.println("이미 예매가 완료된 좌석입니다.");
				}
			}
			else if (sel == 2) {
				System.out.println("총 매출액 : " + (e.money * e.bookCnt));
				break;
			}
		}


	}

}
