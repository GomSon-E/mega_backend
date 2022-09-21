package step7_01.classArray;

class MyList {
	
	int[] arr;
	int elementCnt;
	
	void print() {
		System.out.print("[");
		for (int i = 0; i < elementCnt; i++) {
			System.out.print(arr[i]);
			if (i != elementCnt - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	void add(int value) {
		if (elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if (elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			
			for (int i = 0; i < temp.length; i++) {
				arr[i] = temp[i];
			}
			
			temp = null;
		}
		
		arr[elementCnt] = value;
		elementCnt++;
	}
	
	void add(int index, int value) {
		if (elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if (elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			
			for (int i = 0; i < temp.length; i++) {
				if (i < index) {
					arr[i] = temp[i];
				}
				else {
					arr[i + 1] = temp[i];
				}
			}
			
			temp = null;
		}
		
		arr[index] = value;
		elementCnt++;
	}
	
	void remove(int index) {
		
		if (arr.length == 1) {
			arr = null;
			elementCnt = 0;
		}
		else if (arr.length > 1) {
			int[] temp = arr;
			arr = new int[elementCnt - 1];
			
			for (int i = 0; i < temp.length; i++) {
				if (i < index) {
					arr[i] = temp[i];
				}
				else {
					
				}
			}
		}
		
	}
	
	int size() {
		return elementCnt;
	}
	
	int get(int index) {
		return arr[index];
	}
	
	void set(int index, int value) {
		arr[index] = value;
	}
	
	void clear() {
		arr = null;
		elementCnt = 0;
	}
	
}

public class ClassArrayEx13_도전_미완료 {

	public static void main(String[] args) {
		
		// 직접 구현한 ArrayList
		MyList list = new MyList();

		// 추가하기
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();
		
		// 삽입하기
		list.add(0, 9);
		// 출력하기
		list.print();
		
	}
	
}
