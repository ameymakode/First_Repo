<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container">
		<h1>Login</h1>
		<form action="LoginServlet" method="post">
			<label for="username">Username :</label> <input type="text"
				id="username" name="username" required> <br> <label
				for="password">Password :</label> <input type="password"
				id="password" name="password" required> <br>
			<button type="submit">Login</button>
		</form>
	</div>
	<p>
		<a href="index.html">Back To Home Page</a>
	</p>


	<!--Display Error Message if Login Fails  -->
	<%
	String error = request.getParameter("error");
	if (error != null && error.equals("1")) {
	%>
	<p style="color: red; font-weight: bold">Invalid Username Or
		Password. Please Try Again</p>
	<%
	}
	%>



	<!--Display Success Message if Register Successful  -->
	<%
	String rs = request.getParameter("registration");
	if (rs != null && rs.equals("success")) {
	%>
	<p style="color: green; font-weight: bold">Your Registration is
		Successful. Please Login</p>
	<%
	}
	%>
</body>
</html>


