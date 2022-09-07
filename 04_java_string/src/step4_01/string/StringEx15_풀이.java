package step4_01.string;

//2022.09.07 19:42 - 19:47

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	  문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

public class StringEx15_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		
		boolean isNum = false;
		boolean isChar = false;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) < 65) {
				isNum = true;
			}
			else if (text.charAt(i) >= 65) {
				isChar = true;
			}
		}
		
		if (isNum && isChar) {
			System.out.println("문자와 숫자가 섞여있다.");
		}
		else if (isNum && !isChar) {
			System.out.println("숫자만 있다.");
		}
		else if (!isNum && isChar) {
			System.out.println("문자만 있다.");
		}

	}

}
