package step9_04.student_analysis;

import java.util.HashMap;

public class StudentRepository {

	// 필드
	// StudentVO를 HashMap으로 저장
	private static HashMap<String, StudentVO> stDB = new HashMap<String, StudentVO>();

	// Getter & Setter
	public static HashMap<String, StudentVO> getStDB() {
		return stDB;
	}
	public static void setStDB(HashMap<String, StudentVO> stDB) {
		StudentRepository.stDB = stDB;
	}

}
