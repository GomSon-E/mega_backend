//2022.09.20 21:06 - 21:44 + 미완료

package step5_02.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//# 파일 컨트롤러[1단계] : 벡터

public class FileEx06_풀이_미완료 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vector = null;
		int elementCnt = 0;
		
		String fileName = "vector.txt";
		
		while (true) {
			
			System.out.print("vector >> [");
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(vector[i] + ", ");
			}
			System.out.println("]");
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			// 추가
			if		(sel == 1) {
				
				System.out.print("추가할 숫자를 입력해주세요 : ");
				int input = sc.nextInt();
				
				if (vector == null) {	
					vector = new int[1];
					vector[0] = input;
				}
				else {
					int[] temp = vector;
					
					vector = new int[elementCnt + 1];
					
					for (int i = 0; i < elementCnt; i++) {
						vector[i] = temp[i];
					}
					
					vector[elementCnt] = input;				
				}
				
				elementCnt ++;
				
			}
			else if (sel == 2) {
				
				System.out.print("삭제할 인덱스를 입력해주세요 : ");
				int idx = sc.nextInt();
				
				if (idx > vector.length) {
					System.out.println("삭제할 데이터가 없습니다.");
				}
				else {
					
					elementCnt --;
					
					for (int i = idx; i < vector.length; i++) {
						
						if (i > elementCnt - 1) {
							vector[i] = 0;
						}
						else {
							vector[i] = vector[i + 1];
						}					
							
					}					
					
				}
				
			}
			
			else if (sel == 3) {
				
				FileWriter fw;
				try {
					fw = new FileWriter(fileName);
					
					String data = null;
					
					for (int i = 0; i < elementCnt; i++) {
						data += vector[i];
						data += "\n";
					}
					
					fw.write(data);
					
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
				
			}
			else if (sel == 4) {
				
				String data = "";
				
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					fr = new FileReader(fileName);
					br = new BufferedReader(fr);
					
					while (true) {
						
						String line = br.readLine();
						
						if (line == null) {
							break;
						}
						
						data += line;
						data += "\n";			
						
					}
					
					String[] datas = data.split("\n");
					
					vector = new int[datas.length];
					
					for (int i = 0; i < vector.length; i++) {
						vector[i] = Integer.parseInt(datas[i]);
					}
					
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
			else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
