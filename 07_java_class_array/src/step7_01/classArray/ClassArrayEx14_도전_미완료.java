package step7_01.classArray;

import java.util.ArrayList;
import java.util.Scanner;

class StudentVO {
	
	String id;
	String pw;
	
	void printData() {
		System.out.print("id" + this.id);
		System.out.println("pw" + this.pw);
	}
	
}

class StudentManager {
	
	ArrayList<StudentVO> studentList = new ArrayList<StudentVO>();
	
	void addStudent(StudentVO st) {
		studentList.add(st);
	}
	
	StudentVO removeStudent(int index) {
		StudentVO del_st = studentList.get(index);
		studentList.remove(index);
		return del_st;
	}
	
	int checkId(StudentVO st) {
		int id = -1;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).id == st.id) {
				id = i;
				break;
			}
		}
		return id;
	}
	
	void printStudent() {
		for (StudentVO s : studentList) {
			s.printData();
		}
	}
	
	String outData() {
		String data = "";
		int count = studentList.size();
		
		if (count == 0) {
			return data;
		}
		else if (count > 0) {
			data += count;
			data += "\n";
			
			for (StudentVO s : studentList) {
				data += s.id + "," + s.pw;
				data += "\n";
			}
		}
		return data;		
	}
	
	void sortData() {}
	
	void loadStudent(ArrayList<StudentVO> temp) {
		studentList = temp;
	}
	
	int getSize() {
		return studentList.size();
	}
	
}

public class ClassArrayEx14_도전_미완료 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentManager m = new StudentManager();
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = sc.nextInt();
			
			// 가입
			if (sel == 1) {
				StudentVO st = new StudentVO();
				
				System.out.println("[가입] id를 입력해주세요 : ");
				st.id = sc.next();
				
				if (m.checkId(st) == -1) {
					System.out.println("[가입] pw를 입력해주세요 : ");
					st.pw = sc.next();
					System.out.println(st.id + "님 가입을 축하드립니다.");
				}
				else {
					System.out.println("중복된 id 입니다.");
				}
			}
			
			// 탈퇴
			else if (sel == 2) {
				
				System.out.println("[탈퇴] id를 입력해주세요 : ");
				String id = sc.next();
				
				
				
			}
			
			// 정렬
			else if (sel == 3) {
				
			}
			
			// 출력
			else if (sel == 4) {
				
			}
			
			// 저장
			else if (sel == 5) {
				
			}
			
			// 로드
			else if (sel == 6) {
				
			}
			
			// 종료
			else if (sel == 7) {
				break;
			}

		}
		
	}
}
