package step9_04.student_analysis;

import java.util.Scanner;

import step9_04.student.Controller;
import step9_04.student.StudentInsert;
import step9_04.student.StudentSelect;
import step9_04.student.StudentSelectAll;
import step9_04.student.StudentVO;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		
		while(true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int sel = sc.nextInt();
			
			// 1. 추가
			if (sel == 1) {
				
				// 아이디 입력
				System.out.println("아이디를 입력하세요 : ");
				String id = sc.next();
				
				// 번호 입력
				System.out.println("번호를 입력하세요 : ");
				int num = sc.nextInt();
				
				// 이름 입력
				System.out.println("이름을 입력하세요 : ");
				String name = sc.next();
				
				// 새로운 studentVO 객체 생성 -> 추가
				StudentInsert stInsert = controller.getInsert();
				stInsert.insert(new StudentVO(id, num, name));
				
			}
			
			// 2. 수정
			else if (sel == 2) {
				// 구현 필요
			}
			
			// 3. 삭제
			else if (sel == 3) {
				// 구현 필요
			}
			
			// 4. 출력
			else if (sel == 4) {
				
				// 아이디 입력
				System.out.println("아이디를 입력하세요 : ");
				String id = sc.next();
				
				/////////
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				/////////
				if (st != null) st.printOneInfo();
				
			}
			
			// 5. 전체 출력
			else if (sel == 5) {
				
				/////////
				StudentSelectAll stAll = controller.getSelectAll();
				stAll.printAll();
				
			}
			
			// 6. 종료
			else if (sel == 6) {
				
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
				
			}
			
			
		}
		
	}
	
}
