<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	
	<form method="post" action="join.do" name="frm">
		이름: <input type="text" name="name"><br>
		아이디: <input type="text" name="id"> 
		<input type = "button" value="중복확인" onclick="idCheck()"><br>
		비밀번호: <input type="password" name="pw"><br>
		비밀번호 확인: <input type="password" name="pw_check"><br>
		이메일: <input type="text" name="email"> <br>
		전화번호: <input type="text" name="phone"> <br>
		회원등급: <input type="radio" name="admin" value="0">일반회원
		 <input type="radio" name="admin" value="1">관리자 <br>
		 <input type="submit" value="회원가입" onclick="">
	</form>

	<script src="script/member.js"></script>
</body>
</html>