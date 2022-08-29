package step2_01.array;

//2022.08.29 19:20 - 19:25

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 'O'로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [O] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */


public class ArrayEx09_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char seat[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
		int cnt = 0;
		
		boolean isRunning = true;
		
		while (isRunning) {
			System.out.println(Arrays.toString(seat));
			System.out.println();
			System.out.println("1. 좌석 예매");
			System.out.println("2. 종료");
			int select = sc.nextInt();
			
			if (select == 1) {
				System.out.print("좌석선택(1~7) :");
				int index = sc.nextInt();
				
				if (seat[index-1] == 'X') {
					seat[index-1] = 'O';
					cnt ++;					
				}
				else {
					System.out.println("이미 예매된 좌석입니다.");
				}
			}
			else if (select == 2) {
				isRunning = false;
				System.out.println("-------------------");
				System.out.println("매출액 : " + (cnt * 12000) + "원");
			}
		}
		
	}
	
}
