package step7_01.classArray;

import java.util.Scanner;

class Subject_mine {
	
	String name;
	int score;
	
}

class Student_mine {
	
	String name;
	Subject_mine[] subjects;
	
}

public class ClassArrayEx08_도전 {

	// # 학생 추가 삭제 컨트롤러
			//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
			//   김철수 : 과목3개 수학 50 국어50 영어 60 
			//   이만수 : 과목2개 수학 20 국어 30 
			//   이영희 : 과목1개 수학 100
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student_mine[] studentList = new Student_mine[3];
		int studentCnt = 0;
		
		while (true) {
			
			// 학생 전체 출력
			for (int i = 0; i < studentCnt; i++) {
				System.out.println("학생 : " + studentList[i].name + ">>");
				if (studentList[i].subjects != null) {
					for (int j = 0; j < studentList[i].subjects.length; j++) {
						System.out.println("과목 : " + studentList[i].subjects[j].name);
						System.out.println("점수 : " + studentList[i].subjects[j].score);
					}
				}	
				
				System.out.println();
			}
			
			System.out.println("[1]학생 추가하기");	
			System.out.println("[2]과목 추가하기");	
			System.out.println("[3]성적 추가하기");	
			System.out.println("[4]종료하기");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				
				System.out.print("학생 이름을 입력해주세요 : ");
				String nameInput = sc.next();
				
				studentList[studentCnt] = new Student_mine();
				studentList[studentCnt].name = nameInput;
				studentCnt++;
				
			}
			
			else if (sel == 2) {
				
				for (int i = 0; i < studentCnt; i++) {
					System.out.println("[" + i + "]" + studentList[i].name);
				}				
				System.out.print("학생 인덱스를 입력해주세요 : ");
				int studentIdx = sc.nextInt();
				
				System.out.print("과목 이름을 입력해주세요 : ");
				String subjectInput = sc.next();
				
				if (studentList[studentIdx].subjects == null) {
					
					studentList[studentIdx].subjects = new Subject_mine[1];
					studentList[studentIdx].subjects[0] = new Subject_mine();
					studentList[studentIdx].subjects[0].name = subjectInput;
					
				}
				else {
					
					int idx = studentList[studentIdx].subjects.length;
					
					Subject_mine[] temp = new Subject_mine[idx + 1];
					
					for (int i = 0; i < idx; i++) {		
						temp[i] = new Subject_mine();
						temp[i].name = studentList[studentIdx].subjects[i].name;
						temp[i].score = studentList[studentIdx].subjects[i].score;
					}
					
					temp[idx] = new Subject_mine();
					temp[idx].name = subjectInput;
					
					studentList[studentIdx].subjects = temp;
					
					temp = null;					
					
				}
				
				System.out.println();
				
			}
			
			else if (sel == 3) {
				
				for (int i = 0; i < studentCnt; i++) {
					System.out.println("[" + i + "]" + studentList[i].name);
				}				
				System.out.print("학생 인덱스를 입력해주세요 : ");
				int studentIdx = sc.nextInt();
				
				for (int i = 0; i < studentList[studentIdx].subjects.length; i++) {
					System.out.println("[" + i + "]" + studentList[studentIdx].subjects[i].name);
				}				
				System.out.print("과목 인덱스를 입력해주세요 : ");
				int subjectIdx = sc.nextInt();
				
				System.out.print("과목 성적을 입력해주세요 : ");
				int socreInput = sc.nextInt();
				
				studentList[studentIdx].subjects[subjectIdx].score = socreInput;
				
			}
			
			else if (sel == 4) {
				System.out.println("종료");
				sc.close();
				break;
			}
			
		}
		
		
	}
	
}
