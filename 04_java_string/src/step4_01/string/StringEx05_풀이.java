package step4_01.string;

//2022.09.06 19:35 - 19:40

public class StringEx05_풀이 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 34세
		
		int juminYear = Integer.parseInt(19 + jumin.substring(0, 2));
		System.out.println(2022 - juminYear + 1 + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		char juminGender = jumin.charAt(7);
		if (juminGender == '2') {
			System.out.println("여성");
		}
		else {
			System.out.println("남성");
		}

	}

}
