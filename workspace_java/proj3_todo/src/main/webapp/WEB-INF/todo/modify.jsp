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
<h2>수정페이지</h2>
<form method="post" action="modify">
	<input type="hidden" name="tno" value="${dto.tno }">
	타이틀 : <input type="text" name="title" value="${dto.title}"><br>
	날짜 : <input type="date" name="dueDate" value="${dto.dueDate}"><br>
	완료여부 - 
		완료 : <input type="radio" name="finished" value="Y" checked="checked">
		미완료 : <input type="radio" name="finished" value="N"><br>
	<input type="submit" value="수정하기"> 
</form>
</body>
</html>