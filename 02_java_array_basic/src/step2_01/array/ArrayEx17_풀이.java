package step2_01.array;

import java.util.Scanner;

//2022.08.30 21:35 - 21:42
//미완료

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ArrayEx17_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = new int[9];
		int sel = 0;
		int turn = 0;
		
		while (true) {
			
			for (int i = 0; i < 3; i++) {
				System.out.print("[" + game[i] + "]");
			}
			
			System.out.println();
			
			for (int i = 3; i < 6; i++) {
				System.out.print("[" + game[i] + "]");
			}
			
			System.out.println();
			
			for (int i = 6; i < 9; i++) {
				System.out.print("[" + game[i] + "]");
			}
			
			System.out.println();
			
			if (turn % 2 == 0) {
				System.out.print("[p1]인덱스 입력 :");
				sel = sc.nextInt();
				game[sel] = 1;
			}
			else {
				System.out.print("[p2]인덱스 입력 :");
				sel = sc.nextInt();
				game[sel] = 2;
			}
			
			
			
			turn++;
		}
		
	}
		
}
