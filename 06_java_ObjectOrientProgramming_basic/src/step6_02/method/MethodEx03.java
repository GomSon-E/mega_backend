package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */
	
class ReturnEx {
	
	void setScore1 (int score1) {
		score1 = 100;
	}
	
	int setScore2 (int score2) {
		score2 = 100;
		return score2;
	}
	
	int testReturn () {
		
		System.out.println("리턴 전 명령어 1");
		System.out.println("리턴 전 명령어 2");
		System.out.println("리턴 전 명령어 3");
		
		return 0;
		
		// return 1, 2, 3, 4, 5 // 복수의 return 값은 불가능하다.
		
		// return을 만나는 순간 메서드가 종료되므로 return 아래의 명령어에서 error가 발생한다.		
		// System.out.println("리턴 후 명령어 1");
		// System.out.println("리턴 후 명령어 2");
		// System.out.println("리턴 후 명령어 3");
		
	}

}

public class MethodEx03 {
	
	public static void main(String[] args) {
		
		ReturnEx returnEx = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출 전의 score1 : " + score1);	// 87
		
		returnEx.setScore1(score1);
		System.out.println("메서드 호출 후의 score1 : " + score1);	// 87
	
		System.out.println("\n=================\n");
		
		int score2 = 87;
		System.out.println("메서드 호출 전의 score2 : " + score2);	// 87
		
		returnEx.setScore2(score2);
		System.out.println("메서드 호출 후의 score2 : " + score2);	// 87

		score2 = returnEx.setScore2(score2);
		System.out.println("메서드 호출 & 대입 후의 score2 : " + score2);	// 100
	}

}
