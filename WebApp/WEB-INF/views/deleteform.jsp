<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/GuestBook3/delete" method="post">
		<!-- 값만 저장하고싶을때 hidden을 사용한다. -->
		<input type='hidden' name="no" value="${param.id }">
		<table>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="passwd"></td>
				<td><input type="submit" value=" 확인 "></td>
				<td><a href="/GuestBook3/index">메인으로 돌아가기</a></td>
			</tr>
		</table>
	</form>
</body>
</html>