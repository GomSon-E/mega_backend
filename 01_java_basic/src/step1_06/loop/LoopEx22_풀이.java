package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

//2022.08.24 21:11 - 21:18

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx22_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int num = rd.nextInt(100) + 1;
		int point = 100;
		
		System.out.println(num);
		
		for (int i = 0; i < 20; i ++) {
			System.out.print("1부터 100까지의 숫자 중 하나입니다.");
			int response = sc.nextInt();
			
			if (response == num) {
				System.out.println("정답입니다.");
				break;
			}
			else if (response > num) {
				System.out.println("DOWN");
				point -= 5;
			}
			else if (response < num) {
				System.out.println("UP");
				point -= 5;
			}
		}
		
		System.out.println(point + "점 입니다.");
	}

}
