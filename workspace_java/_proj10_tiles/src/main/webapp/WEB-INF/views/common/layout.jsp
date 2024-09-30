<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#side{
		display: inline-block;
		width:30%;
		border: 1px solid green;
	}
	
	#content{
		display: inline-block;
		width: 60%;
		border: 1px solid black;
	}

</style>
</head>
<body>



<!-- header -->
<div>
<%-- <%@ import %> --%>
<%-- <jsp:include page=""></jsp:include> --%>

	<tiles:insertAttribute name="header"/>
</div>

<div id="side">
<!-- size -->
	<tiles:insertAttribute name="side"/>
</div>

<div id="content">
<!-- content -->
	<tiles:insertAttribute name="content"/>
</div>

<div>
<!--footer -->

	<tiles:insertAttribute name="footer"/>
</div>
</body>






















	<tiles:insertAttribute name="footer"/>
</div>
</body>
</html>