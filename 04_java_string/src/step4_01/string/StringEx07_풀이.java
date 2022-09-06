package step4_01.string;

import java.util.Arrays;

//2022.09.06 19:46 - 19:48

public class StringEx07_풀이 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		String[] temp = str.split(",");
		
		for (int i = 0; i < temp.length; i++) {
			name[i] = temp[i].split("/")[0];
			score[i] = Integer.parseInt(temp[i].split("/")[1]);
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
				
		
		

	}

}
