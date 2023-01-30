<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="msg" value="hi jstl"/>
	${msg}<br>
	
	<c:set var="age">
	20
	</c:set>
	${age}<br> 
	
	<c:set var="test" value="<%= new com.study.javabeans.TestBean() %>"/>
	
	<c:set target="${test }" property="id" value="qwer"/>
	<c:set target="${test }" property="name" value="고길동"/>
	
	아이디: ${test.id}<br>
	이름: ${test.name}<br>
	
	<c:remove var="msg"/>
	삭제 후 msg : ${msg} <br>

</body>
</html>