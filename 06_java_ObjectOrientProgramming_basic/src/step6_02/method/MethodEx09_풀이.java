package step6_02.method;

//2022.09.15 19:23 - 19:36

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class Ex09 {

	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int [] scores) {
		for (int i = 0; i < scores.length; i++) {
			scores[i] = rd.nextInt(100) + 1;
		}
		
		System.out.println(Arrays.toString(scores));
	}
	
	//문제 2)
	void printSumAndAverage (int [] scores) {
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("문제 2 총점 : " + sum);
		System.out.println("문제 2 평균 : " + (sum / scores.length));
	}
	
	//문제 3)
	void printWinner (int [] scores) {
		int cnt = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				cnt++;
			}
		}
		
		System.out.println("문제 3 정답 : " + cnt);
	}
	
	//문제 4)
	void printScore1 (int [] scores) {
		System.out.println("인덱스를 입력해주세요");
		int idx = sc.nextInt();
		
		System.out.println("문제 4 정답 : " + scores[idx]);
	}
	
	//문제 5)
	void printScore2 (int [] scores) {
		System.out.println("성적을 입력해주세요");
		int score = sc.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if (score == scores[i]) {
				System.out.println("문제 5 정답 : " + i);
				break;
			}
		}
	}
	
	//문제 6)
	void printScore3(int [] hakbuns, int [] scores) {
		System.out.println("학번을 입력해주세요");
		int hakbun = sc.nextInt();
		
		int idx = 0;
		boolean isExist = false;
		
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbun == hakbuns[i]) {
				idx = i;
				isExist = true;
			}
		}
		
		if (isExist) {
			System.out.println("문제 6 성적 : " + scores[idx]);
		} else {
			System.out.println("해당하는 학번이 없습니다.");
		}
	}
	
	//문제 7)
	void printNumberOne (int [] hakbuns, int [] scores) {
		int max = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
				maxIdx = i;
			}
		}
		System.out.println("문제 7 학번 : " + hakbuns[maxIdx]);
		System.out.println("문제 7 성적 : " + max);
	}
	
}


public class MethodEx09_풀이 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09 e = new Ex09();
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);

		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		e.printSumAndAverage(scores);

		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		e.printWinner(scores);

		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		e.printScore1(scores);

		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		e.printScore2(scores);

		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		e.printScore3(hakbuns, scores);

		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		e.printNumberOne(hakbuns, scores);

	}

}
