package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

//2022.08.22 20:01 - 20:05

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx20_정답 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int randomNum = rd.nextInt(151) + 150;		
		int middleNum = randomNum % 100 / 10;
		
		int answer = scan.nextInt();
		
		if (middleNum == answer) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		
		
		
		
	}

}
