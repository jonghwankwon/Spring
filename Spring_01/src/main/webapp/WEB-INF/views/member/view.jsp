<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp"%>
<script type="text/javascript">
$(function(){
	$("#btnUpdate").click(function(){
		document.form1.action="${path}/member/update.do";
		document.form1.submit();
	});
	
	$("#btnDelect").click(function(){
		if(confirm("삭제하시겠습니까?")){
			document.form1.action="${path}/member/delete.do";
			document.form1.submit();
		}
	});
});
</script>
</head>
<body>
<%@ include file="../include/menu.jsp"%>
	<form name="form1" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input name="userid" value="${dto.userid}" readonly></td>
			</tr>		
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="passwd" > </td>
			</tr>		
			<tr>
				<td>이름</td>
				<td><input name="name" value="${dto.name}"> </td>
			</tr>		
			<tr>
				<td>이메일</td>
				<td><input name="email" value="${dto.email}"> </td>
			</tr>		
			<tr>
				<td>가입 일자</td>
				<td><fmt:formatDate value="${dto.join_date}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			</tr>		
			<tr>
				<td colspan="2" align="center">
				<input type="button" value="수정" id="btnUpdate">
				<input type="button" value="삭제" id="btnDelect">
				<div style="color: red;">${message}</div>
				</td>
			</tr>		
		</table>
	</form>	
</body>
</html>