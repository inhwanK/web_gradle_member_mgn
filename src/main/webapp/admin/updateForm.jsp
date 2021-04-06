<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="updateform" action="../MemberUpdateServlet" method="post">
	<table border=1>
		<tr>
			<td colsapn="2" class="td_title">
			회원가입 페이지
			</td>
		</tr>
		<tr>
			<td><lable for="id">아이디 : </lable></td>
			<td><input type="text" name="id" id="id" value="${param.id}" readonly/></td>
		</tr>
		<tr>
			<td><label for ="pass">비밀번호 : </label></td>
			<td><input type="text" name="pass" id="pass" value="${param.pass}"/></td>
		</tr>
		<tr>
			<td><label for="name">이름 : </label></td>
			<td><input type="text" name="name" id="name" value="${param.name}"/></td>
		</tr>
		<tr>
			<td><label for="age">나이 : </label></td>
			<td><input type="text" name="age" id="age" value="${param.age}"/></td>
		</tr>
		<tr>
			<td><label for="gender1">성별 : </label></td>
			<td><input type="radio" name="gender" value="남" checked id="gender1"/>남자
			<input type="radio" name="gender" value="여" id="gender2"/>여자</td>
		</tr>
		<tr>
			<td><label for="email">이메일 주소 : </label></td>
			<td><input type="text" name="email" id="email" value="${param.email}"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="javascript:updateform.submit()">수정</a>&nbsp;&nbsp;
				<a href="javascript:updateform.reset()">다시작성</a>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>