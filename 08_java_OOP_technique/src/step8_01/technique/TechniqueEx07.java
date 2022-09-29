package step8_01.technique;

/*

	# 메서드 오버라이딩 ( Method Overriding )
	
	- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
	- 메서드 오버로딩과 혼용되기 쉽다.

*/

class Wizard2 extends Beginner {
	
	// 메서드 오버라이딩 (메서드 재정의)
	// 부모클래스의 메서드와 이름이 같으나 구현되는 기능이 다르다.
	void levelUp() {
		this.level += 1;
		this.power += 5;
		this.dex += 100;
		this.life += 100;
		this.mana += 3000;
	}
	
	// Wizard2 클래스 만의 메서드를 추가
	void fireBall() {
		System.out.println("# fireBall");
	}
	
}

class Warrior2 extends Beginner {
	
	// 메서드 오버라이딩 (메서드 재정의)
	// 부모클래스의 메서드와 이름이 같으나 구현되는 기능이 다르다.
	void levelUp() {
		this.level += 1;
		this.power += 3000;
		this.dex += 100;
		this.life += 100;
		this.mana += 5;
	}
	
	// Warrior2 클래스 만의 메서드를 추가
	void dash() {
		System.out.println("# dash");
	}
	
}

public class TechniqueEx07 {

	public static void main(String[] args) {

		Warrior2 warrior2 = new Warrior2();
		
		warrior2.showStatus();
		warrior2.levelUp();
		warrior2.levelUp();
		warrior2.levelUp();
		warrior2.showStatus();
		
		warrior2.dash();
		
		System.out.println("\n===================\n");
		
		Wizard2 wizard2 = new Wizard2();
		
		wizard2.showStatus();
		wizard2.levelUp();
		wizard2.levelUp();
		wizard2.levelUp();
		wizard2.showStatus();
		
		wizard2.fireBall();
				
	}

}
