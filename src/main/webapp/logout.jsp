<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   HttpSession currentSession = request.getSession(false);
   if(currentSession != null){
	   currentSession.invalidate();
   }
   //Redirect to the login Page
   response.sendRedirect("login.jsp");
  
%>
</body>
</html>
