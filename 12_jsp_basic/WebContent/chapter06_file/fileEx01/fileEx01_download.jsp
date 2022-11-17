<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>download</title>
</head>
<body>
	<% 
	
		request.setCharacterEncoding("utf-8");
		
		String fileName = request.getParameter("fileName");
		// 파일의 저장 경로는 웹서비스의 접근 경로가 아닌 물리적인 실제 경로를 적어주어야 한다. 
		// * 폴더가 아닌 파일을 다운 받아야하기 때문에 폴더명 마지막에 \\를 추가해야 한다 (중요!!)
		String downloadFile = "C:\\Users\\19_web_syj\\git\\mega_backend\\12_jsp_basic\\WebContent\\errorPage\\" + fileName; 
	  
		// 파일을 읽어 스트림에 담기
		File file = new File(downloadFile);
	    FileInputStream in = new FileInputStream(downloadFile);
		
		// 한글명 파일 처리 명령어
	    fileName = new String(fileName.getBytes("utf-8"), "8859_1");   

	    // 파일다운로드 헤더지정
	    response.setContentType("application/octet-stream");							// 8비트로 된 데이터(지정되지 않은 파일 형식)
	    response.setHeader("Content-Disposition", "attachment; filename=" + fileName ); // 파일 링크를 클릭했을때 다운로드 화면이 출력되게 처리함
	    
	    //getOutputStream() 에러 해결 명령어 
		out.clear();					
		out = pageContext.pushBody();
	    
	    // 다운로드 명령어
	    OutputStream os = response.getOutputStream();
	    
	    int length;
	    byte[] b = new byte[(int)file.length()];

	    while ((length = in.read(b)) > 0) {
	    	os.write(b,0,length);
	    }
	    
	    os.flush();
	    
	    os.close();
	    in.close();
	    
	%>
</body>
</html>