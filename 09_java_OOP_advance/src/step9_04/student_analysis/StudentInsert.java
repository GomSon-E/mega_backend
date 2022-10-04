package step9_04.student_analysis;


public class StudentInsert {

	// 필드
	private StudentDAO studentDAO;
	
	// 생성자
	public StudentInsert(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}
	
	// insert
	public void insert(StudentVO studentVO) {
		
		////////////
		String id = studentVO.getId();
		
		// checkId 해서 중복된 아이디가 없으면 HashMap.put()
		if (checkId(id)) {
			studentDAO.insert(studentVO);
		}
		else {
			System.out.println("중복된 아이디입니다.");
		}
		
	}
	
	// checkId 
	public boolean checkId (String id) {
		
		// HashMap.get(id) 해서 studentVO를 들고 올 수 있으면 (null이 아니면) 
		// 이미 해당 아이디가 존재한다는 뜻 -> false 리턴
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null ? true : false;
			
	}
	
}
