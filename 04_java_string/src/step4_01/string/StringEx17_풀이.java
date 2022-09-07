package step4_01.string;

//2022.09.07 20:18 - 20:18

import java.util.Arrays;

//2022.09.07 20:19 - 20:36

import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */


public class StringEx17_풀이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		char[] textArr = new char[text.length()];
		
		for (int i = 0; i < text.length(); i++) {
			textArr[i] = text.charAt(i);
		}
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		int wordIdx = 0;
		
		System.out.print("바꿀 단어를 입력하세요 : ");
		String replace = scan.nextLine();
		char[] replaceArr = new char[replace.length()];
		
		for (int i = 0; i < replace.length(); i++) {
			replaceArr[i] = replace.charAt(i);
		}
		
		int sameCnt = 0;
		int sameEnd = 0;
		
		for (int i = 0; i < textArr.length - word.length(); i++) {
			if (word.charAt(wordIdx) == textArr[i]) {
				sameCnt++;
				wordIdx++;
			}
			
			if (sameCnt == word.length()) {
				sameEnd = i;
				break;
			}
		}
		
		int replaceIdx = 0;
		
		for (int i = sameEnd + 1 - word.length(); i < word.length(); i++) {
			textArr[i] = replaceArr[replaceIdx];
			replaceIdx++;
		}
		
		String result = "";
		
		for (int i = 0; i < textArr.length; i++) {
			result += textArr[i];
		}
		
		System.out.println(result);
		
	}

}
