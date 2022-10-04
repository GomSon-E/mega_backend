package step9_04.student_analysis;

public class StudentVO {

	// 필드
	private String id;
	private int num;
	private String name;
	
	// 생성자
	public StudentVO(String id, int num, String name) {
		this.id = id;
		this.num = num;
		this.name = name;
	}
	
	// printOneInfo
	public void printOneInfo() {
		// 하나의 StudentVO 객체 정보 출력
		System.out.println("id: " + this.id + " / num: " + this.num + " / name: " + this.name);
	}
	
//	// toString
//	@Override
//	public String toString() {
//		return "id: " + id + "/ num: " + num + "/ name: " + name;
//	}
	
	// Getter & Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
