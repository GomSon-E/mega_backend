package step2_01.array;

// 완료

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		System.out.print("값을 입력해주세요 : ");
		int q8_num = sc.nextInt();
		int e_idx = 0;
		
		for (int i = 0; i < d.length; i++) {
			if (d[i] != q8_num) {
				e[e_idx] = d[i];
				e_idx++;
			}
		}
		
		System.out.println(Arrays.toString(e));
		
		System.out.println();		

		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		System.out.print("값을 입력해주세요 : ");
		int q9_num = sc.nextInt();
		int g_idx = 0;
		
		for (int i = 0; i < g.length; i += 2) {
			if (f[i] != q9_num) {
				g[g_idx] = f[i];
				g[g_idx + 1] = f[i + 1];
				g_idx += 2;
			}
		}
		
		System.out.println(Arrays.toString(g));
		
		System.out.println();	
		
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		System.out.print("값을 입력해주세요 : ");
		int q10_num = sc.nextInt();
		
		for (int i = 0; i < h.length - 1; i++) {
			h[i] = h[i + 1];
		}
		
		h[h.length - 1] = q10_num;
		
		System.out.println(Arrays.toString(h));
		
		System.out.println();	
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		System.out.print("값을 입력해주세요 : ");
		int q11_num = sc.nextInt();
		
		for (int j = i.length - 1; j > 0; j--) {
			i[j] = i[j-1];
		}
		
		i[0] = q11_num;
		
		System.out.println(Arrays.toString(i));
		
		System.out.println();	
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};
		
		int k_idx = 4;
		
		for (int l = 0; l < k.length; l++) {
			k[k_idx] = j[l];
			k_idx--;
		}
		
		System.out.println(Arrays.toString(k));	
		
	}

}
