package step6_02.method;

import java.util.Arrays;
import java.util.Random;

class ScoreMng_ans {
	
	Random rd = new Random();
	
	int[] omr = {1, 4, 3, 2, 5};
	int[] me = new int[5];
	
	int answerCnt = 0;
	int score = 0;
	
	// 1. me 답안 완성하기
	void makeAnswer() {
		
		for (int i = 0; i < me.length; i++) {
			me[i] = rd.nextInt(5) + 1;
		}
		
	}
	
	// 2. 정답 출력하기
	void showAnswer() {
		
		// omr 카드 출력
		System.out.println("omr = " + Arrays.toString(omr));
		
		// me 카드 출력
		System.out.println("me = " + Arrays.toString(me));
		
	}
	
	// 3. 정답 비교하기
	void checkAnswer() {
		
		answerCnt = 0;
		
		System.out.print("정오표 = [");
		for (int i = 0; i < omr.length; i++) {
			if (omr[i] == me[i]) {
				System.out.print("0 ");
				answerCnt++;
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println("]");
		
		score = 20 * answerCnt;
		
		System.out.println("점수  = " + score + "점");
		
	}
	
	// 4. 실행하기
	void run() {
		
		makeAnswer();
		showAnswer();
		checkAnswer();
		
	}
	
}

public class MethodEx13_분석 {

	public static void main(String[] args) {
		
		ScoreMng_ans s = new ScoreMng_ans();
		s.run();
		
	}
	
}
