<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="id" value="${sessionScope.id }"/>
<c:if test="${id eq null }">
	<c:redirect url="loginForm.jsp"> </c:redirect>
</c:if>

<!DOCTYPE html>
로그인한 아이디 ${id }
<html>
<head>
<link rel="stylesheet" href="css/form_style.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${id }로 로그인 하셨습니다.</h3>
	<a href="LogoutServlet">로그아웃</a>
	<c:if test="${id eq 'admin' }">
		<a href="memberListServlet">관리자 모드 접속(회원 목록 보기)</a>
	</c:if>
</body>
</html>