package step7_01.classArray;

class Card_ans {
	
	int num;
	String shape;
	
}

public class classArrayEx02_분석 {

	public static void main(String[] args) {
		
		Card_ans[] cardList = new Card_ans[10];
		
		for (int i = 0; i < 10; i++) {
			cardList[i] = new Card_ans();
			cardList[i].num = (i + 1);
			cardList[i].shape = "클로버";
		}
		
		for (int i = 0; i < cardList.length; i++) {
			System.out.println("num : " + cardList[i].num);
			System.out.println("shape : " + cardList[i].shape);
			System.out.println();
		}
		
	}
	
}
