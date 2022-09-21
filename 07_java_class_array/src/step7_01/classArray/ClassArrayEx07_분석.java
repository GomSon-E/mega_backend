package step7_01.classArray;

class Subject_ans {
	
	String name;
	int score;
	
}

class Student_ans {
	
	Subject_ans[] subjects;
	String name;
	
}

public class ClassArrayEx07_분석 {

	public static void main(String[] args) {
		
		Student_ans[] studentList = new Student_ans[3];
		
		studentList[0] = new Student_ans();
		studentList[0].name = "학생0";
		studentList[0].subjects = new Subject_ans[3];		
		
		for (int i = 0; i < 3; i++) {
			studentList[0].subjects[i] = new Subject_ans();
			studentList[0].subjects[i].name = "학생0 과목" + i;
			studentList[0].subjects[i].score = 100;
		}
		
		studentList[1] = new Student_ans();
		studentList[1].name = "학생1";
		studentList[1].subjects = new Subject_ans[2];		
		studentList[1].subjects[0] = new Subject_ans();
		studentList[1].subjects[0].name = "학생1 과목0";
		studentList[1].subjects[0].score = 100;	
		studentList[1].subjects[1] = new Subject_ans();
		studentList[1].subjects[1].name = "학생1 과목1";
		studentList[1].subjects[1].score = 100;
		
		studentList[2] = new Student_ans();
		studentList[2].name = "학생2";
		studentList[2].subjects = new Subject_ans[1];
		studentList[2].subjects[0] = new Subject_ans();
		studentList[2].subjects[0].name = "학생2 과목1";
		studentList[2].subjects[0].score = 100;
		
		for (int i = 0; i < studentList.length; i++) {
			System.out.println("--- " + studentList[i].name + " ---");
			for (int j = 0; j < studentList[i].subjects.length; j++) {
				System.out.println(studentList[i].subjects[j].name  + " / " + studentList[i].subjects[j].score);
			}
			System.out.println();
		}
		
	}
	
}
