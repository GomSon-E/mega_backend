package step1_05.controlStatement;

/*
 * 
 * # 중첩 if 문
 * 
 * 	- if문 안의 명령어에 또 if문이 중첩으로 들어간 형태
 * 
 * */

public class IfEx08 {

	public static void main(String[] args) {
		
		int totalGrade = 90;
		
		if (totalGrade >= 60) {
			
			if (totalGrade == 100) {
				System.out.println("만점");
			}
			
			System.out.println("합격");
		}
		
		if (totalGrade < 60)  System.out.println("불합격");
		
	}
	
}
