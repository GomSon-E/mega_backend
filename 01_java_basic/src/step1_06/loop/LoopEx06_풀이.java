package step1_06.loop;

import java.util.Scanner;

//2022.08.23 20:17 - 20:20

/*
 * # 반복문 종료(-100)
 * 
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 * 예)
 * 숫자 입력[EXIT:-100] : 1
 * 숫자 입력[EXIT:-100] : 3
 * 숫자 입력[EXIT:-100] : 4
 * 숫자 입력[EXIT:-100] : -100
 * 프로그램 종료
 * 
 */

public class LoopEx06_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Boolean flag = true;
		
		while (flag) {
			System.out.print("숫자 입력[EXIT:-100] : ");
			int num = sc.nextInt();
			
			if (num == -100) {
				flag = false;
			}
		}
		
		System.out.println("프로그램 종료");
	

	}

}
