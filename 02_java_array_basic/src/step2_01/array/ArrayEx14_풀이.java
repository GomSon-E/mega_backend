package step2_01.array;

import java.util.Arrays;

//2022.08.30 20:40 - 20:48

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int player = 0;
		
		for (int i=0; i < game.length; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		
		while(true) {
			System.out.println(Arrays.toString(game));
			System.out.print("왼쪽[1] 오른쪽[2] 종료[0] : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {				
				
				if (player-1 < 0) {
					System.out.println("왼쪽 끝에 도달하여 더이상 왼쪽으로 움직일 수 없습니다.");
				}
				else {
					game[player] = 0;
					game[player-1] = 2;
					player--;
				}		
			}
			else if (sel == 2) {
					
				if (player+1 > game.length - 1) {
					System.out.println("오른쪽 끝에 도달하여 더이상 오른쪽으로 움직일 수 없습니다.");
				}
				else {
					game[player] = 0;
					game[player+1] = 2;	
					player++;
				}
			}
			else if (sel == 0) {
				break;
			}
		}
		
		System.out.println("게임이 종료되었습니다.");
				
	}
	
}
