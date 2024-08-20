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
	<h1>List Page</h1>
	<a href="register">새 할일하기</a>
	<c:forEach var="todoDTO" items="${list1}">
        <div>
            <c:url var="url1" value="/todo/read">
            <c:param name="tno" value="${ todoDTO.tno }" />
            </c:url>
            <a href="${ url1 }">상세보기</a>
             순번 : ${todoDTO.tno }, 제목 : ${ todoDTO.title}, 시간 : ${ todoDTO.dueDate }
        </div>
    </c:forEach>



	<%--     ${ list1 } --%>
	<!--     <hr> -->
	<%--     ${ list1[0] } --%>
	<!--     <hr> -->
	<%--     ${ list1[0].title } --%>
	<!--     <hr> -->
	<%--     ${ list1[0].[title] } --%>
	<!--     <hr> -->
	<%--     123${ null }456; --%>
	
	
	<c:forEach var="i" begin="0" end="3">
    i : ${i }<br>
	</c:forEach>
	<hr>
	step
	<br>
	<c:forEach var="i" begin="0" end="10" step="3">
    i : ${i }<br>
	</c:forEach>
</body>
</html>