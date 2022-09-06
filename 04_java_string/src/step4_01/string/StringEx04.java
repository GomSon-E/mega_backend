package step4_01.string;

// 문자열 데이터 형변환

public class StringEx04 {

	public static void main(String[] args) {
		
		// [1] 문자열 > 숫자 : 형변환
		
		String birth = "2022";
		System.out.println(birth + 1);			   	// 출력 : "20221"
		int nbirth = Integer.parseInt(birth);	  	// Integer.parseInt("문자열"); 메서드 사용
		System.out.println(nbirth + 1);			  	// 출력 : "2023"
		
		// [2] 숫자 > 문자열 : 형변환
		int salary = 2000000;
		
		// 2-1) + "" 사용
		String str1 = salary + "";
		System.out.println(str1 + 100000);			// 출력 : "2000000100000"
		
		// 2-2) Integer.toString(숫자) 사용
		String str2 = Integer.toString(salary);
		System.out.println(str2 + 100000);			// 출력 : "2000000100000"
		
		// 2-3) String.valueOf(숫자) 사용
		String str3 = String.valueOf(salary);
		System.out.println(str3 + 100000);			// 출력 : "2000000100000"
		
	}
	
}
