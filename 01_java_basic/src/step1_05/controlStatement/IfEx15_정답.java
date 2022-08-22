package step1_05.controlStatement;

import java.util.Random;

//2022.08.19 21:32 - 21:33

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_정답 {

	public static void main(String[] args) {
	
		Random rd = new Random();
		
		int num = rd.nextInt(10);
		
		if (num < 3)  System.out.println("당첨");
		if (num >= 3)  System.out.println("꽝");
		
	}

}
