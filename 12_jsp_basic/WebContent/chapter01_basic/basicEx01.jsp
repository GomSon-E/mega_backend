<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력함수</title>
</head>
<body>
	
	<%-- 
  
		# jsp는 html태그 위에 jsp 태그를 추가하여 사용한다.
		 
	    1) 지시자(Directive) 태그        	<%@    %>
	    2) 선언자(Declration) 태그      	<%!    %>
	    3) 표현식(Expression) 태그      	<%=    %>
	    4) 스크립트릿(Scriptlet) 태그  		<%     %>	

	 --%>

	<!-- html주석 : 개발자도구에서 볼 수 있습니다. -->
	<%-- jsp주석  : 개발자도구에서 볼 수 없습니다. --%>
	

	<h3>출력함수</h3> <!-- html문법 -->

	<% 	
	
		// 자바 문법
		String name = "팀 버너스 리";
	
		System.out.println(name); // 자바 console에 데이터 출력
		//out.println(name);		  // html에 데이터를 출력
	
	%>
	
	<hr>
	
	<p>출력결과 : name</p>
	
	<!-- html에서 자바변수 표기법 -->
	<p>출력결과 : <%=name %></p>


</body>
</html>

