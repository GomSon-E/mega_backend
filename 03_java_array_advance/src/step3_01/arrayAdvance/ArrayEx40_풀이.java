package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

//2022.09.02 20:24 - 20:40

/*
 *	# 관리비
*/

public class ArrayEx40_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		System.out.print("문제 1 정답 : ");
		for (int i = 0; i < pay.length; i++) {
			int q1_sum = 0;
			for (int j = 0; j < pay[i].length; j++) {
				q1_sum += pay[i][j];
			}
			System.out.print(q1_sum + " ");
		}
		
		System.out.println();
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.print("호 입력 : ");
		int q2_apt = sc.nextInt();
		
		int q2_idx1 = 0;
		int q2_idx2 = 0;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (apt[i][j] == q2_apt) {
					q2_idx1 = i;
					q2_idx2 = j;
				}
			}
		}
		
		System.out.println("문제 2 관리비 : " + pay[q2_idx1][q2_idx2]);
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int q3_max = 0;
		int q3_max_idx1 = 0;
		int q3_max_idx2 = 0;
		
		int q3_min = 0;
		int q3_min_idx1 = 0;
		int q3_min_idx2 = 0;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (pay[i][j] > q3_max) {
					q3_max = pay[i][j];
					q3_max_idx1 = i;
					q3_max_idx2 = j;
				}
			}
		}
		
		q3_min = q3_max;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (pay[i][j] < q3_min) {
					q3_min = pay[i][j];
					q3_min_idx1 = i;
					q3_min_idx2 = j;
				}
			}
		}
		
		System.out.println("문제 3 관리비 가장 많이 나온 집 : " + apt[q3_max_idx1][q3_max_idx2]);
		System.out.println("문제 3 관리비 가장 적게 나온 집 : " + apt[q3_min_idx1][q3_min_idx2]);
		
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		System.out.println("관리비 교체 전");
		System.out.println(Arrays.toString(pay[0]));
		System.out.println(Arrays.toString(pay[1]));
		System.out.println(Arrays.toString(pay[2]));
		
		System.out.print("호 1 입력 : ");
		int q4_apt1 = sc.nextInt();
		System.out.print("호 2 입력 : ");
		int q4_apt2 = sc.nextInt();
		
		int q4_apt1_idx1 = 0;
		int q4_apt1_idx2 = 0;
		
		int q4_apt2_idx1 = 0;
		int q4_apt2_idx2 = 0;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (apt[i][j] == q4_apt1) {
					q4_apt1_idx1 = i;
					q4_apt1_idx2 = j;
				}
				else if (apt[i][j] == q4_apt2) {
					q4_apt2_idx1 = i;
					q4_apt2_idx2 = j;
				}
			}
		}
		
		int tempPay = pay[q4_apt1_idx1][q4_apt1_idx2];
		pay[q4_apt1_idx1][q4_apt1_idx2] = pay[q4_apt2_idx1][q4_apt2_idx2];
		pay[q4_apt2_idx1][q4_apt2_idx2] = tempPay;
		
		System.out.println("관리비 교체 후");
		System.out.println(Arrays.toString(pay[0]));
		System.out.println(Arrays.toString(pay[1]));
		System.out.println(Arrays.toString(pay[2]));
	}

}
