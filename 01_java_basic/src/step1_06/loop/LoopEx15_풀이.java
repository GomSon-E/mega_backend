package step1_06.loop;

import java.util.Random;

//2022.08.24 19:21 - 19:29

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_풀이 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int i = 0;
		
		int sum = 0;
		int cnt = 0;
		int no1 = 0;
		int no1Grade = 0;
		
		while (i < 10) {
			int grade = rd.nextInt(100) + 1;
			
			sum += grade;
			
			if (grade >= 60) {
				cnt ++;
			}
			
			if (grade > no1Grade) {
				no1 = i;
				no1Grade = grade;
			}
			
			i++;
		}
		
		System.out.println("전교생의 총점은 " + sum + "점 입니다");
		System.out.println("전교생의 평균은 " + sum/10.0 + "점 입니다");
		System.out.println("합격자 수는 " + cnt + "명 입니다");
		System.out.println("1등 학생의 번호는 " + (no1 + 1) + "번 입니다");
		System.out.println("1등 학생의 점수는 " + no1Grade + "점 입니다");
	}

}
