<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="member" class="com.study.javabeans.MemberBean"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 
	 그냥 출력 <br>
	 이름: <jsp:getProperty name="member" property="name"/> <br>
	 아이디: <jsp:getProperty name="member" property="id"/> <br>
	 
	 setProperty 작업 <br>
	 <jsp:setProperty  name="member" property="name" value="고길동"/>
	 <jsp:setProperty  name="member" property="id" value="go"/>


	 설정 후 출력 <br>
	 이름: <jsp:getProperty name="member" property="name"/> <br>
	 아이디: <jsp:getProperty name="member" property="id"/> <br>
	 	
</body>
</html>