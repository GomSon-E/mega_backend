package step1_02.variable;

/*
 *  # 변수 ( variable )
 *  
 *  - 단 하나의 값을 저장할 수 있는 메모리 공간
 *  
 *  	1) 변수의 선언 그리고 초기화
 *  	
 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
 *  	변수의 초기화	: nData = 0;    // 값 저장
 *  
 *  	
 *  	2) 변수의 선언과 동시에 초기화
 *  	
 *  	int nData = 0;
 *  	
 *  
 *  
 *  	3) 변수의 특징
 *  	
 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
 * 	    3-3) 변수의 초깃값을 지정하지 않으면 가비지 데이터가 변수에 들어가 있다.
 * 			 -> 0으로 int 변수의 초깃값을 지정한다.
 * 
 * */

public class VariableEx01 {
	public static void main(String[] args) {
		
		// 1. 정수 : Integer (int)
		int memberAge; // 변수의 선언
		memberAge = 19; // 데이터를 저장
		
		// 2. 실수 : double
		double memberWeight = 80.14;
		
		// 3. 문자 : character (char)
		char memberGenderEng = 'm';
		char memberGenderKor = '남';
		
		// 4. 문자열 : String
		String subjectName = "web development";

		// 5. 참과 거짓 : boolean
		boolean isMember = true;
				
	}
}
