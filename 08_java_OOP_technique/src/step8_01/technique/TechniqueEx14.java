package step8_01.technique;

/*
 * 
 *  # 쓰레드(Thread)
 *  
 *  - 운영체제에 의해서 관리되는 하나의 '작업' 혹은 '태스크'를 의미  , 예시) main()함수도 하나의 쓰레드
 *    
 *  - main() 의외의 다른 쓰레드를 만들려면 Thread클래스를 상속받거나 Runnable 인터페이스를 구현한다.
 * 
 *  - 자바에서는 다중 상속을 허용하지 않기 때문에, Thread 클래스를 확장하는 클래스는 다른 클래스를 상속받을 수 없다.
 * 
 *  - Runnable 인터페이스를 구현했을 경우에는 다른 인터페이스를 구현할 수 있으며 다른 클래스도 상속받을 수 있다.
 * 
 * */

// 쓰레드 구현 방법  1) Thread 클래스를 상속 받아서 구현한다.
class Music extends Thread {
	
	// Thread클래스로부터 제공되는 run() 메서드이며 , 동시적으로 수행할 명령어를 작성한다.
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("배경음악이 연주되는 중...");
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
//	void play() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("배경음악이 연주되는 중...");
//			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
//		}
//	}
	
}

// 쓰레드 구현 방법  2) Runnable 인터페이스를 구현하여 사용한다.
class Game implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("게임을 하는 중...");
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
}

public class TechniqueEx14 {

	public static void main(String[] args) {

		// Thread 클래스를 상속받을 경우 객체에서 start() 메서드를 이용하여 쓰레드를 시작한다. 
		// -> 클래스 안에 오버라이딩된 run() 메서드를 호출한다.
		Music music = new Music();
		music.start(); 
		
		// Runnable Interface를 구현할 경우 Thread 객체에서 생성자의 인수로
		// Runnable Interface를 구현한 객체를 주입하여 새로운 객체를 만들고
		// 새로운 객체를 통해 .start()메서드를 이용하여 쓰레드를 시작한다. -> run()메서드 호출
		Game temp = new Game();
		Thread game = new Thread(temp);
		game.start();		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("PC 카톡을 하는 중...");
			
			// milliseconds만큼 CPU 사용을 멈춘다. ( 1000 > 1초, 500 > 0.5초 )
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		
	}

}
