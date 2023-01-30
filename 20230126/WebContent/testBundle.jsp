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
 	<fmt:bundle basename="bundle.test">
 		<fmt:message key="name"/> <br>
 		<fmt:message key="title"/> <br>
 	</fmt:bundle>
 	 	
 	 	<h1>새로 추가한 내용</h1>
 	 <fmt:bundle basename="bundle.test" prefix="user_">
 	 	<fmt:message key="id"/> <br>
 	 	<fmt:message key="pw" var="pw"/>
 		${pw}
 	 </fmt:bundle>
 	 <h1>번들태그 밖</h1>
 	 <fmt:message key="id"/><br>
 	 ${pw} 
	
	
	<h1>setBundle</h1>
	  <fmt:setBundle basename="bundle.test" var="test"/>	  
	  
	  <fmt:message key="name" bundle="${test}"/><br>
	  <fmt:message key="title" bundle="${test}"/><br>
	
</body>
</html>