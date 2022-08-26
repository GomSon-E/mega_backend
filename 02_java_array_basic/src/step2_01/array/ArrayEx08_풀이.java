package step2_01.array;

import java.util.Arrays;
import java.util.Random;

//2022.08.26 21:03 - 21:08

/*
 * # OMR카드
 * 
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * hgd     = {1, 1, 4, 4, 3}
 * 정오표  = {O, X, O, X, X}
 * 성적    = 40점
 */


public class ArrayEx08_풀이 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		char[] ox = new char[5];
		int grade = 0;
		
		for (int i = 0; i < ox.length; i++) {
			hgd[i] = rd.nextInt(5) + 1;
		}
		
		for (int i = 0; i < ox.length; i++) {
			if (answer[i] == hgd[i]) {
				ox[i] = 'O';
				grade += 20;
			}
			else {
				ox[i] = 'X';
			}
		}
	
		System.out.println("정오표  = " + Arrays.toString(ox));
		System.out.println("성적    = " + grade + "점");
		
	}
	
}
