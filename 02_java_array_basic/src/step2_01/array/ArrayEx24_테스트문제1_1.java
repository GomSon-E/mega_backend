package step2_01.array;

// 완료

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		int[] a = { 10, 4, 5, 3, 1 };
		
		// 문제 1) 위 배열를 이용해서 전체 요소의 합출력
		int q1_sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			q1_sum += a[i];
		}
		
		System.out.println("문제 1 : " + q1_sum);
		
		System.out.println();
		
		// 문제 2) 값을 입력하면 인덱스 출력
		// 예) 5 ==> 2  ,  1 ==> 4
		System.out.print("값을 입력하세요 : ");
		int q2_num = sc.nextInt();
		
		int q2_idx = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == q2_num) {
				q2_idx = i;
				break;
			}
		}
		
		System.out.println("문제 2 : " + q2_idx);
		
		System.out.println();
		
		// 문제 3)  인덱스를 입력하면 값 출력
		// 예) 2 ==> 5  , 4 ==> 1
		System.out.println("인덱스를 입력하세요 : ");
		int q3_idx = sc.nextInt();
		
		System.out.println("문제 3 : " + a[q3_idx]);
		
		System.out.println();

		// 문제 4) 위 배열중 가장 큰 값 출력 
		// 예) 10
		int q4_max = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]> q4_max) {
				q4_max = a[i];
			}
		}
		
		System.out.println("문제 4 : " + q4_max);
		
		System.out.println();

		// 문제 5) 위 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		int q5_odd = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				q5_odd ++;
			}
		}
		
		System.out.println("문제 5 : " + q5_odd);
		
		System.out.println();
			
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0, 0, 5, 3, 1}
		int[] b = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < b.length; i++) {
			if (a[i] % 2 == 1) { b[i] = a[i]; }
		};
		
		System.out.println(Arrays.toString(b));
		
		// 문제 7) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장(저장위치는 앞에서부터  저장 , 3번 문제와 다름)
		// 예) b => {5, 3, 1, 0, 0}
		int[] c = { 0,0,0,0,0 };
		int c_idx = 0;

		for (int i = 0; i < c.length; i++) {
			if (a[i] % 2 == 1) {
				c[c_idx] = a[i];
				c_idx++;
			}
		}
		
		System.out.println(Arrays.toString(c));
	}

}
