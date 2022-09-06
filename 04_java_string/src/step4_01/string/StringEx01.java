package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 입력
 * 
 *  next() : 공백을 기준으로 한단어만 입력받는다.
 * 
 * */

public class StringEx01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String getName = scan.next();   // 띄어쓰기를 제외한 문자열을 입력받는다.
		//String getName = scan.nextLine(); // 띄어쓰기를 포함한 문자열을 입력받는다.
		
		System.out.println("이름 : " + getName);
		
		scan.close();
		
	}

}
