<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../../include/header.jsp"%>
<script type="text/javascript">
$(function(){
	$("#btnAdd").click(function(){
		location.href="${path}/shop/product/write.do";
	});
});
</script>
</head>
<body>
<%@ include file="../../include/filemenu.jsp"%>
<h2>상품 목록</h2>
	<button type="button" id="btnAdd">상품 등록</button>
	<table border="1" width="500px">
		<tr>
			<th>상품ID</th>
			<th>상품명</th>
			<th>상품이미지</th>
			<th>가격</th>
		</tr>
		<c:forEach var="row" items="${list}">
			<tr align="center">
				<td>${row.product_id }</td>
				<td>
				<a href="${path}/shop/product/detail/${row.product_id}">${row.product_name}</a></td>
				<td> <img src="${path}/resources/images/${row.picture_url}" width="100" height="100"></td>
				<td> <fmt:formatNumber value="${row.price}" pattern="#,###"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>