package step7_01.classArray;

import java.util.ArrayList;

class Tv_ana {
	
	String name;
	String brand;
	int price;
	
	void setData(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
}

class TvList_ana {
	
	Tv_ana[] arr;
	int elementCnt;
	
	void add(Tv_ana tv) {
		
		if (elementCnt == 0) {
			arr = new Tv_ana[elementCnt + 1];
		}
		else if (elementCnt > 0) {
			Tv_ana[] temp = arr;
			arr = new Tv_ana[elementCnt + 1];
			for (int i = 0; i < elementCnt; i++) {
				arr[i] = temp[i];
			}
		}
		
		arr[elementCnt] = tv;
		elementCnt++;
		
	}
	
	int size() {
		return elementCnt;
	}
	
	void remove(int index) {
		
		if (elementCnt == 1) {
			arr = null;
			elementCnt = 0;
		}
		else if (elementCnt > 1) {
			Tv_ana[] temp = arr;
			
			arr = new Tv_ana[elementCnt - 1];
			int j = 0;
			for (int i = 0; i < elementCnt; i++) {
				if (i != index) {
					arr[j++] = temp[i];
				}
			}
			elementCnt--;
		}
		
	}
	
}

public class ClassArrayEx12_분석 {

	public static void main(String[] args) {
		
		// ArrayList 사용
		ArrayList<Tv_ana> list = new ArrayList<Tv_ana>();
		
		Tv_ana temp = new Tv_ana();
		temp.setData("TV", "삼성", 1000);
		list.add(temp);
		
		temp = new Tv_ana();
		temp.setData("시그니처TV", "엘지", 2000);
		list.add(temp);
		
		temp = new Tv_ana();
		temp.setData("스마트TV", "애플", 3000);
		list.add(temp);
		
		for (Tv_ana tv : list) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		
		
		// 직접 구현 ArrayList 사용
		TvList_ana myList = new TvList_ana();
		
		temp = new Tv_ana();
		temp.setData("TV", "삼성", 1000);
		myList.add(temp);
		
		temp = new Tv_ana();
		temp.setData("시그니처TV", "엘지", 2000);
		myList.add(temp);
		
		temp = new Tv_ana();
		temp.setData("스마트TV", "애플", 3000);
		myList.add(temp);
		
		for (Tv_ana tv : myList.arr) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		
		
		
	}
	
}
