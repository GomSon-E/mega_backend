package step1_05.controlStatement;

//2022.08.19 21:30 - 21:31

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		System.out.print("번호를 입력해주세요 (0. 앞면  1. 뒷면)");
		int choice = scan.nextInt();

		if (coin == choice) System.out.println("정답");
		if (coin != choice) System.out.println("오답");

	}

}
