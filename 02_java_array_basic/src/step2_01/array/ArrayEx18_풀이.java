package step2_01.array;

import java.util.Arrays;
import java.util.Random;

//2022.08.31 19: - 19:50

import java.util.Scanner;

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

public class ArrayEx18_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		// 플레이어 위치
		int idx1 = 0;	
		int idx2 = 0;
		
		p1[idx1] = 1;	
		p2[idx2] = 2;
		
		// 바퀴 수
		int win1 = 0;	
		int win2 = 0;
		
		// 이동할 칸 수
		int move1 = 0;
		int move2 = 0;
		
		while (true) {
			
			System.out.println(Arrays.toString(game));
			System.out.println(Arrays.toString(p1) + " [" + win1 + "바퀴]");
			System.out.println(Arrays.toString(p2) + " [" + win2 + "바퀴]");
			
			if (turn % 2 == 0) {
				System.out.print("[p1사용자]1~3 입력 : ");
				move1 = sc.nextInt();
				p1[idx1] = 0;
				idx1 += move1;
				
				if (idx1 > 7) {
					win1 ++;
					idx1 -= 8;
				}
				
				p1[idx1] = 1;
				
				if (idx1 == idx2) {
					System.out.println("[p1사용자]가 p2를 잡았다!");
					p2[idx2] = 0;
					idx2 = 0;
					p2[idx2] = 2;
				}
				
				System.out.println();
			}
			else {
				move2 = rd.nextInt(3) + 1;
				System.out.println("[p2컴퓨터] : " + move2);
				p2[idx2] = 0;
				idx2 += move2;
				
				if (idx2 > 7) {
					win2 ++;
					idx2 -= 8;
				}
				
				p2[idx2] = 2;
				
				if (idx1 == idx2) {
					System.out.println("[p2컴퓨터]가 p1를 잡았다!");
					p1[idx1] = 0;
					idx1 = 0;
					p1[idx1] = 1;
				}
				
				System.out.println();
			}
			
			if (win1 == 3) { System.out.println("[p1사용자]가 승리하였습니다"); break; }
			else if (win2 == 3) { System.out.println("[p2컴퓨터]가 승리하였습니다"); break; }

			turn++;
			
		}
		
		sc.close();	
		
	}
}
