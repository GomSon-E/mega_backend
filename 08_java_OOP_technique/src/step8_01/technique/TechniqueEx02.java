package step8_01.technique;

/*
 * 
 *  # 캡슐화 (capsulation)
 * 
 * - 접근제어자 : public , private  + getter/setter
 * 
 * 
 * [ 접근제어자(Modifier)의 종류 ]
 * 
 * public  : 프로젝트 전체에서 접근 가능
 * private : 클래스 내부에서만 접근 가능
 * 
 * default(package) : 패키지 내에서만 접근가능
 * protected        : 상속관계에서 접근 가능
 * 
 * 
 * */

class ModifierTest {
	
	private int a;
	public int b;
	
	// private 변수를 클래스 외부로 꺼내주는 메서드 getter
	int getA() { // 변수명 앞에 get을 추가하여 메서드의 이름을 지정한다.
		return a;
	}
	
	// private 변수를 클래스 외부에서 수정하는 메서드 setter
	void setA(int a) { // 변수명 앞에 set을 추가하여 메서드의 이름을 지정한다.
		this.a = a;
	}
		
}

// VO : Value Object : 값 객체
// DTO : Data Transfer Object : 데이터 전송 객체
class GetterSetterVO {
	
	private String productCode;
	private String productName;
	private int productPrice;
	private String managerCode;
	private String managerName;
	
	// getter & setter 생성 단축키
	// 좌측 상단 Source > Generate Getters and Getters > selectAll > Generate
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getManagerCode() {
		return managerCode;
	}
	public void setManagerCode(String managerCode) {
		this.managerCode = managerCode;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
}

public class TechniqueEx02 {

	public static void main(String[] args) {
		
		ModifierTest obj = new ModifierTest();
		
		// private 변수는 외부에서 접근 불가
		// obj.a = 1000;
		// System.out.println(obj.a);
		
		obj.b = 2000;
		System.out.println(obj.b);	
		
		obj.setA(777);					// setter를 이용하여 private 변수에 값 대입
		System.out.println(obj.getA());	// getter를 이용하여 private 변수의 값 가져오기
		
		System.out.println();
		
		GetterSetterVO gsVo = new GetterSetterVO();
		
		// gsVo.productCode = "0x001";
		// gsVo.productName = "기계식 키보드";
		
		gsVo.setProductCode("0x001");
		gsVo.setProductName("기계식 키보드");
		gsVo.setProductPrice(37000);
		gsVo.setManagerCode("mgr1");
		gsVo.setManagerName("담당자A");
		
		// System.out.println(gsVo.productCode);
		// System.out.println(gsVo.productName);
		
		System.out.println(gsVo.getProductCode());
		System.out.println(gsVo.getProductName());
		System.out.println(gsVo.getProductPrice());
		System.out.println(gsVo.getManagerCode());
		System.out.println(gsVo.getManagerName());
		
	}
	
}
