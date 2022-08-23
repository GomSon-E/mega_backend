package step1_06.loop;

import java.util.Scanner;

//2022.08.23 21:14 - 21:21

/*
 * # 베스킨라빈스31
 * 
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */


public class LoopEx11_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
		while (br < 31) {
			if (turn % 2 == 0) {
				System.out.println("p1은 1부터 3까지의 숫자 중 하나를 입력하세요");
				p1 = sc.nextInt();
				br += p1;
				System.out.println(turn + "턴 : p1("+ p1 +")	br(" + br + ")");
			}
			else {
				System.out.println("p2는 1부터 3까지의 숫자 중 하나를 입력하세요");
				p2 = sc.nextInt();
				br += p2;
				System.out.println(turn + "턴 : p2("+ p2 +")	br(" + br + ")");
			}
			turn ++;
		}
		
		if (turn % 2 == 0) {
			System.out.println("p1이 이겼습니다.");
		}
		else {
			System.out.println("p2가 이겼습니다.");
		}

	}

}
