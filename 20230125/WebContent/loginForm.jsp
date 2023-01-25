<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("id")!=null){
		response.sendRedirect("loginSucess.jsp");
	}
%>

 <form method="post" action="checkLogin.jsp">
 	아이디 : <input type="text" name="id"> <br>
 	비밀번호 : <input type="password" name="pw"> <br>
 	<input type ="submit" value="로그인">
 </form>
 <br>
 <a href="loginSuccess.jsp">메일</a>

</body>
</html>