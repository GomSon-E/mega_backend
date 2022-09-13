package step6_01.classObject;

//2022.09.13 20:17 - 20:21

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_ans {
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_풀이 {

	public static void main(String[] args) {
		
		Ex03_ans e = new Ex03_ans();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int q1_sum = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			q1_sum += e.arr[i];
		}
		
		System.out.println("문제 1 정답 : " + q1_sum);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int q2_sum = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) {
				q2_sum += e.arr[i];
			}
		}
		
		System.out.println("문제 2 정답 : " + q2_sum);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int q3_cnt = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) {
				q3_cnt ++;
			}
		}

		System.out.println("문제 3 정답 : " + q3_cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int q4_cnt = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 2 == 0) {
				q4_cnt ++;
			}
		}

		System.out.println("문제 4 정답 : " + q4_cnt);

	}

}
