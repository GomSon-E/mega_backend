package step9_04.student_analysis;

import java.util.Map;

public class StudentDAO {

	// insert : HashMap.put(String, StudentVO)
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	// select : HashMap.get(String);
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
	}
	
	/////////////
	public Map<String, StudentVO> getStudentDB() {
		return StudentRepository.getStDB();
	}	
	
}
