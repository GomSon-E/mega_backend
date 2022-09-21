package step7_01.classArray;

import java.util.Scanner;

class Subject8_ans {
	
	String name;
	int score;
	
}

class Student8_ans {
	
	Subject8_ans[] subjects;
	String name;
	
}

public class ClassArrayEx08_분석 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student8_ans[] studentList = new Student8_ans[3];
		int studentCnt = 0;	// 학생 수
		
		while (true) {
			
			for (int i = 0; i < studentList.length; i++) {
				
				System.out.println("[" + (i + 1) + "]" + studentList[i].name + "학생>>>");
			
				if (studentList[i].subjects != null) {
					for (int j = 0; j < studentList[i].subjects.length; j++) {
						System.out.println("[" + (j+1) + "]" + studentList[i].subjects[j].name + "과목 = " + studentList[i].subjects[j].score + "점");
					}
				}
				
				System.out.println();
				
			} // end of for
			
			System.out.println("[1]학생 추가하기");	
			System.out.println("[2]과목 추가하기");	
			System.out.println("[3]성적 추가하기");	
			System.out.println("[4]종료하기");
			int choice = sc.nextInt();
			
			
			// 학생 추가
			if (choice == 1) {
				
				System.out.print("이름 입력 : ");
				String name = sc.next();
				
				studentList[studentCnt] = new Student8_ans();
				studentList[studentCnt].name = name;
				studentCnt++;
				
			}
			
			// 과목 추가
			else if (choice == 2) 
			{
				for (int i = 0; i < studentCnt; i++) {
					System.out.println("[" + (i+1) + "]" + studentList[i].name);
				}
				
				System.out.print("학생 선택 : ");
				int select = sc.nextInt();
				select--;
				
				System.out.print("과목 입력 : ");
				String subject = sc.next();
				
				// subject가 하나도 없을 때
				if (studentList[select].subjects == null) {
					
					studentList[select].subjects = new Subject8_ans[1];
					
					studentList[select].subjects[0] = new Subject8_ans();
					studentList[select].subjects[0].name = subject;
					
				}
				
				// subject가 이미 있을 때
				else {
				
					int size = studentList[select].subjects.length;
					
					// 이전 배열에서 하나 더 큰 배열로 복사
					Subject8_ans[] temp = studentList[select].subjects;
					studentList[select].subjects = new Subject8_ans[size + 1];
					
					for(int i = 0; i < size; i++) {
						studentList[select].subjects[i] = temp[i];
					}
					
					// 새로운 과목 추가
					studentList[select].subjects[size] = new Subject8_ans();
					studentList[select].subjects[size].name = subject;
					
					// temp 지우기
					temp = null;
					
				}
				
			}
			
			// 성적 추가 
			else if (choice == 3) {
				
				for (int i = 0; i < studentCnt; i++) {
					System.out.println("[" + (i+1) + "]" + studentList[i].name);
				}
				System.out.print("학생 선택 : ");
				int select = sc.nextInt();
				select--;
				
				if (studentList[select].subjects != null) {
					for (int i = 0; i < studentList[select].subjects.length; i++) {
						System.out.println("[" + (i+1) + "]" + studentList[select].subjects[i].name);
					}
				}				
				System.out.print("과목 선택 : ");
				int num = sc.nextInt();
				num--;
				
				System.out.print("성적 입력 : ");
				int score = sc.nextInt();
				
				studentList[select].subjects[num].score = score;
				
			}
			// 종료 
			else if (choice == 4) {
				System.out.println("종료");
				break;
			}
			
		} // end of while
		
	}
	
}
