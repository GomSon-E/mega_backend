package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//2022.08.30 21:09 - 21:18

/*
 * # 1 to 50[1단계] : 1 to 4
 * 
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 가장 작은수 1부터(다음은 2) 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 
 * 예)
 * [ 4 2 3 1 ]
 * 
 * 입력 : 3  (가장 작은수 1이 3번째에 위치 )
 * 4 2 3 9
 * 입력 : 1  ( 그 다음으로 작은 수 2가 1번째에 위치 )
 * 4 9 3 9
 * 입력 : 2  ( 그 다음으로 작은 수 3이 2번째에 위치 )
 * 4 9 9 9
 * 입력 : 0  ( 그 다음으로 작은 수 4가 0번째에 위치 )
 * 9 9 9 9
 * 
 * 코드 종료
 */


public class ArrayEx16_풀이 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		boolean[] isCheck = new boolean[4];
		
		int cnt = 0;
		int idx = 1;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		while (cnt < 10) {
			int rdIdx = rd.nextInt(4);
			int temp = arr[0];
			arr[0] = arr[rdIdx];
			arr[rdIdx] = temp;
			cnt++;
		}
			
		while(idx < 5) {
			
			System.out.println(Arrays.toString(arr));
			
			System.out.print("입력 : ");
			int num = sc.nextInt();
			
			if (arr[num] == idx) {
				arr[num] = 9;
				idx ++;			
			}
			
		}
		
		System.out.println("게임이 종료되었습니다.");
		
		sc.close();
	}
	
}
