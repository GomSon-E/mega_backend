package step2_01.array;

//2022.08.29 21:36 - 20:40

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_풀이 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예   1) 인덱스1 입력 : 1
		//	   	   인덱스2 입력 : 3
		//	       {10, 40, 30, 20, 50}
		
		System.out.print("인덱스1 입력 : ");
		int index1 = sc.nextInt();
		System.out.print("인덱스2 입력 : ");
		int index2 = sc.nextInt();
		
		int tempNum = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tempNum;
		
		System.out.println(Arrays.toString(arr));
		
		
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예   2) 값1 입력 : 10
		//         값2 입력 : 50
		//		   {50, 20, 30, 40, 10}
		
		System.out.print("값1 입력 :");
		int num1 = sc.nextInt();
		int q2_index1 = 0;
		System.out.print("값2 입력 :");
		int num2 = sc.nextInt();
		int q2_index2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num1) {
				q2_index1 = i;
			}
			else if (arr[i] == num2) {
				q2_index2 = i;
			}
		}
		
		int q2_tempNum = arr[q2_index1];
		arr[q2_index1] = arr[q2_index2];
		arr[q2_index2] = q2_tempNum;
		
		System.out.println(Arrays.toString(arr));
		
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예   3) 학번1 입력 : 1002
		//         학번2 입력 : 1003
		//		   {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.print("학번 1 입력 : ");
		int hakbun1 = sc.nextInt();
		int q3_index1 = 0;
		System.out.print("학번 2 입력 : ");
		int hakbun2 = sc.nextInt();
		int q3_index2 = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (hakbuns[i] == hakbun1) {
				q3_index1 = i;
			}
			else if (hakbuns[i] == hakbun2) {
				q3_index2 = i;
			}
		}
		
		int q3_tempNum = scores[q3_index1];
		scores[q3_index1] = scores[q3_index2];
		scores[q3_index2] = q3_tempNum;
		
		System.out.println(Arrays.toString(scores));
		
	}
	
}
