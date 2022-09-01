package step3_01.arrayAdvance;

//2022.09.01 19:20 - 19:27

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 * 
 */


public class ArrayEx25_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		int response = 0;
		
		while (true) {
			
			int max = 0;
			int max_idx = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) { 
					max = arr[i]; 
					max_idx = i;
				}
			}
			
			while (true) {
				System.out.println(Arrays.toString(arr));
				System.out.print("위 배열에서 가장 큰 값을 입력해주세요 : ");
				response = sc.nextInt();
				
				if (response == max) {
					System.out.println("정답입니다.");
					arr[max_idx] = 0;
					break;
				}
			}
			
			int zeroCnt = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					zeroCnt++;
				}
			}
			
			if (zeroCnt == 5) {
				System.out.println("모두 정답입니다.");
				break;
			}
		}	
		
	
	}
}
