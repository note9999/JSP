<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	
 	<h1>기본 로케일</h1>
 	<fmt:setLocale value="ko"/>
 	<fmt:bundle basename="bundle.sampleBundle">
 		<fmt:message key="id"/> <br>
 		<fmt:message key="pw"/> <br>
 		<fmt:message key="name"/> <br>
 		<fmt:message key="email"/> <br>
 	</fmt:bundle>
 	 	
 	<h1>영문 로케일</h1>
 	<fmt:setLocale value="en"/>
	<fmt:bundle basename="bundle.sampleBundle">
 		<fmt:message key="id"/> <br>
 		<fmt:message key="pw"/> <br>
 		<fmt:message key="name"/> <br>
 		<fmt:message key="email"/> <br>
 	</fmt:bundle>
		  
	  

	
	
</body>
</html>