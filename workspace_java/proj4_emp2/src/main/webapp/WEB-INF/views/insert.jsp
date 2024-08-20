<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="insert">
 	사원 번호 :<input type="number" name="empno"><br>
	사원 이름 :<input type="text" name="ename"><br>
	사원 급여 :<input type="number" name="sal"><br>
	사원 부서 :<input type="number" name="deptno"><br>
	<input type="submit" value="추가하기">
	</form>	
</body>
</html>