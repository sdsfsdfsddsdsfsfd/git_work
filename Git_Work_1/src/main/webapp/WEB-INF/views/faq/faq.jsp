<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
	</head>
		<body>
		<input type="button"  value="home" onclick="location.href='main.do'"><!-- home 이동 --><br>
			<!-- faq 페이지 -->
			<c:forEach var="vo" items="${ list }">
				<div>${ vo.question }</div>
				<div>${ vo.answer }</div>
			</c:forEach>
		</body>
</html>