<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8");%>
<jsp:useBean id="member" class="com.study.javabeans.MemberBean"/>
<jsp:setProperty name="member" property="*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>정보 출력</h1>
	이름: <jsp:getProperty name="member" property="name"/> <br>
	아이디: <jsp:getProperty name="member" property="id"/> <br>
	닉네임: <jsp:getProperty name="member" property="nickName"/> <br>
	비밀번호: <jsp:getProperty name="member" property="pw"/> <br>
	이메일: <jsp:getProperty name="member" property="email"/> <br>
	전화번호: <jsp:getProperty name="member" property="phone"/> <br>
</body>
</html>