package step1_05.controlStatement;

import java.util.Random;

//2022.08.22 20:19 - 20:26

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_정답 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int num = rd.nextInt(50) + 1;
		
		int firstNum = num % 10;
		int secondNum = num / 10;
		
		System.out.println(num);
		
		boolean isFirstNum = false;
		boolean isSecondNum = false;

		if (firstNum == 3 || firstNum == 6 || firstNum == 9) {
			isFirstNum = true;
		}
		if (secondNum == 3 || secondNum == 6 || secondNum == 9) {
			isSecondNum = true;
		}
		
		if (isFirstNum && isSecondNum) {
			System.out.println("짝짝");
		}
		else if (isFirstNum || isSecondNum) {
			System.out.println("짝");
		}
		else {
			System.out.println(num);
		}
		
		
		
	}

}
