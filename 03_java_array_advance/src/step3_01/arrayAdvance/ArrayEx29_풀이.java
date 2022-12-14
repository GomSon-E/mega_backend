package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//2022.09.01 21:34 - 21:41 + 2022.09.02 19:02 - 19:05

/*
 * # 숫자 야구 게임
 * 
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		    strike += 1
 *    숫자만 같고 자리가 틀리면 		ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 7 5 1        : 2b
 * 1 5 6		: 1s
 * 1 3 7        : 1s 2b
 * 2 4 9        : 없음
 * 1 7 3        : 3s  > 게임종료
 * 
 */

public class ArrayEx29_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] com = {1,7,3};
		int[] me  = new int[3];
		
		System.out.print("정답 : ");
		System.out.println(Arrays.toString(com));
		
		while (true) {
			int strike = 0;
			int ball = 0;
			
			for (int i = 0; i < me.length; i++) {
				System.out.print(i + 1 + "번째 숫자를 입력해주세요 : ");
				me[i] = sc.nextInt();
				for (int j = 0; j < i; j++) {
					if (me[i] == me[j]) {
						i--;
					}
				}
			}
			
			System.out.print(Arrays.toString(me) + " : ");
			
			for (int i = 0; i < me.length; i++) {
				if (com[i] == me[i]) {
					strike++;
				}
				for (int j = 0; j < me.length; j++) {
					if (i != j && com[i] == me[j]) {
						ball++;
					}
				}
			}
			
			if (strike > 0 && ball > 0) {
				System.out.println(strike + "s " + ball + "b");
			}
			else if (strike > 0 && ball <= 0) {
				System.out.println(strike + "s");
			}
			else if (strike <= 0 && ball > 0) {
				System.out.println(ball + "b");
			}
			
			if (strike == 3) {
				System.out.println("게임 종료");
				break;
			}
			
		}
		
		
	}
	
}
