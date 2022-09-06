package step4_01.string;

import java.util.Scanner;

//2022.09.06 20:19 - 20:26

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String start = "자전거";
		System.out.println("제시어 : " + start);
		
		while (true) {
			System.out.print("입력 : ");
			String str = sc.next();
			
			if (start.charAt(start.length() - 1) == str.charAt(0)) {
				System.out.println("제시어 : " + str);
				start = str;
			}
			else if (str.equals("quit")) {
				System.out.println("- 종료 -");
				break;
			}
			else {
				System.out.println("제시어 : " + start);
			}
		}

	}

}
