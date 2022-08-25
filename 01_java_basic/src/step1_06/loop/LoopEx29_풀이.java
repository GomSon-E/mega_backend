package step1_06.loop;

//2022.08.24 20:13 - 20:16

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

public class LoopEx29_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 하나 입력해주세요 : ");
		int num = sc.nextInt();
		
		for (int i = 2; i <= num; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				System.out.print(i + " ");
			}
		}
		
	}
	
}
