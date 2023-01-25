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
	
	<h1>입력된 정보</h1>
	작성자: <jsp:getProperty name="member" property="name"/> <br>
	비밀번호: <jsp:getProperty name="member" property="pw"/> <br>
	이메일: <jsp:getProperty name="member" property="email"/> <br>
	제목: <jsp:getProperty name="member" property="title"/> <br>
	내용: <jsp:getProperty name="member" property="content"/> <br>
</body>
</html>