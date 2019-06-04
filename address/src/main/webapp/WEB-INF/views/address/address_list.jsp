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
	<h2>주소록</h2>
	<input type="button" value="친구추가"  onclick="location.href='${path}/address/write.do'">
	<table border="1" width="700px">
		<tr>
			<td>성별</td>
			<td>이 름</td>
			<td>전화번호</td>
			<td>주소</td>
		</tr>
		<c:forEach var="row" items="${list}">
			<tr>
				<td>${row.gender}</td>
				<td><a href="${path}/address/view.do?name=${row.name}">${row.name}</a></td>
				<td>${row.tel}</td>
				<td>${row.address}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>