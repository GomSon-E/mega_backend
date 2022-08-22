package step1_05.controlStatement;

/*
 * 
 * # if ~ else문
 * 
 * 	[ 형식 ]
 * 
 * 	if (조건식) {
 * 		명령어;
 * 	} else {
 * 		명령어;
 * 	}
 * 
 *  - if없이 else가 단독으로 올 수 없다.
 *  - else를 중복해서 여러번 사용할 수 없다.
 *  - if와 같은라인에 작성한다. (들여쓰기 라인정렬)
 *  - else 뒤에는 조건식을 쓸수 없다.
 *  - if문과 else문 사이에는 명령어가 올 수 없다.
 * 
 * 
 *  # if ~ else if문
 *  
 *  [ 형식 ]
 *  
 *  if (조건식) {
 *  	명령어;
 *  } else if (조건식) {
 *  	명령어;
 *  } else if (조건식) {
 *  	명령어;
 *  }
 *  
 *  - else if문 조건은 '다중 택일'로 참인 조건식을 만나면
 *    이하 조건은 실행하지 않는다.
 *  - if없이 단독으로 사용할 수 없다.
 *  - else문과 같이 사용할 수 있지만 else문은 맨 아래에 위치해야 한다.
 *  - if문과 else if문 사이에는 명령어가 올 수 없다.
 * 
 * 
 * */


public class IfEx17 {

	public static void main(String[] args) {

		int finalScore = 61;
		
		if (finalScore >= 60) { 			// 조건식이 true일 때 실행
			System.out.println("합격");
		}
		if (finalScore < 60) {   			// 조건식이 true일 때 실행
			System.out.println("불합격");
		}
		
		if (finalScore >= 60) {  			// 조건식이 true일 때 실행
			System.out.println("합격");
		}
		else {					 			// 조건식이 false일 때 실행
			System.out.println("불합격");
		}
		
		
		System.out.println();
		
		
		finalScore = 85;
		
		if (finalScore > 90) {				// 조건식이 true일 때 실행
			System.out.println('A');
		}
		else if (finalScore > 80) {			// 위 조건식이 false이며 조건식이 true일 때 실행
			System.out.println('B');
		}
		else if (finalScore > 70) {			// 위 조건식이 false이며 조건식이 true일 때 실행
			System.out.println('C');
		}
		
		System.out.println();
		
		if (finalScore > 70) {				// 조건식이 true일 때 실행
			System.out.println('C');
		}
		else if (finalScore > 80) {			// 위 조건식이 false이며 조건식이 true일 때 실행
			System.out.println('B');
		}
		else if (finalScore > 90) {			// 위 조건식이 false이며 조건식이 true일 때 실행
			System.out.println('A');
		}
		
		
	}

}
