package step3_01.arrayAdvance;

import java.util.Arrays;

public class ArrayEx34 {

	public static void main(String[] args) {
		
		int nVar1 = 10;
		int nVar2 = nVar1; // 데이터(값)만 복사하여 대입
		
		nVar1 = 100;
		
		System.out.println("nVar1 : " + nVar1);
		System.out.println("nVar2 : " + nVar2);
		
		System.out.println();
		
		int[] arr = {87, 100, 24, 11, 79};
		int[] temp = arr;
		
		System.out.println("arr : " + arr);
		System.out.println("temp : " + temp);
		
		arr[0] = 0;
		temp[1] = 0;
		arr[2] = 0;
		temp[3] = 0;
		arr[4] = 0;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
	}
	
}
