<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반복문</title>
</head>
<body>

	<%-- 

		1) forEach문1 
	
			[형식]
	
			<c:forEach var="임시변수명" begin="시작" end="끝" step="증감식"></c:forEach>
		
			- java의 for문 기능을 한다.
			- var속성에 임시변수명을 작성하고 begin , end속성으로 반복 횟수를 지정한다.
			  (옵션)step을 통해서 증감식을 지정할 수 있다.
		
	  
	  
		2) forEach문2
			
			[형식]
			
			<c:forEach var="임시변수명" items=${배열이름}" varStatus="변수명">	</c:forEach>
			
			- 자바의 forEach문 기능을 한다.
			- items 속성에 배열 및 어레이리스트등 반복가능한 객체를 지정한다.
			
			[ varStatus 속성값 ]
			
			${변수명.current} : 현재 for문의 해당하는 값
			${변수명.index}   : 0부터의 순서
			${변수명.count}   : 1부터의 순서
			${변수명.first}   : 첫 번째인지 여부
			${변수명.last}    : 마지막인지 여부
			${변수명.begin}   : for문의 시작 번호
			${변수명.end}     : for문의 끝 번호
			${변수명.step}    : for문의 증가값
			
	 --%>
	
	<h3>1) forEach문 (= 일반 for문)</h3>
	
	<c:forEach var="i" begin="1" end="10"> <!-- for (int i = 1; i <= 10; i++) -->
		${i}
	</c:forEach>
	
	<hr>
		
	<c:forEach var="i" begin="1" end="10" step="${i = i + 2 }"> <!-- for (int i = 1; i <= 10; i += 2) -->
		${i}
	</c:forEach>
	
	<hr>
	
	<h3>2) forEach문 향상된 for 문</h3>
	
	<c:forEach var="data" items="${datas}"> <!-- for (String data : datas) -->
		${data }
	</c:forEach>
	
	<hr>
	
	<c:forEach var="data" items="${datas}" varStatus="i"> 
		<p>${i.count} / ${i.index} / ${data}</p>
	</c:forEach>
	
	<hr>
	
	<table border="1">
		<tr>
			<th>상품코드</th>
			<th>상품이름</th>
			<th>부서코드</th>
			<th>부서이름</th>
			<th>담당자코드</th>
			<th>담당자이름</th>
		</tr>
		<c:choose>
			<c:when test="${empty productList}">
				<tr align="center">
					<td colspan="6">상품이 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="productDto" items="${productList }">
					<tr>
						<td>${productDto.pdCd }</td>
						<td>${productDto.pdNm }</td>
						<td>${productDto.deptCd }</td>
						<td>${productDto.deptNm }</td>
						<td>${productDto.mgrCd }</td>
						<td>${productDto.mgrNm }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
			
	</table>
	
</body>
</html>