package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * 
 * */

public class StringEx02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String name = "제임스고슬링";
		
		System.out.print("이름을 입력하세요 : ");
		String getName = scan.next();
		
		// == 비교 불가
		if (getName == name) System.out.println("제임스고슬링 입니다.");
		else				 System.out.println("제임스고슬링이 아닙니다.");
		
		// equals() 비교 가능
		if (getName.equals(name)) System.out.println("제임스고슬링 입니다.");
		else				 	  System.out.println("제임스고슬링이 아닙니다.");

		scan.close();
		
	}

}
