package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

//2022.08.24 21:08 - 21:11

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

public class LoopEx21_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int point = 0;
		
		for (int i = 0; i < 5; i++) {
			
			int num1 = rd.nextInt(9) + 1;
			int num2 = rd.nextInt(9) + 1;
			
			System.out.println(num1 + " * " + num2 + " = ?");
			int response = sc.nextInt();
			
			if (response == num1 * num2) {
				point += 20;
			}
		}
		
		System.out.println(point + "점 입니다");
	}

}
