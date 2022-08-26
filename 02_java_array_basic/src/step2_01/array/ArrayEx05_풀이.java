package step2_01.array;

import java.util.Scanner;

// 2022.08.26 20:25 - 20:31

/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

public class ArrayEx05_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		
		System.out.print("인덱스를 입력해주세요 : ");
		int idx = sc.nextInt();
		System.out.println("인덱스 입력 : " + idx + "	성적 : " + arr[idx] + "점");
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		
		System.out.print("성적을 입력해주세요 : ");
		int grade = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (grade == arr[i]) {
				System.out.println("성적 입력 : " + grade + "		인덱스 : " + i);
				break;
			}
		}
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		
		int hakbun = sc.nextInt();
		int idx2 = 0;
		
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbun == hakbuns[i]) {
				idx2 = i;
			}
		}
		
		System.out.println("학번 입력 : " + hakbun + "	성적 : " + scores[idx2] + "점");

	}
	
}
