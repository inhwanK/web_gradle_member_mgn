<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/form_style.css">
</head>

<body>
<table>
	<tr>
		<td>id</td><td>이름</td>
	</tr>
	<c:forEach var="member" items="${result}">
	<tr>
		<td>${member.id }</td>
		<td>${member.name }</td>
		<td><a href="admin/updateForm.jsp?id=${member.id}
		&pass=${member.passwd}
		&name=${member.name}
		&age=${member.age}
		&gender=${member.gender}
		&email=${member.email}">수정</a>
		<a href="MemberDelServlet?id=${member.id}">삭제</a></td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="3">
			<a href="joinForm.jsp">회원 추가</a>
		</td>
	</tr>
	</table>
</body>
</html>