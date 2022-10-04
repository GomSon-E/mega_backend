package step9_04.student_analysis;

public class StudentSelect {
	
	// 필드
	private StudentDAO studentDAO;
	
	// 생성자
	public StudentSelect(StudentDAO stDAO) {
		studentDAO = stDAO;
	}
	
	// select
	public StudentVO select(String id) {
		
		// checkId 해서 해당 id가 존재하면 HashMap.get()
		if (checkId(id)) {
			return studentDAO.select(id);
		}
		else {
			System.out.println("정보가 없습니다.");
			return null;
		}		
		
	}
	
	// checkId 
	public boolean checkId (String id) {
		
		// HashMap.get(id) 해서 studentVO를 들고 올 수 있으면 (null이 아니면) 
		// 이미 해당 아이디가 존재한다는 뜻 -> true 리턴
		StudentVO studentVO = studentDAO.select(id);
		return studentVO != null ? true : false;
			
	}

}
