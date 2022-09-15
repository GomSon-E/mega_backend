package step6_02.method;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 		- 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있다.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 )
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	
	// 입력값이 없고 결과값도 없는 경우
	void type00 () {
		
		System.out.println("==============");
		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 회원가입");
		System.out.println("4. 정보조회");
		System.out.println("5. 회원탈퇴");
		System.out.println("6. 종료");
		System.out.println("==============\n");
		
	}
	
	// 입력값은 있고 결과값은 없는 경우
	void type10 (String fileName) {
		
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 입력값은 없고 결과값은 있는 경우
	double type01() {
		return 3.141592;
	}
	
	// 입력값이 있고 결과값도 있는 경우
	int type11 (String birth) {
		
		String temp = birth.substring(0, 4);
		int age = 2022 - Integer.parseInt(temp) + 1;
		
		return age;
	}
	
}

public class MethodEx02 {

	public static void main(String[] args) {

		MethodType methodType = new MethodType();
		
		// 입력값은 없고 결과값도 없는 경우
		methodType.type00();
		
		
		// 입력값은 있고 결과값은 없는 경우
		methodType.type10("팀 버너스 리.txt");
		methodType.type10("데니스 리치.txt");
		methodType.type10("제임스 고슬링.txt");
		
		// ERROR : 파라미터의 타입이 일치해야만 한다.
		// methodType.type10('C');
		// methodType.type10(100);
		
		// ERROR : 파라미터의 개수가 일치해야만 한다.
		// methodType.type10("파일1.txt", "파일2.txt");
		// methodType.type10("파일1.txt", "파일2.txt", "파일3.txt");
		
		
		// 입력값은 없고 결과값은 있는 경우
		System.out.println("PI : " + methodType.type01());
		double pi = methodType.type01();
		System.out.println("PI : " + pi);
		
		// 입력값은 있고 결과값은 없는 경우
		System.out.println(methodType.type11("20000809") + "살");
		
		int getAge = methodType.type11("19931122");
		System.out.println(getAge + "살");
		
		if (methodType.type11("20220101") == 1) {
			System.out.println("1살");
		}
		
		
	}

}


