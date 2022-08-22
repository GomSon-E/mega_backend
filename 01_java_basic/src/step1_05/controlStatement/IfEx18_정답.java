package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

//2022.08.22 19:38 - 19:44

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("0 : 가위 , 1 : 바위 , 2 : 보");
		
		int com = rd.nextInt(3);	// 랜덤으로 저장
		int me = scan.nextInt();		// 키보드로 입력받아 저장

		System.out.println(com);
		System.out.println(me);
		
		if (com == me ) {
			System.out.println("비겼습니다.");
		}
		else if (me - com == 1 || me - com == -2) {
			System.out.println("이겼습니다.");
		}
		else {
			System.out.println("졌습니다");
		}
		
	}

}
