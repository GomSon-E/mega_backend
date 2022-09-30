package step8_01.technique;

import java.util.ArrayList;
import java.util.HashMap;

/*

	# 다형성
	
	- 다형성이란 하나의 메소드가 서로 다른 클래스에서 다양하게 실행되는 것을 말한다.
	- 다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스를 가져야 한다.
	- 부모 클래스와 자식 클래스에 같은 메소드가 있어야 하며 자식 클래스는 이 메소드를 반드시 override 시켜서 사용해야 한다.
	- 부모 클래스 타입에 자식 클래스 타입을 대입시켜 다형성이 구현된 메소드를 실행한다.

*/

// 부모클래스
class Shape {
	void draw() {} // 자녀클래스가 상속받아서 사용할 메서드 정의
}

// 자녀클래스
class Line extends Shape {
	void draw() { // 부모의 메서드 재정의
		System.out.println("선을 그린다.");
	}
}

// 자녀클래스
class Circle extends Shape {
	void draw() { // 부모의 메서드 재정의
		System.out.println("원을 그린다.");
	}
}

// 자녀클래스
class Rect extends Shape {
	void draw() { // 부모의 메서드 재정의
		System.out.println("사각형을 그린다.");
	}
}


public class TechniqueEx12 {

	public static void main(String[] args) {

		// 부모클래스의 타입으로 배열을 생성하고
		Shape[] shape = new Shape[3];
		
		// 자녀클래스로 배열의 요소를 추가
		shape[0] = new Line();
		shape[1] = new Circle();
		shape[2] = new Rect();
		
		shape[0].draw();
		shape[1].draw();
		shape[2].draw();
		
		// 참고 자료 1)
		ArrayList<Object> test1 = new ArrayList<Object>();
		test1.add(100);
		test1.add("문자열데이터");
		test1.add(true);
		test1.add(new Student());
		test1.add(new Sub());
		
		// 참고 자료 2)
		HashMap<String, Object> test2 = new HashMap<String, Object>();
		test2.put("data1", 100);
		test2.put("data2", "문자열데이터");
		test2.put("data3", true);
		test2.put("data4", new Student());
		test2.put("data5", new Sub());
		
	}

}

