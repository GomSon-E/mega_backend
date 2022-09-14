package step6_01.classObject;

import java.util.Scanner;

//2022.09.14 19:30 - 19:45

/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔     돈		1200
 */


class Ex10_ans {
	String name = "맘스터치";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}


public class ClassEx10_풀이 {

	public static void main(String[] args) {
		
		Ex10_ans e = new Ex10_ans();
		Scanner sc = new Scanner(System.in);
		int cash = 0;
		
		while (true) {
			
			// 주문받기
			System.out.println("메뉴를 선택해주세요.");
			for (int i = 0; i < e.arMenu.length; i++) {
				System.out.println("[" + i + "] " + e.arMenu[i]);
			}
			System.out.println("[4] 주문 종료");
			int sel = sc.nextInt();
			
			if (sel < 4) {
				System.out.println(e.arMenu[sel] + "이 주문되었습니다.");
				e.arCount[sel]++;
				e.total += e.arPrice[sel];
			}
			else if (sel == 4) {
				System.out.println("[합계금액] : " + e.total);
				System.out.println("[현금] : ");
				cash = sc.nextInt();
				break;
			}
			
		}
		
		// 영수증 출력
		System.out.println(e.name);
		System.out.println("----------------------");
		System.out.println("ITEM	QTY	AMT");
		for (int i = 0; i < e.arCount.length; i++) {
			if (e.arCount[i] != 0) {
				System.out.println(e.arMenu[i] + " " + e.arCount[i] + " " + e.arCount[i] * e.arPrice[i]);
			}
		}
		System.out.println("----------------------");
		System.out.println("합계금액		" + e.total);
		System.out.println("받은금액		" + cash);
		System.out.println("----------------------");
		System.out.println("잔     돈		" + (cash - e.total));}

}
