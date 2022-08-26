package step2_01.array;

//2022.08.26 21:01 - 21:03

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */


public class ArrayEx07_풀이 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		int maxScore = 0;
		int maxScoreIdx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > maxScore) {
				maxScore = scores[i];
				maxScoreIdx = i;
			}
		}
		
		System.out.println(hakbuns[maxScoreIdx] + "(" + maxScore + "점)");
		
	}
	
}
