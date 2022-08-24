package step1_06.loop;

import java.util.Scanner;

//2022.08.24 19:18 - 19:21

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx14_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int max = 0;
		
		while (i < 3) {
			System.out.print("숫자를 입력해주세요 : ");
			int num = sc.nextInt();
			
			if (num > max) {
				max = num;
			}
			
			i++;
		} 
		
		System.out.println("최대값은 " + max + " 입니다.");

	}

}

