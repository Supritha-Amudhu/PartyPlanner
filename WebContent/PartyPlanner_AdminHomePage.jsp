<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
<style>
.heading
{
	text-decoration: blink;
	text-shadow: graytext;
	font-family: Constantia;
	font-style: normal;
	font-weight: bold;	
}
</style>
</head>
<body bgcolor="Black" text="White">
<p align="right">
<a href="PartyPlanner_Login.jsp">Log Out</a>
</p>
<center>
<p class = "heading"> ADMIN HOME PAGE </p><br><br>
<img src="E:\Supritha\Dream, Determined\Servlet My Examples\Party Planner\lobby.jpg" height="200px" width="800px">
<br><br><br><br><br><br>
Welcome,
<%
out.println(request.getSession().getAttribute("sessionLoginName"));
%>
<br><br>
<form action="RegisteredUsersPopulateServlet" method="post">
<input type="submit" name="NamePartyRegister" value="Create a plan!">
</form><br><br>
<form action="AdminPartyListDisplayServlet" method="post">
<input type="submit" name="NameListParties" value="View all party plans">
</form>
</center>
</body>
</html>