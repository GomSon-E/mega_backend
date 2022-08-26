package step1_05.controlStatement;

// 완료

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
		int meSelection = sc.nextInt();
		int meFinal = 0;
		if (meSelection == 0) {
			meFinal = meLeft;
		}
		else if (meSelection == 1) {
			meFinal = meRight;
		}
		
		int comSelection = rd.nextInt(1);
		int comFinal = 0;
		if (comSelection == 0) {
			comFinal = comLeft;
		}
		else if (comSelection == 1) {
			comFinal = comRight;
		}
		
		// 판정 가위(0) 바위(1) 보(2)
		System.out.println("유저의 최종결정 : " + meFinal);
		System.out.println("컴퓨터의 최종결정 : " + comFinal);
		
		if (meFinal == comFinal) {
			System.out.println("비겼습니다.");
		}
		else if (meFinal - comFinal == 1 || meFinal - comFinal == -2) {
			System.out.println("이겼습니다.");
		}
		else {
			System.out.println("졌습니다");
		}

	}

}
