package step1_06.loop;

import java.util.Scanner;

//2022.08.24 19:04 - 19:07

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx25_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num > max) {
				max = num;
			}
		}
		
		System.out.println(max);
		
		sc.close();
		
	}   
        
}       
        