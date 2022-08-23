package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

//2022.08.23 20:21 - 20:24

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int num = rd.nextInt(100) + 1;		
		boolean flag = true;
		int point = 100;
		
		while (flag) {
			
			System.out.print("숫자를 입력해주세요");
			int response = sc.nextInt();
			
			if (response == num) {
				flag = false;
			}
			else {
				point -= 5;
			}
		}
		
		System.out.println(point);
		
	}

}
