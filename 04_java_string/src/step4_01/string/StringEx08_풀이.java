package step4_01.string;

//2022.09.06 20:10 - 20:12

public class StringEx08_풀이 {

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		
		String str = "";
				
		for (int i = 0; i < score.length; i++) {
			str += name[i] + "/" + score[i];
			if (i != score.length - 1) {
				str += ",";
			}
		}
		
		System.out.println(str);

	}

}
