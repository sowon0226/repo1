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
		<th>empno</th>
		<th>ename</th>
		<th>job</th>
		<th>hireDate</th>
	</tr>
	
	<c:forEach var="emp" items="${list }">
		<tr>
			<th>${emp.empno }</th>
			<th>${emp.ename }</th>
			<th>${emp.job }</th>
			<th>${emp.hireDate }</th>
		</tr>
	</c:forEach>
</table>
<hr>
<c:url var="insert" value="insert"></c:url>
<a href="insert">추가하기</a><br>
<table border=1>
	<tr>
		<th>empno</th>
		<th>ename</th>
		<th>job</th>
		<th>hireDate</th>
	</tr>
	
	<%
	
 	List<EmpDTO> list = (List)request.getAttribute("list");
// 	for(int a=0; a<list.size(); a++){
// 		EmpDTO dto = (EmpDTO)list.get(a);
		
// 		int empno = dto.getEmpno();
// 		out.print(empno + " , ");
// 	}
	// 향상된 for문
	for( EmpDTO dto : list){
		int empno = dto.getEmpno();
 		out.print(empno + " , ");
	}
	%>
</table>
</body>
</html>