package step2_01.array;

//2022.08.29 20:## - 20:##

import java.util.Scanner;

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */


public class ArrayEx10_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1  = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2  = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3  = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel       = 0;
		boolean isRun = true;
		int[] target  = new int[9]; 
		boolean isWin = false;
		
		while (isRun) {
			
			isWin = false;
					
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
			
			if (sel == 1) { target = lotto1; }
			else if (sel == 2) { target = lotto2; }
			else if (sel == 3) { target = lotto3; }
			else if (sel == 0) { isRun = false; }
			
			if (sel == 1 || sel == 2 || sel == 3) {
				
				for (int i = 2; i < 9; i++) {
					if (target[i-2] == 7 && target[i-1] == 7 && target[i] == 7) {
						isWin = true;
						break;
					}
				}
				
				if (isWin) { System.out.println("당첨된 복권입니다."); }
				else { System.out.println("당첨되지 않은 복권입니다."); }
				
			}
			
			
		}
		
	}
}
