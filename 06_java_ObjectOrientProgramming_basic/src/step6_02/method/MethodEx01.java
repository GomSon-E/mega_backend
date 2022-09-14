package step6_02.method;

/*
 *  # 클래스의 구성요소
 *  
 *  [1] 멤버변수 , 필드
 *  [2] 메서드
 * 
 * 
 *  # 메서드 
 *  
 *  - 클래스 기반 언어에서 클래스 내부에 정의되어 있다. 
 *  - 메서드는 프로그램이 실행되고 있을 때 클래스에서 생성된 인스턴스와 관련된 동작을 정의한다.
 *  
 *  [ 형태 ]
 * 
 * 	1) void : return 타입 (int , double , char , String , int[] , Product , ....)
 * 	2) printMenu  : 메서드명 ( 주로 소문자로 시작하고 동사형태로 작명한다. )
 *  3) ()   : 입력인수 (파라메타 , 매개변수 , 아규먼트 , 인자)
 *  4) {}   : 메서드의 영역
 *
 */ 

class MethodEx {
	
	// // 메서드 정의부
	// 결과타입 메서드이름(입력값) {
	// 	 return 결과물;
	// }
	
	void printMenu() {  // 메서드 이름은 동사 형태로 작성한다.
		
		System.out.println("==============");
		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 회원가입");
		System.out.println("4. 정보조회");
		System.out.println("5. 회원탈퇴");
		System.out.println("6. 종료");
		System.out.println("==============\n");
		
		// return;		// return 값이 없을 경우, return을 생략할 수 있다.
		
	}
	
}

public class MethodEx01 {

	public static void main(String[] args) {
		
		MethodEx methodEx = new MethodEx();
		
		// // 메서드 호출부
		// 객체.메서드명(); 형태로 메서드를 호출한다.
		methodEx.printMenu();
		methodEx.printMenu();
		methodEx.printMenu();

	}

}
