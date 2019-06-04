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
		document.form1.action="${path}/address/update.do";
		document.form1.submit();
	});
	
	$("#btnDelect").click(function(){
		if(confirm("삭제하시겠습니까?")){
			document.form1.action="${path}/address/delete.do";
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
				<td>성별</td>
				<td><input name="gender" value="${dto.gender}" readonly></td>
			</tr>		
			<tr>
				<td>이름</td>
				<td><input name="name" value="${dto.name}" readonly></td>
			</tr>		
			<tr>
				<td>전화번호</td>
				<td><input name="tel" value="${dto.tel }" > </td>
			</tr>		
			<tr>
				<td>주소</td>
				<td><input name="address" value="${dto.address}"> </td>
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