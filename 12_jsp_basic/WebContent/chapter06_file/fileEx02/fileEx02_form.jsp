<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>파일 업로드 예시 폼</title>
	<!-- 
	
		CREATE DATABASE FILE_EX;
		
		USE FILE_EX;
		
		CREATE TABLE FILE (
			USER_NAME 		     VARCHAR(30),
		    TITLE 			 	 VARCHAR(50),
		    ORIGINAL_FILE_NAME   VARCHAR(256),
		    FILESYSTEM_NAME		 VARCHAR(256),
		    CONTENT_TYPE 		 VARCHAR(256),
		    LENGTH				 LONG,
		    FILE_UPLOAD_DATE     DATE
		);

		SELECT * FROM FILE;
			
	 -->
</head>
<body>

   <form action="fileEx02_upload.jsp" method="post" enctype="multipart/form-data">
		<fieldset>
			<legend>파일 업로드</legend>
			<p>작성자: <input type="text" name="userName"></p>
			<p>제  목: <input type="text" name="title"></p>
			<p>파일명1 : <input type="file" name="uploadFile1"></p>
			<p>파일명2 : <input type="file" name="uploadFile2"></p>
			<p>파일명3 : <input type="file" name="uploadFile3"></p>
			<p><input type="submit" value="파일 올리기"></p>
		</fieldset>
	</form>
	
</body>
</html>