package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//2022.09.14 19:20 - 19:30

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class Ex09_ans {
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}


public class ClassEx09_풀이 {

	public static void main(String[] args) {
		
		Ex09_ans e = new Ex09_ans();
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int cnt = 0;
		
		// 카드 섞기
		while (cnt < 100) {
			int idx = rd.nextInt(10);
			int temp = e.front[idx];
			e.front[idx] = e.front[0];
			e.front[0] = temp;
			
			cnt++;
		}
		
		while (true) {
			boolean isDone = true;
			
			System.out.println(Arrays.toString(e.front));
			System.out.println(Arrays.toString(e.back));
			
			System.out.println("첫번째 카드의 인덱스를 입력해주세요 : ");
			int idx1 = sc.nextInt();
			System.out.println("두번째 카드의 인덱스를 입력해주세요 : ");
			int idx2 = sc.nextInt();
			
			
			if (e.front[idx1] == e.front[idx2]) {
				e.back[idx1] = e.front[idx1];
				e.back[idx2] = e.front[idx2];
			}
			
			for (int i = 0; i < e.back.length; i++) {
				if (e.back[i] == 0) {
					isDone = false;
					break;
				}
			}
			
			if (isDone) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
		}
		
	}

}
