package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//2022.09.13 20:21 - 20:38


class Ex04_ans {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}



public class ClassEx04_풀이 {

	public static void main(String[] args) {
		
		Ex04_ans e = new Ex04_ans();
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < e.scores.length; i++) {
			e.scores[i] = rd.nextInt(100) + 1;
		}
		
		System.out.println("문제 1 정답 : " + Arrays.toString(e.scores));
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int q2_sum = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			q2_sum += e.scores[i];
		}
		
		System.out.println("문제 2 총점 : " + q2_sum);
		System.out.println("문제 2 평균 : " + q2_sum/e.scores.length);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int q3_cnt = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.scores[i] >= 60) {
				q3_cnt++;
			}
		}
		
		System.out.println("문제 3 정답 : " + q3_cnt);
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.print("인덱스를 입력해주세요 : ");
		int q4_idx = sc.nextInt();
		System.out.println("문제 4 성적 : " + e.scores[q4_idx]);
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.println("성적을 입력해주세요 : ");
		int q5_score = sc.nextInt();
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.scores[i] == q5_score) {
				System.out.println("문제 5 인덱스 : " + i);
				break;
			}
		}
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.println("학번을 입력해주세요 : ");
		int q6_hakbun = sc.nextInt();
		int q6_index = 0;
		
		for (int i = 0; i < e.hakbuns.length; i++) {
			if (e.hakbuns[i] == q6_hakbun) {
				q6_index = i;
			}
		}
		
		System.out.println("문제 6 성적 : " + e.scores[q6_index]);
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.println("학번을 입력해주세요 : ");
		int q7_hakbun = sc.nextInt();
		int q7_index = 0;
		boolean isExist = false;
		
		for (int i = 0; i < e.hakbuns.length; i++) {
			if (e.hakbuns[i] == q7_hakbun) {
				q7_index = i;
				isExist = true;
			}
		}
		
		if (isExist) {
			System.out.println("문제 7 성적 : " + e.scores[q7_index]);
		} else  {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int q8_max = 0;
		int q8_idx = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.scores[i] > q8_max) {
				q8_max = e.scores[i];
				q8_idx = i;
			}
		}
		
		System.out.println("문제 8 학번 : " + e.hakbuns[q8_idx]);
		System.out.println("문제 8 성적 : " + q8_max);

	}

}
