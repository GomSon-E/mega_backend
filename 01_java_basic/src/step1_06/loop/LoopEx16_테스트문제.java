package step1_06.loop;

// 완료

import java.util.Random;
import java.util.Scanner;

/*
 * # 카카오 택시
 * 
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		2) 속도설정 : 1~3까지만 가능 == 칸 수
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동 -> 현위치 변경
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 * 
 */

public class LoopEx16_테스트문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		// 목적지(destination)
		int desX = rd.nextInt(21) - 10;
		int desY = rd.nextInt(21) - 10;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		
		// 이동한 칸 수
		int move = 0;
		
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = sc.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("이동할 방향을 설정해주세요 동(1) 서(2) 남(3) 북(4) : ");
				dir = sc.nextInt();
			}
			else if (selectMenu == 2) {
				System.out.print("이동할 속도를 설정해주세요 1 ~ 3 : ");
				speed = sc.nextInt();
			}
			else if (selectMenu == 3) {
				if (dir == 1) { x += speed; }
				else if (dir == 2) { x -= speed; }
				else if (dir == 3) { y -= speed; }
				else if (dir == 4) { y += speed; }
				
				move += speed;
			}
			
			if (move % 2 == 0) { fee = 50 * (move / 2); }
			else { fee = 50 * ((move + 1) / 2);	}
			
			if (desX == x && desY == y) {
				isRun = false;
				System.out.println("목적지에 도착했습니다. 운행을 종료합니다.");
				System.out.println("요   금 : " + fee);
			}
			
		}
		
		sc.close();

	}

}
