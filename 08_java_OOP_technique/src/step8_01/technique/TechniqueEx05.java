package step8_01.technique;

/*
 * # 싱글턴 패턴
 * 
 *  - 객체를 1번만 생성하고 싶을 때 사용하는 기법
 *  
 *  - 싱글턴 패턴을 만드는 방법
 *  
 *    1) private 기본 생성자를 만든다.
 *    2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
 *	  3) instance를 반환할 getter를 만들어준다.	  
 *  
 * */

class SingleTonTest {
	
	// 1) private 기본 생성자를 만든다.
	private SingleTonTest(){}
	
	// 2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
	private static SingleTonTest instance = new SingleTonTest();
	
	// 3) instance를 반환할 getter를 만들어준다.	  
	public static SingleTonTest getInstance() {
		return instance;
	}
	
	// 테스트 변수
	String testVar = "테스트 변수";
	
	// 테스트 메서드
	void testMethod() {
		System.out.println("테스트 메서드");
	}
	
} 

class ClassTest {}

public class TechniqueEx05 {

	public static void main(String[] args) {

		System.out.println(new ClassTest()); // 다른객체
		System.out.println(new ClassTest()); // 다른객체
		System.out.println(new ClassTest()); // 다른객체
		System.out.println();
		// error , 싱글톤 클래스의 객체생성방식은 일반클래스와 다르다.
		// new SingleTonTest();
		
		// 클래스명.getInstance() 방식으로 객체를 생성한다.
		System.out.println(SingleTonTest.getInstance()); // 같은 객체
		System.out.println(SingleTonTest.getInstance()); // 같은 객체
		System.out.println(SingleTonTest.getInstance()); // 같은 객체
		System.out.println();
		
		// 클래스명.getInstance().변수명
		System.out.println(SingleTonTest.getInstance().testVar);
		
		// 클래스명.getInstance().메서드명()
		SingleTonTest.getInstance().testMethod();
		
	}

}


