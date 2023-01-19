<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
	int sum=0;
	int num1= Integer.parseInt(request.getParameter("num1"));
	int num2= Integer.parseInt(request.getParameter("num2"));
	
	if(num1 < num2) {
        for(int i = num1; i <= num2; i++) {
           sum += i;
        }
     
	} else if(num1 >= num2) {
        for(int i = num2; i <= num1; i++) {
           sum += i;
        }
     }
	--%>
	
	<%
      
      int num1 = Integer.parseInt(request.getParameter("num1"));
      int num2 = Integer.parseInt(request.getParameter("num2"));
      
      int sum = 0;
      int max = Math.max(num1, num2);
      int min = Math.min(num1, num2);
      for(int i = min; i <=max; i++) {
         sum += i;
      }
   
   %>
	
	<h1>두수의 합: <%=sum%></h1>
	<a href="숫자두개입력.jsp">뒤로가기</a>

</body>
</html>