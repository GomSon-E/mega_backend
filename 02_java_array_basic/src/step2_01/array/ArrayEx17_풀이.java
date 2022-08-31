package step2_01.array;

import java.util.Scanner;

//2022.08.30 21:35 - 21:42 + 2022.08.31 19:20 - 19:27

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O] 0 1 2
 * [ ][O][ ] 3 4 5
 * [ ][ ][ ] 6 7 8
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
			
			// 0 1 2 / 3 4 5 / 6 7 8 / 0 3 6 / 1 4 7 / 2 5 8 / 0 4 8 / 2 4 6
			if ( 
				(game[0] != 0 && game[0] == game[1] && game[1] == game[2]) || 
				(game[3] != 0 && game[3] == game[4] && game[4] == game[5]) || 
				(game[6] != 0 && game[6] == game[7] && game[7] == game[8]) || 
				(game[0] != 0 && game[0] == game[3] && game[3] == game[6]) || 
				(game[1] != 0 && game[1] == game[4] && game[4] == game[7]) || 
				(game[2] != 0 && game[2] == game[5] && game[5] == game[8]) || 
				(game[0] != 0 && game[0] == game[4] && game[4] == game[8]) || 
				(game[2] != 0 && game[2] == game[4] && game[4] == game[6])	) {
				break;
			}
			
			turn++;
		}
		
		if (turn % 2 == 0) { System.out.println("[p1]승리"); }
		else { System.out.println("[p2]승리"); }  
		
	}
		
}
