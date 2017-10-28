<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="Black" text="White">
<center>
<img src="E:\Supritha\Dream, Determined\Servlet My Examples\Party Planner\lobby.jpg" height="200px" width="800px">
</center>
<br><br><br><br><br><br>
<center>
<form action="LoginServlet" method="post">
Login ID : <input type = "text" id="IDLogin" name="NameLogin" align="left"><br><br>
Password : <input type="password" id="IDPassword" name="NamePassword" align="left" min="6"><br><br>
<input type="submit" id="SubmitID" name="NameSubmit" value = "Login"><br><br>
</form>
<a href="PartyPlanner_UserRegistration.jsp">Not a member of this awesome committee? Be one!</a>
<br><br>
</center>
</body>
</html>