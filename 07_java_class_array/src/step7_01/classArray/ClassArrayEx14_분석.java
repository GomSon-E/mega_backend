package step7_01.classArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class StudentVO_ana {
	
	String id;
	String pw;
	
	void printData() {
		System.out.println("이름 : " + this.id + "비밀번호 : " + this.pw);
	}
	
}

class StudentManager_ana {
	
	ArrayList<StudentVO_ana> studentList = new ArrayList<StudentVO_ana>();
	
	void addStudent(StudentVO_ana st) {
		studentList.add(st);
	}
	
	StudentVO_ana removeStudent(int index) {
		StudentVO_ana del_st = studentList.get(index);
		studentList.remove(index);
		return del_st;
	}
	
	int checkId(StudentVO_ana st) {
		int check = -1;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
	}
	
	void printStudent() {
		for (int i = 0; i < studentList.size(); i++) {
			studentList.get(i).printData();
		}
	}
	
	String outData() {
		String data = "";
		int count = studentList.size();
		if (count == 0) {
			return data;
		}
		data += count;
		data += "\n";
		for (int i = 0; i < count; i++) {
			data += studentList.get(i).id;
			data += ",";
			data += studentList.get(i).pw;
			if (count -1 != i) {
				data += "\n";
			}
		}
		return data;
	}

	void sortData() {
		/*
              	직접 구현해보세요.
        */
	}
	
	void loadStudent(ArrayList<StudentVO_ana> temp) {
		studentList = temp;
	}
	
	int getSize() {
		return studentList.size();
	}
	
}

public class ClassArrayEx14_분석 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentManager_ana m = new StudentManager_ana();
		
		while (true) {
			
			System.out.println("1. 가입  2. 탈퇴  3. 정렬  4. 출력  5. 저장  6. 로드  7.종료");
			int sel = sc.nextInt();
			
			// 가입
			if (sel == 1) {
				
				StudentVO_ana temp = new StudentVO_ana();
				System.out.println("[가입] id를 입력하세요 >>> ");
				temp.id = sc.next();
				int check = m.checkId(temp);
				
				if (check == -1) {
					System.out.println("[가입] pw를 입력하세요 >>> ");
					temp.pw = sc.next();
					m.addStudent(temp);
					System.out.println(temp.id + "님 가입을 환영합니다.");
				}
				else {
					System.out.println("중복 아이디 입니다.");
				}
			}
			
			// 탈퇴
			else if (sel == 2) {
				
				m.printStudent();
				
				StudentVO_ana temp = new StudentVO_ana();
				
				System.out.println("[탈퇴] id를 입력하세요 >>> ");
				temp.id = sc.next();
				
				int check = m.checkId(temp);
				if (check == -1) {
					System.out.println("없는 아이디입니다.");
				}
				else {
					StudentVO_ana del_st = m.removeStudent(check);
					System.out.println(del_st.id + "님 탈퇴 되었습니다.");
				}
				
			}
			
			// 정렬
			else if (sel == 3) {
				
				m.sortData();
				m.printStudent();
				
			}
			
			// 출력
			else if (sel == 4) {
				
				m.printStudent();
				
			}
			
			// 저장
			else if (sel == 5) {
				
				FileWriter fw = null;
				
				if (m.getSize() == 0)  continue;
				
				try {
					
					fw = new FileWriter("student_manager_studentList.txt");
					String data = m.outData();
					
					if (!data.contentEquals("")) {
						fw.write(data);
						System.out.println(data);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				finally {
					try { fw.close(); } catch (IOException e) { e.printStackTrace(); }
				}		
				
			}
			
			// 로드
			else if (sel == 6) {
				
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					
					File file = new File("student_manager_studentList.txt");
					
					if (file.exists()) {
						
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						ArrayList<StudentVO_ana> studentList = new ArrayList<StudentVO_ana>();
						
						String line = br.readLine();
						int count = Integer.parseInt(line);
						
						for (int i = 0; i < count; i++) {
							StudentVO_ana temp = new StudentVO_ana();
							
							line = br.readLine();
							String value[] = line.split(",");
							temp.id = value[0];
							temp.pw = value[1];
							studentList.add(temp);
						}
						m.loadStudent(studentList);
					}
					m.printStudent();
					
				} 
				catch (Exception e) { e.printStackTrace(); }
				finally {					
					try {
						br.close();
						fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			}
			
			// 종료
			else if (sel == 7) {
				System.out.println("종료");
				break;
			}
			
		}
		
	}
	
}
