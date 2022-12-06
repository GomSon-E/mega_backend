<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 예시</title>
<script src="04_jQuery/js/jquery-3.6.1.min.js"></script>
<script>

	$().ready(function(){
		
		$("#loginBtn").click(function(){
			
			var param = {
				"id" : $("[name = 'id']").val(),
				"passwd" : $("[name = 'passwd']").val()
			 }
			
			$.ajax({
				url : "/11_web_basic/ajaxEx05",
				type : "post",
				data : param,
				success : function (data) {
					if (data == "P") {
						$("#loginDisplay").html("<h3>로그인되었습니다.</h3>")
					}
					else {
						alert("아이디와 패스워드를 확인하세요.")
					}
				}
			})
			
		});	
		
	});
	
</script>
</head>
<body>

	<div id="loginDisplay">
		<h3>비동기 로그인</h3>
		<p>id : <input type="text" name="id"></p>
		<p>pwd : <input type="password" name="passwd"></p>
		<input type="button" id="loginBtn" value="비동기 로그인">
	</div>
	 
</body>
</html>