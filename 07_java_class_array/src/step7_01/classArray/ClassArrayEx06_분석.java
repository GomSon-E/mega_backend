package step7_01.classArray;

class Member_ans {
	
	String name;
	int num;
	
}


class MemberManager_ans {

	Member_ans[] memberList = new Member_ans[3];

}

public class ClassArrayEx06_분석 {

	public static void main(String[] args) {
		
		MemberManager_ans mg = new MemberManager_ans();
		
		Member_ans m1 = new Member_ans();		
		mg.memberList[0] = m1;
		m1.name = "김철수";
		m1.num = 1001;
		
		m1 = new Member_ans();		
		mg.memberList[1] = m1;
		m1.name = "이만수";
		m1.num = 1002;
		
		m1 = new Member_ans();		
		mg.memberList[2] = m1;
		m1.name = "박영희";
		m1.num = 1003;
		
		for (int i = 0; i < mg.memberList.length; i++) {
			System.out.println("num : " + mg.memberList[i].num);
			System.out.println("name : " + mg.memberList[i].name);
			System.out.println();
		}
		
		Member_ans temp = mg.memberList[1];
		System.out.println("num : " + temp.num);
		System.out.println("name : " +temp.name);
		
	}
	
}
