package step7_01.classArray;

import java.util.ArrayList;

class Tv {
	
	String name;
	String brand;
	int price;
	
	void setData(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
}

class TvList {
	
	Tv[] arr;
	int elementCnt = 0;
	
	void add(Tv tv) {
		
		if (elementCnt == 0) {
			arr = new Tv[elementCnt+1];
		}
		else if (elementCnt > 0) {
			Tv[] temp = arr;
			arr = new Tv[elementCnt+1];
			
			for (int i = 0; i < temp.length; i++) {
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
		
		if (arr.length == 1) {
			arr = null;
			elementCnt = 0;
		}
		else if (arr.length > 1) {
			Tv[] temp = arr;
			arr = new Tv[elementCnt-1];
			
			for (int i = 0; i < temp.length - 1; i++) {
				if (i < index) {
					arr[i] = temp[i];
				}
				else {
					arr[i] = temp[i+1];
				}
			}
			
			elementCnt--;
		}
		
	}
	
}

public class ClassArrayEx12_도전 {

	public static void main(String[] args) {
		
		// ArrayList 사용
		ArrayList<Tv> list = new ArrayList<Tv>();
		
		Tv temp = new Tv();
		temp.setData("TV", "삼성", 1000);
		list.add(temp);
		
		temp = new Tv();
		temp.setData("시그니처TV", "엘지", 2000);
		list.add(temp);
		
		temp = new Tv();
		temp.setData("스마트TV", "애플", 3000);
		list.add(temp);
		
		for (Tv tv : list) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		
		// 직접 구현 ArrayList 사용
		TvList myList = new TvList();
		
		temp = new Tv();
		temp.setData("TV", "삼성", 1000);
		myList.add(temp);
		
		temp = new Tv();
		temp.setData("시그니처TV", "엘지", 2000);
		myList.add(temp);
		
		temp = new Tv();
		temp.setData("스마트TV", "애플", 3000);
		myList.add(temp);
		
		for (Tv tv : myList.arr) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		
	}
	
}
