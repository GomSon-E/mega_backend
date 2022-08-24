package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력  (직접)
	meRight 에 가위바위보 입력 (직접)
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class IfEx28_테스트문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("왼손에 낼 것을 입력해주세요 : 가위(0) 바위(1) 보(2)");
		int meLeft = sc.nextInt();
		System.out.println("오른손에 낼 것을 입력해주세요 : 가위(0) 바위(1) 보(2)");
		int meRight = sc.nextInt();
		
		int comLeft = rd.nextInt(3);
		int comRight = rd.nextInt(3);
		
		System.out.println("최종적으로 낼 것을 정해주세요 : 왼손(0) 오른손(1)");
		int meFinal = sc.nextInt();
		
		

	}

}
