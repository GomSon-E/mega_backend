package step1_05.controlStatement;

//2022.08.22 20:36 - 20:45

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx23_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;
		int operator = rd.nextInt(4) + 1;
		
		int answer = 0;
		
		if(operator == 1) {
			answer = num1 + num2;
		}
		else if(operator == 2) {
			answer = num1 - num2;
		}
		else if(operator == 3) {
			answer = num1 * num2;
		}
		else if(operator == 4) {
			answer = num1 / num2;
		}
		
		System.out.println(num1 + " ? " + num2 + " = " + answer);
		
		int response = sc.nextInt();
		
		if (operator == response) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		
	}

}
