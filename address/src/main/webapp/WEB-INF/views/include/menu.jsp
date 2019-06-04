<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:set var="path" value="${pageContext.request.contextPath}"/>
</head>
<body>
<div style="text-align: center;">
	<a href="${path}/">main</a>
	<a href="${path}/gugu.do?dan=3">구구단</a>
	<a href="${path}/test.do">테스트</a>
	<a href="${path}/member/list.do">회원관리</a>


</div>
</body>
</html>