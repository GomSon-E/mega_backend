package step1_05.controlStatement;

import java.util.Scanner;

//2022.08.19 19:24 - 19:26

/*
 * # 가위(0)바위(1)보(2) 게임[1단계]
 * 
 * 1. com은 바위(1)만 낼 수 있다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */


public class IfEx03_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int com = 1;
		
		System.out.print("숫자를 입력해주세요 : ");
		int me = scan.nextInt();
		
		if (me == com) System.out.println("비겼다!");
		else if (me > com) System.out.println("내가 이겼다!");
		else System.out.println("내가 졌다!");
		
		scan.close();
	}

}
