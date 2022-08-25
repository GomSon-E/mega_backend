package step1_06.loop;

//2022.08.24 20:00 - 20:13 + 20:24 - 20:30


// # 삼각형 그리기

public class LoopEx28_풀이 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		System.out.println("예");
		
		for (int i = 0; i < 9; i++) {
			System.out.print("#");
			if (i % 3 == 2) System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		
		System.out.println("문제1");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();

		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		
		System.out.println("문제2");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < (3-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		
		System.out.println("문제3");
			
		for (int i = 3; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();

		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		
		System.out.println("문제 4");
		
		for (int i = 3; i > 0; i--) {
			for (int j = 0; j < (3-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */

		System.out.println("문제 5");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("@");
			}
			for (int j = 0; j < (3-i); j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		
		System.out.println("문제 6");
		
		int k = 1;
		
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < (3-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < k; j++) {
				System.out.print("#");
			}
			for (int j = 0; j < (3-i); j++) {
				System.out.print(" ");
			}
			k += 2;
			System.out.println();
		}
		
		System.out.println();

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		
		System.out.println("문제 7");
		
		int l = 5;
		
		for (int i = 3; i > 0; i--) {
			for (int j = 0; j < (3-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < l; j++) {
				System.out.print("#");
			}
			for (int j = 0; j < (3-i); j++) {
				System.out.print(" ");
			}
			l -= 2;
			System.out.println();
		}
		
		System.out.println();

		
		
	}
}
