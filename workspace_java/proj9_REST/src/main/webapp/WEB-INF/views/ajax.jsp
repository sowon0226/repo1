<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

/*
 * // var const let 
	// let a = 1; let은 같은 변수로 사용 할 수 없으나
	// let a = 2;  // a=2;로 값은 변경할 수 있다 
	
	const b =2; 
	// b =3 ;  const는 변수의 값을 변경할 수 없다
	
	var 
	
 */


	// window.onload =function(){}
	window.addEventListener("load", function(){
		
		const btn = document.querySelector("#btn")
		btn.addEventListener("click",function(){
			
			console.log("click!!!!!")
			
			const xhr= new XMLHttpRequest();
			
            // 제 할당 없을 경우 변수를 한번만 선언
//    		const url = "ajax"; 
//			const url = "ajax/String"; 
//			const url = "ajax/dto"; 
//			const url = "ajax/list"; 
			const url = "human/test1"; 
			const data = {// 자바에서 보낼 때는 키에 ""를 사용해야함
					"ename" : "이름",
					sal : 3200,
			}
			
			xhr.open("post", url)
			xhr.setRequestHeader("Content-Type","application/json");
			
			const strData = JSON. stringify(data);
			console.log(data) // 객체 그 자체이면서 네트워크는 객체를 전달 할 수 없다
			console.log(''+data)  // 그래서 string으로 변형
			console.log(strData)
			
			xhr.send(strData)
			
			xhr.onload = function(){
				console.log( xhr.responseText )
				
				try {
					let result = JSON.parse(xhr.responseText )
					console.log(result.ename)
					console.log(result["ename"])
				}catch(e){
					console.log("json아님")
				}
			} 
		})
	})
	
</script>
</head>
<body>

<button id="btn">ajax 실행</button>

</body>
</html>