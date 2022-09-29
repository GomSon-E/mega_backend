package step8_01.technique;

// 생성자를 이용한 멤버변수 초기화

class GoodsDto {
	
	String goodsCode;
	String goodsName;
	int goodsPrice;
	
//	void setData(String goodsCode, String goodsName, int goodsPrice) {
//		this.goodsCode = goodsCode;
//		this.goodsName = goodsName;
//		this.goodsPrice = goodsPrice;
//	}

	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
	GoodsDto(String goodsCode, String goodsName, int goodsPrice) {
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}
	
	void printData() {
		System.out.println(this.goodsCode + " / " + this.goodsName + " / " + this.goodsPrice);
	}	

}

public class TechniqueEx04_02 {
	
	public static void main(String[] args) {
		
		GoodsDto g1 = new GoodsDto("0x001", "맨투맨", 40000);
		GoodsDto g2 = new GoodsDto("0x002", "조거팬츠", 50000);
		GoodsDto g3 = new GoodsDto("0x003", "바람막이", 70000);
		
		g1.printData();
		g2.printData();
		g3.printData();
		
	}

}
