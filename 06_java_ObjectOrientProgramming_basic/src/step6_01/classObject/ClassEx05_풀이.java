package step6_01.classObject;

//2022.09.13 20:38 - 20:50 + 2022.09.13 21:00 - 21:05

import java.util.Arrays;

//2022.09.13 20:38 - 20:50 + 2022.09.13 21:00 - 21:05

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */


class Ex05_ans{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}



public class ClassEx05_풀이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Ex05_ans mega = new Ex05_ans();
		mega.name = "메가IT 고등학교";
		
		int max = 0;
		int min = 0;
		
		while (true) {
			
			// 메뉴 출력
			//System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			
			if		(choice == 1) {
				System.out.println("전교생 성적 : " + Arrays.toString(mega.arScore));
			}
			else if (choice == 2) {
				max = 0;
				
				for (int i = 0; i < mega.arScore.length; i++) {
					if (mega.arScore[i] > max) {
						max = mega.arScore[i];
					}
				}
				
				System.out.println("1등 학생 성적 : " + max + "점");
			}
			else if (choice == 3) {
				min = max;
				
				for (int i = 0; i < mega.arScore.length; i++) {
					if (mega.arScore[i] < min) {
						min = mega.arScore[i];
					}
				}
				
				System.out.println("꼴등 학생 성적 : " + min + "점");
			}
			else if (choice == 4) {
				System.out.println("학번을 입력해주세요 : ");
				int hakbun = sc.nextInt();
				int idx = 0;
				boolean isExist = false;
				
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if (mega.arHakbun[i] == hakbun) {
						idx = 0;
						isExist = true;
						break;
					}
				}
				
				if (isExist) {
					System.out.println(hakbun + "학생의 성적 : " + mega.arScore[idx]);	
				} else {
					System.out.println("존재하지 않는 학번입니다.");
				}
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
