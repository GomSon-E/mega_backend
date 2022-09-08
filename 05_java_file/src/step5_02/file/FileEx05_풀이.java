package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//2022.09.08 21:17 - 21:23

//# 파일 로드하기 : 연습문제


public class FileEx05_풀이 {

	public static void main(String[] args) {
		
		
		// 4번 연습문제에서 작성된 테스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3];			// momk , megait , github
		String[] pws   = new String[3];			// 1111 , 2222   , 3333
		int[] moneys   = new int[3];			// 20000, 30000 , 40000
		
		String fileName = "ex04.txt";
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			int idx = 0;
			
			while (true) {
				
				String data = br.readLine();
				
				if (data == null) {
					break;
				}
				
				String[] dataArr = data.split("/");
				
				names[idx] = dataArr[0];
				pws[idx] = dataArr[1];
				moneys[idx] = Integer.parseInt(dataArr[2]);
				
				idx ++;
				
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(pws));
		System.out.println(Arrays.toString(moneys));
		
		

	}

}
