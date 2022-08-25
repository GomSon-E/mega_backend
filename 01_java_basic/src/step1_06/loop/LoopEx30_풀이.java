package step1_06.loop;

//2022.08.24 20:16 - 20:24

/*
 * # 2차원 반복문
 * 
 * 1   2  3  4  5
 * 10  9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_풀이 {

	public static void main(String[] args) {
		
		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					num++;
					System.out.print(num + " ");	
				}
			}
			else {
				for (int j = 0; j < 5; j++) {			
					System.out.print(num + " ");
					num--;
				}
			}
			num += 5;
			System.out.println();
		}
		
	}

}
