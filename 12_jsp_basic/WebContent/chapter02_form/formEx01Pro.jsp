<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>process</title>
</head>
<body>
	
	<%--
	
		- 폼 전송을 통해서 넘어 오는 데이터는 request객체를 통해서 전달을 받는다.
		- 페이지의 encoding설정 외에 request객체의 encoding을 setCharacterEncoding메서드를 이용하여 추가로 지정해 주어야한다.
		- request.getParameter(); 메소드를 통해서 from을 통해 넘어온 데이터의 name속성 값을 가져온다.
		- request.getParameter(); 의 기본 반환타입은 문자열이다.
		- request.getParameterValues(); 메소드를 통해서 배열의 값을 처리 할 수 있다.
	 
	 --%>
	
	<% 
	
		request.setCharacterEncoding("utf-8");
	
		String userName = request.getParameter("userName");
		String userContact = request.getParameter("userContact");
		
		// 숫자 데이터는 형변환을 한다.
		int userAge = Integer.parseInt(request.getParameter("userAge"));
		
		System.out.println(userName + " / " + userContact + " / " + userAge);
	
	%>
	
	<h3>전송되었습니다.</h3>
	<p><a href="formEx01.jsp">뒤로가기</a></p>

</body>
</html>


