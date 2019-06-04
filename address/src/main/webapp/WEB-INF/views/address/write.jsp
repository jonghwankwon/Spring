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
<%@ include file="../include/menu.jsp"%>
<h2>주소록 추가</h2>
	<form name="from1" method="post" action="${path}/address/insert.do">
		<table border="1" width="400px">
			<tr>
				<td>성별</td>
				<td><input type="text" name="gender"> </td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"> </td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel"> </td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address"> </td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>
</body>
</html>