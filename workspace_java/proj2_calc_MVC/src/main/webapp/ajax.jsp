<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button id = "doGet">doGet</button><br>
<button id = "doPost">doPost</button><br>
<button id = "doPut">doPut</button><br>
<button id = "doDelete">doDelete</button><br>


<script>

 documentquerySelector("#doGet").addEventLisstener("click", function(){
	 
 })
 
 function ajax(method){
	 if(!method) method = "get";
	 //	 if(method != null && method != undefined && method !- 0){
	 let url = 'ajax';
	 if(method ==  'get'){
		 url += '?!id=idid';
	 }
	 
	 let xhr = new XMLHttpRequest();
	 
	 xhr.open(method, url);
	 
	 xhr.send();
	 
	 xhr.onload = function(){
		 console.log( xhr.responseText );
		 
		 documet.querSelector("#console").innerHTML = xhr.reponsseTest
		 }
	 }
 }

</script>
</body>
</html>