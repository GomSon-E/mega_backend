package step7_01.classArray;

import java.util.ArrayList;

class Tv_prac {
	
	String name;
	String brand;
	int price;

	void setData(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
}

class TvList_prac {
	
	Tv_prac[] arr;
	int elementCount;

	void add(Tv_prac tv) {
		
		if (elementCount == 0) {
			arr = new Tv_prac[elementCount + 1];
		} 
		else if (elementCount > 0) {
			Tv_prac[] temp = arr;
			arr = new Tv_prac[elementCount + 1];
			for (int i = 0; i < elementCount; i++) {
				arr[i] = temp[i];
			}
		}
		arr[elementCount] = tv;
		elementCount++;
		
	}

	int size() {
		return elementCount;
	}

	void remove(int index) {
		
		if (elementCount == 1) {
			arr = null;
			elementCount = 0;
		} 
		else if (elementCount > 1) {
			Tv_prac[] temp = arr;

			arr = new Tv_prac[elementCount - 1];
			int j = 0;
			for (int i = 0; i < elementCount; i++) {
				if (i != index) {
					arr[j++] = temp[i];
				}
			}
			elementCount--;
		}
		
	}

	Tv_prac get(int index) {
		return arr[index];
	}

}


public class ClassArrayEx12_연습 {

	public static void main(String[] args) {
		
		// ArrayList 사용
		ArrayList<Tv_prac> list = new ArrayList<>();

		Tv_prac temp = new Tv_prac();
		temp.setData("TV", "삼성", 1000);
		list.add(temp);
		
		temp = new Tv_prac();
		temp.setData("시그니처TV", "엘지", 2000);
		list.add(temp);

		temp = new Tv_prac();
		temp.setData("스마트TV", "애플", 3000);
		list.add(temp);
	
		for (Tv_prac tv : list) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		

		System.out.println("\n========================================\n");

		// 직접 구현한 ArrayList 사용
		TvList_prac myList = new TvList_prac();
		temp = new Tv_prac();
		temp.setData("TV", "삼성", 1000);
		myList.add(temp);

		temp = new Tv_prac();
		temp.setData("시그니처TV", "엘지", 2000);
		myList.add(temp);

		temp = new Tv_prac();
		temp.setData("스마트TV", "애플", 3000);
		myList.add(temp);

		for (Tv_prac tv : myList.arr) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}

	}

}
