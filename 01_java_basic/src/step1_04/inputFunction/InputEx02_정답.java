package step1_04.inputFunction;

//2022.08.18 21:20 - 19:24

import java.util.Scanner;

public class InputEx02_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		// 문제1) 숫자 2개를 입력받아서 합 출력		
		System.out.print("첫번째 숫자를 입력해주세요: ");
		int q1Num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력해주세요: ");
		int q1Num2 = scan.nextInt();
		System.out.println("두 숫자의 합은 " + (q1Num1 + q1Num2) + " 입니다.");
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.print("숫자를 입력해주세요: ");
		int q2 = scan.nextInt();
		System.out.println((q2 % 2) == 1);
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.print("성적을 입력해주세요: ");
		int grade = scan.nextInt();
		System.out.println(grade >= 60 && grade <= 100);
		
		scan.close();
		
	}
	
}
