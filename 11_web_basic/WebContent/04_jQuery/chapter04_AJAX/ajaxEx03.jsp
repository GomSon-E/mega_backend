<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>receive 예시</title>
<script src="04_jQuery/js/jquery-3.6.1.min.js"></script>
<script>

	$().ready(function(){
		
		$("#recvTest").click(function(){
			$.ajax({
				url : "/11_web_basic/ajaxEx03",
				type : "post",
				success : function(data, status, xhr) {		  // 통신이 성공했을 경우 실행되는 콜백함수
					console.log("통신 성공 콜백 함수")
					console.log(data)
					//console.log(status)
					//console.log(xhr)
					console.log("")
				},
				error : function (xhr, status, errorThrown) { // 통신이 실패했을 경우 실행되는 콜백함수
					console.log("통신 실패 콜백 함수")
					console.log(xhr)
					//console.log(status)
					//console.log(errorThrown)
					console.log("")
				},
				complete: function (xhr, status) {			  // 항상 실행되는 콜백함수
					console.log("항상 실행되는 콜백 함수")
					//console.log(xhr)
					//console.log(status)
					console.log("")
				}
			})
		});
		
	});
</script>
</head>
<body>
	<form>
		<p>
			<input type="button" id="recvTest" value="비동기통신"> 
		</p> 
	</form>
</body>
</html>