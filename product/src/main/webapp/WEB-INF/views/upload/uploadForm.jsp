<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp"%>
</head>
<body>
	<%@ include file="../include/filemenu.jsp"%>
	<form method="post" id="form1" action="${path}/upload/uploadForm" enctype="multipart/form-data" target="iframe1">
		<!-- enctype = 그림이나 바이트 단위는 multipart/form-data로 넘겨줘야 깨지지않음 -->
		<input type="file" name="file">
		<input type="submit" value="업로드">
	</form>
	<!-- target을 주지않으면 페이지가 넘어가므로 target을 주어서 iframe에 표시함 -->
	<iframe name="iframe1">
	
	</iframe>

</body>
</html>