package step1_01.print;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintEx03 {

	public static void main(String[] args) {

		/*
		 * 
		 *  # 이스케이프 문자 ( escape sequence ) 
		 * 
		 * 	1) \n : 줄바꿈
		 *  2) \t : tab
		 *  3) \" : 문자 자체 " (문법x)
		 * 
		 */		
		
		 /* 
		 *  # 서식 문자 출력
		 *  
		 *  1) %d : 정수
		 *  2) %f : 실수
		 *  3) %c : 단일 문자
		 *  4) %s : 문자열
		 *  
		 *  5) %.1f : 소수점 1자리 까지 출력(반올림)
		 * 	   %.2f : 소수점 2자리 까지 출력(반올림)
		 *     %.3f : 소수점 3자리 까지 출력(반올림)
		 */
		
		System.out.println("안\n녕\n\n하\n세\n요");
		System.out.println("안녕\t하세요");
		System.out.println("\"안녕하세요\"");
		
		System.out.println("\n");
		
		System.out.printf("%d\n", 10);
		System.out.printf("%f\n", 3.14);
		System.out.printf("%.1f\n", 3.14);
		System.out.printf("%.2f\n", 3.14);
		System.out.printf("%.3f\n", 3.14);
		System.out.printf("%c\n", '#');
		System.out.printf("%s", "글자");
		
		System.out.println();
		
		System.out.printf("총점 : %d점, 평균 : %.1f\n", 290, 290 / 3.0);
		System.out.printf("이름 : %s, 나이 : %d, 총점 : %d, 평균 : %.1f\n", "김진영", 28, 398, 398 / 4.0);
	
		System.out.println("\n=========================\n");
		
		/*
		 * 
		 *  # Date
		 *  
		 * 	[1] 날짜 및 시간 출력 서식 지정 방법
		 *  	. 날짜 및 시간 서식에 사용되는 영문자를 제외한 나머지 문자는 입력하는 그대로 출력된다.
		 *  	. Date date = new Date();
		 *  	. SimpleDateFormat sdf = new SimpleDateFormat("날짜 및 시간 서식");
		 *  [2] 날짜 및 시간 서식 적용 방법
		 *  	. sdf.format(date);
		 *  [3] 날짜 및 시작 출력 서식 문자의 종류
		 *  	. 구글에서 "simpledateformat 날짜 형식" 라고 검색하기
		 *  
		 *  
		 *  # System.currentTimeMillis()
		 *   
		* 	- 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
		*   - 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long로 처리해야 한다.
		*   
		*/
		
		Date date = new Date();		
		System.out.println(date); // Wed Oct 05 19:10:34 KST 2022
		
		long time = System.currentTimeMillis();
		System.out.println(time); // 1664964971462
		
		System.out.println();
	
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); // MM (월) , mm (분)
		String date1 = sdf1.format(date);
		String time1 = sdf1.format(time);
		System.out.println("date1 : " + date1);
		System.out.println("time1 : " + time1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd"); // MM (월) , mm (분)
		String date2 = sdf2.format(date);
		String time2 = sdf2.format(time);
		System.out.println("date2 : " + date2);
		System.out.println("time2 : " + time2);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // MM (월) , mm (분)
		String date3 = sdf3.format(date);
		String time3 = sdf3.format(time);
		System.out.println("date3 : " + date3);
		System.out.println("time3 : " + time3);
		
		// DecimalFormat df = new DecimalFormat("숫자 서식");
		// 숫자 서식은 무조건 "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여준다.
		
		int salary1 = 10000;
		int salary2 = 100000;
		int salary3 = 1000000;
		
		DecimalFormat df = new DecimalFormat("#,##0");
		
		String temp = df.format(salary1);
		
		System.out.println("salary1 : " + temp);
		System.out.println("salary2 : $" + df.format(salary2));
		System.out.println("salary3 : " + df.format(salary3) + "원");
		
	}

}
