package step4_01.string;

//2022.09.07 19:32 - 19:37

import java.util.Scanner;

/*
 * # 문자열 비교
 * 
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */

public class StringEx14_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();
		
		boolean isSame = true;
		
		if (name.length() == myName.length()) {
			String[] nameArr = name.split("");
			String[] myNameArr = myName.split("");
			
			for (int i = 0; i < myNameArr.length; i++) {
				if (nameArr[i].compareTo(myNameArr[i]) != 0) {
					isSame = false;
					break;
				}				
			}
		}
		else {
			isSame = false;
		}
		
		System.out.println(isSame);


	}

}
