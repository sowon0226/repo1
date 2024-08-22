<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"%>
<%@ page import="emp2.dto.EmpDTO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="">
사원 번호 조회 :<input type="number" name="empno" value="null">
사원 이름 조회 :<input type="text" name="ename" >
<input type="submit" value="조회">
</form>
<table border=1>
	<tr>
		<th>rnum</th>
		<th>empno</th>
		<th>ename</th>
		<th>job</th>
		<th>hireDate</th>
	</tr>
	
	<c:forEach var="emp" items="${map.list}">
		<tr>
		    <th>${emp.rnum }</th>
			<th>${emp.empno }</th>
			<th>${emp.ename }</th>
			<th>${emp.job }</th>
			<th>${emp.hireDate }</th>
		</tr>
	</c:forEach>
</table>
<c:url var="insert" value="insert"></c:url>
<!--<a href="insert">추가하기</a><br>  -->
<%
	Map map = (Map)request.getAttribute("map");
	int totalCount = (int)map.get("totalCount");
	String str_countPerPage = (String)request.getAttribute("countPerPage");
	int countPerPage = Integer.parseInt(str_countPerPage);
	
	String str_pageNo = (String)request.getAttribute("page");
	int pageNo = Integer.parseInt(str_pageNo);
	
	int lastPage = (int)Math.ceil( (double) totalCount / countPerPage );
%>
<c:set var="lastPage2" value="<%= lastPage %>" scope="page" />

<a href="page?page=${page - 1}">이전</a>

<c:forEach var="i" begin="1" end="${lastPage2}">

[<a href="page?page=${i}">${i}</a>] 

</c:forEach>

<a href="page?page=${page + 1}">다음</a>

<hr>
</body>
</html>