package step2_01.array;

import java.util.Arrays;

//2022.08.31 21:28 - 21:40
//미완료

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = sc.nextInt();
			
			// 가입
			if		(selectMenu == 1) {
				System.out.print("계좌번호를 입력해주세요 : ");
				int in_acc = sc.nextInt();
				System.out.print("비밀번호를 입력해주세요 : ");
				int pw = sc.nextInt();
				
				boolean isExist_in = false;
				
				for (int i = 0; i < accs.length; i++) {
					if (in_acc == accs[i]) {
						System.out.println("이미 존재하는 계좌번호입니다.");
						System.out.println("다른 계좌번호로 가입을 시도해주세요.");
						isExist_in = true;
						break;
					}
				}
				
				if (isExist_in == false) {
					accs[accsCnt] = in_acc;
					pws[accsCnt] = pw;
					accsCnt++;
					System.out.println(Arrays.toString(accs));
					System.out.println(Arrays.toString(pws));
					System.out.println("가입이 완료되었습니다.");
				}		
						
			}
			
			// 탈퇴
			else if (selectMenu == 2) {
				System.out.print("계좌번호를 입력해주세요 : ");
				int out_acc = sc.nextInt();
				
				boolean isExist_out = false;
				
				for (int i = 0; i < accs.length; i++) {
					if (out_acc == accs[i]) {
						accs[i] = 0;
						pws[i] = 0;
						accsCnt--;
						isExist_out = true;
						System.out.println(Arrays.toString(accs));
						System.out.println(Arrays.toString(pws));
						System.out.println("탈퇴가 완료되었습니다.");
						break;
					}
				}
				
				if (isExist_out == false) {
					System.out.println("존재하지 않는 계좌번호입니다.");
					System.out.println("정확한 계좌번호로 탈퇴를 시도해주세요.");
				}
				
			}
			
			// 종료
			else if (selectMenu == 3) {
				isRun = false;
			}
			
		}

	}
}
