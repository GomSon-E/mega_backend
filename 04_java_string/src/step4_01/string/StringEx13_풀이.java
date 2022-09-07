package step4_01.string;

import java.util.Arrays;

//2022.09.07 19:37 - 19:41

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_풀이 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		String temp = "";
		
		for (int i = 0; i < names.length; i++) {
			for (int j = i; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}	
		}
		
		System.out.println(Arrays.toString(names));

	}

}
