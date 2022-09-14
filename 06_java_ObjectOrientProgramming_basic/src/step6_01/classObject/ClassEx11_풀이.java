package step6_01.classObject;

//2022.09.14 19:45 - 19:50 + 미완료

/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.util.Scanner;

class Ex11_ans{
	String name = "";
	
	String[] arAcc = new String[5];
	String[] arPw  = new String[5];
	int[] arMoney  = new int[5];
	
	int accCnt = 0;
	int identifier = -1;
}


public class ClassEx11_풀이 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Ex11_ans e = new Ex11_ans();
		e.name = "Mega Bank";
		
		while (true) {
			
			System.out.println("[" + e.name + "]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if		(sel == 1) {
				System.out.println("아이디를 입력하세요 : ");
				String id = sc.next();
				
				// 아이디 중복체크
				for (int i = 0; i < e.arAcc.length; i++) {
					if (id == e.arAcc[i]) {
						System.out.println("중복된 아이디입니다.");
						break;
					}
				}
				
				System.out.println("비밀번호를 입력하세요 : ");
				String pw = sc.next();
				
			}
			else if (sel == 2) {}
			else if (sel == 3) {}
			else if (sel == 4) {}
			else if (sel == 5) {}
			else if (sel == 6) {}
			else if (sel == 7) {}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}		
		
	}

}
