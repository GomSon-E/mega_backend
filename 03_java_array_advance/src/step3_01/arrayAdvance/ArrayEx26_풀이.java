package step3_01.arrayAdvance;

//2022.09.01 20:13 - 20:29

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */


public class ArrayEx26_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
	
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		int order = 1;	
		
		
		for (int i = 0; i < front.length; i++) {
			front[i] = i +1;
		}
		for (int i = 0; i < back.length; i++) {
			back[i] = i + 10;
		}
		
		int cnt = 0;
		while (cnt < 100) {
			int front_rd_idx = rd.nextInt(9);
			int back_rd_idx = rd.nextInt(9);
			
			int temp = front[front_rd_idx];
			front[front_rd_idx] = back[back_rd_idx];
			back[back_rd_idx] = temp;
			cnt++;
		}
		
		while (true ) {
			System.out.println(Arrays.toString(front));
			System.out.println(Arrays.toString(back));
			
			System.out.print("숫자를 입력해주세요 : ");
			int idx = sc.nextInt();
			
			if (idx < 9) {
				if (front[idx] == order) {
					front[idx] = 0;
					order++;
				}
			}
			else {
				if (back[idx-9] == order) {
					back[idx-9] = 0;
					order++;
				}
			}
			
			int correctCnt = 0;
			
			for (int i = 0; i < front.length; i++) {
				if (front[i] == 0) {
					correctCnt++;
				}
			}
			for (int i = 0; i < back.length; i++) {
				if (back[i] == 0) {
					correctCnt++;
				}
			}
			
			if (correctCnt == 18) {
				System.out.println("성공하였습니다.");
				break;
			}
		}
		
		
		
		
		
	}
	
}
