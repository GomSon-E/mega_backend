package step2_01.array;

//2022.08.29 21:30 - 20:35

import java.util.Arrays;

//2022.08.29 21:## - 21:##

import java.util.Random;


/*
 * # 중복숫자 금지[1단계]
 * 
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 *  예)
 *  
 * [ 처음상태 ]
 * isFirst = {false , false , false , false , false}
 * arr     = {0, 0, 0, 0, 0}
 *  
 * 랜덤숫자 : 1
 * isFirst = {false , true , false , false , false}
 * arr     = {1, 0, 0, 0, 0}
 * 
 * 랜덤숫자 : 3
 * isFirst = {false , true , false , true , false}
 * arr     = {1, 3, 0, 0, 0}
 * 
 * 랜덤숫자 : 2
 * isFirst = {false , true , true , true , false}
 * arr     = {1, 3, 2, 0, 0}
 */


public class ArrayEx11_풀이 {

	public static void main(String[] args) {
	
		Random rd  = new Random(); 
		
		boolean[] isFirst = new boolean[5];
		int[] arr   = new int[5];
		
		int index = 0;
		
		while (true) {
			int num = rd.nextInt(5);

			if (index == 5) {
				break;
			}
			
			if (isFirst[num] == false) {
				isFirst[num] = true;
				arr[index] = num;
				index++;
			}
				
			System.out.println(Arrays.toString(arr));
		}
					
	}
	
}
