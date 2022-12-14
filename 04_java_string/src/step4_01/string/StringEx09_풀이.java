package step4_01.string;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//2022.09.06 20:13 - 20:19

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int cnt = 0;
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		while (cnt < 100) {
			int idx = rd.nextInt(4);
			String temp = words[idx];
			words[idx] = words[0];
			words[0] = temp;
			cnt++;
		}
		
		for (int i = 0; i < words.length; i++) {
			System.out.println("문제 : " + words[i]);
			System.out.print("입력 : ");
			String str = sc.next();
			
			if (!(str.equals(words[i]))) {
				i--;
			}
		}

	}

}
