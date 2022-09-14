package step6_02.method;

import java.util.Scanner;

//2022.09.14 21:18 - 21:21


class Ex05 {

	void test1() {
		
		int sum = 0;
		
		for (int i = 1; i < 6; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}
	
	void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("숫자를 입력하세요 : ");
			arr[i] = sc.nextInt();
			
			if (arr[i] > max) {
				max = arr[i];
			}
		}	
		
		System.out.println(max);
		
		sc.close();
	}
	
}


public class MethodEx05_풀이 {

	public static void main(String[] args) {

			Ex05 e = new Ex05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();


	}

}
