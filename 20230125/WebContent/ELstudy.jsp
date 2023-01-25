<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>
	\${5+2}=${5+2}<br>
	\${5/2}=${5/2}<br>
	\${5 div 2 }=${5 div 2}<br> <!-- 나누기 -->
	\${5%2 }=${5%2}<br>
	${5 mod 2 }<br> <!-- 나머지 구하기 -->
	${5>2}<br>
	${(5>2) ? "참" : "거짓" } <br>  <!-- 삼항 연산-->
	${(5>2) || (10>20) } <br> 
	</h1>

 </body>
</html>