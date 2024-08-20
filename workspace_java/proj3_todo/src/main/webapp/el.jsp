<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	\${ 10 + 1 } : ${ 10 + 1 }<br>
	\${ "10" + 1 } : ${ "10" + 1 } : el은 계산할때 문자를 숫자로 바꿔서 계산한다
	<br>
<%-- 	\${ "a" + 1 } : ${ "a" + 1 }<br> --%>
<%-- 	\${ "a" + "b" } : ${ "a" + "b" }<br> --%>
	\${ "a" += 1 } : ${ "a" += 1 }<br> 문자 뒤에 1이 붙음 
	\${ null + 1 } : ${ null + 1 }<br> null을 더하면 숫자 1만 나옴
	
	\${ 10 / 3 } : ${ 10 / 3 }<br> 3으로 나누면 소수점으로 나오다가 마지막에 올림
	\${ 10 div 3 } : ${ 10 div 3 }<br> div로 나눠도 소수점 나머지가 나옴
	
	\${ 10 % 3 } : ${ 10 % 3 }<br> 나머지 1만 나옴
	\${ 10 mod 3 } : ${ 10 mod 3 }<br> 나머지 1 만 나옴
	<hr>
	\${ 10 == 10 } : ${ 10 == 10 }<br> ture
	\${ "10" == "10" } : ${ "10" == "10" }<br> ture
	\${ "10" eq "10" } : ${ "10" eq "10" }<br> ture

	\${ 10 != 10 } : ${ 10 != 10 }<br> false
	\${ 10 ne 10 } : ${ 10 ne 10 }<br> false
	
	\${ 100 > 10 } : ${ 100 > 10 }<br> true
	\${ 100 gt 10 } : ${ 100 gt 10 }<br> ture
	\${ "bc" gt "ba" } : ${ "bc" gt "ba" }<br> ture
	
	\${ 100 < 10 } : ${ 100 < 10 }<br> false
	\${ 100 lt 10 } : ${ 100 lt 10 }<br> false
	
	\${ 100 >= 10 } : ${ 100 >= 10 }<br> ture
	\${ 100 ge 10 } : ${ 100 ge 10 }<br> ture

	\${ 100 <= 10 } : ${ 100 <= 10 }<br> false
	\${ 100 le 10 } : ${ 100 le 10 }<br> false
	
	\${ (100 gt 10) eq "true"  } : ${ (100 gt 10) eq "true"  } true
<hr>
	\${ (100 gt 10) && (100 gt 10) } : ${ (100 gt 10) && (100 gt 10) }<br> ture
	\${ (100 gt 10) and (100 gt 10) } : ${ (100 gt 10) and (100 gt 10) }<br> ture
	 
	\${ (100 gt 10) || (100 gt 10) } : ${ (100 gt 10) || (100 gt 10) }<br> ture
	\${ (100 gt 10) or (100 gt 10) } : ${ (100 gt 10) or (100 gt 10) }<br> ture
	
	\${ !(100 gt 10) } : ${ !(100 gt 10) }<br> false
	\${ not(100 gt 10) } : ${ not(100 gt 10) }<br> false
<hr>
	출력할 꺼리가 <strong>있으면</strong> empty는 false<br> strong으로 감싸주면 감싸준 글씨가 굵게 나옴
	출력할 꺼리가 <strong>없으면</strong> empty는 true<br>
	\${ empty "글씨" } : ${ empty "글씨" }<br> 변수안에 출력할 것이 있으면 false가 나옴
	\${ empty null } : ${ empty null }<br> 변수 안에 null이 들어오면 ture
	\${ empty "" } : ${ empty "" }<br> 변수 안에 ""가 들어와도 null
<hr>
	\$ { param.a} : ${ param.a  }<br>
	\$ { paramValuse.a} : ${ paramValues.a}<br>
	\$ { paramValuse.a[0]} : ${ paramValues.a[0] }<br>
	\$ { paramValuse.a[1]} : ${ paramValues.a[1] }<br>
	\$ { paramValuse.a[100]} : ${ paramValues.a[100] }<br>
	 string 배열로 돌려주는 것 
	
</body>
</html>