<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 테스트</title>
<%@ include file="../include/header.jsp"%>
</head>
<body>
<a href="${path}/upload/uploadForm">업로드 테스트</a> <!-- 컨트롤러를 경유 -->
<a href="${path}/shop/product/list.do">상품 목록</a> <!-- 컨트롤러를 경유 -->
	
</body>
</html>