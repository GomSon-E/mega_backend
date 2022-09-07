package step4_01.string;

//2022.09.06 20:40 - 20:50 + 2022.09.07 19:01 - 19:04

import java.util.Scanner;

/*
 * # 쇼핑몰 [관리자]
 * 
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * 
 * 
 * } 
 */



public class StringEx11_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCount = 0;
		
		while(true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			
			System.out.print(": ");
			int sel = sc.nextInt();
			
			if	    (sel == 1) {
				System.out.print("추가할 카테고리 입력 : ");
				String category = sc.next();
				items[itemCount][0] = category;
				itemCount++;
			}
			else if (sel == 2) {
				for (int i = 0; i < itemCount; i++) {
					System.out.println("[" + i + "] " + items[i][0]);
				}
				System.out.print("카테고리 인덱스 입력 : ");
				int index = sc.nextInt();
				System.out.print("추가할 아이템 입력 : ");
				String item = sc.next();
				
				items[index][1] += item + "/";
			}
			else if (sel == 3) {
				for (int i = 0; i < itemCount; i++) {
					System.out.print(items[i][0] + " : " + items[i][1]);
					System.out.println();
				}
			}
			
		}



	}

}
