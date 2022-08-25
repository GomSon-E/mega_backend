package step1_06.loop;

//2022.08.24 19:07 - 19:11

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx26_풀이 {

	public static void main(String[] args) {
		
		for (int i  = 1; i <= 50; i++) {
			
			int firstNum = i / 10;
			int secondNum = i % 10;
			
			boolean isFirstNum = false;
			boolean isSecondNum = false;
			
			if (firstNum == 3 || firstNum == 6 || firstNum == 9) {
				isFirstNum = true;
			}
			if (secondNum == 3 || secondNum == 6 || secondNum == 9) {
				isSecondNum = true;
			}
			
			if (isFirstNum && isSecondNum) {
				System.out.print("짝짝 ");
			}
			else if (isFirstNum || isSecondNum) {
				System.out.print("짝 ");
			}
			else {
				System.out.print(i + " ");
			}
			
		}

	}

}
