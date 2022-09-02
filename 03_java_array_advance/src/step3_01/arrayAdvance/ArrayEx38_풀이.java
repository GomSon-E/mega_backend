package step3_01.arrayAdvance;

//2022.09.02 20:01 - 20:13

import java.util.Arrays;
import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스 1 입력 : ");
		int q1_idx1 = sc.nextInt();
		System.out.print("인덱스 2 입력 : ");
		int q1_idx2 = sc.nextInt();
		
		System.out.println("문제 1 정답 : " + arr[q1_idx1][q1_idx2]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.println("값 입력 : ");
		int q2_num = sc.nextInt();
		
		int q2_idx1 = 0;
		int q2_idx2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(q2_num == arr[i][j]) {
					q2_idx1 = i;
					q2_idx2 = j;
					break;
				}
			}
		}
		
		System.out.println("문제 2 인덱스 1 : " + q2_idx1);
		System.out.println("문제 2 인덱스 2 : " + q2_idx2);
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int q3_max = 0;
		
		int q3_idx1 = 0;
		int q3_idx2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > q3_max) {
					q3_max = arr[i][j];
					q3_idx1 = i;
					q3_idx2 = j;
				}
			}
		}
		
		System.out.println("문제 3 인덱스 1 : " + q3_idx1);
		System.out.println("문제 3 인덱스 2 : " + q3_idx2);
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		
		System.out.println("값 1 입력 : ");
		int q4_num1 = sc.nextInt();
		System.out.println("값 2 입력 : ");
		int q4_num2 = sc.nextInt();
		
		int q4_num1_idx1 = 0;
		int q4_num1_idx2 = 0;
		int q4_num2_idx1 = 0;
		int q4_num2_idx2 = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == q4_num1) {
					q4_num1_idx1 = i;
					q4_num1_idx2 = j;
				}
				else if (arr[i][j] == q4_num2) {
					q4_num2_idx1 = i;
					q4_num2_idx2 = j;
				}
			}
		}
		
		int temp = arr[q4_num1_idx1][q4_num1_idx2];
		arr[q4_num1_idx1][q4_num1_idx2] = arr[q4_num2_idx1][q4_num2_idx2];
		arr[q4_num2_idx1][q4_num2_idx2] = temp;
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));

	}

}
