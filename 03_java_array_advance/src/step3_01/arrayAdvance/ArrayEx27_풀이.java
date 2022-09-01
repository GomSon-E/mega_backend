package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

//2022.09.01 20:32 - 20:53 + 2022.09.01 21:16 - 21:22

/*
 * # 숫자이동[2단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */

public class ArrayEx27_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = {0,0,1,0,2,0,0,1,0};
		
		int player = 0;
		
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		
		while (true) {
			System.out.println(Arrays.toString(game));
			System.out.println("왼쪽[1]           오른쪽[2]     종료[3]");
			int sel = sc.nextInt();
			
			if (sel == 1) {			
				if (player - 1 < 0) {
					System.out.println("더이상 왼쪽으로 이동할 수 없습니다.");
				}				
				else {
					if (game[player-1] == 1) {
						while (true) {
							System.out.println(Arrays.toString(game));
							System.out.println("격파[3]");
							sel = sc.nextInt();
							
							if (sel == 3) {						
								break;
							}
						}					
					}
					
					game[player] = 0;
					player--;
					game[player] = 2;
				}
			}
			
			else if (sel == 2) {
				if (player + 1 > 8) {
					System.out.println("더이상 오른쪽으로 이동할 수 없습니다.");
				}
				else {
					if (game[player + 1] == 1) {
						while (true) {
							System.out.println(Arrays.toString(game));
							System.out.println("격파[3]");
							sel = sc.nextInt();
							
							if (sel == 3) {						
								break;
							}
						}
					}
					game[player] = 0;
					player++;
					game[player] = 2;
				}				
			}
			
			else if (sel == 3) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
		}
		
		
		
		
		
		
		
		
	}
	
}
