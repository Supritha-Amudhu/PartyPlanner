<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Party Registration</title>
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
<center>
<p class = "heading"> PARTY REGISTRATION </p><br><br>
<img src="E:\Supritha\Dream, Determined\Servlet My Examples\Party Planner\lobby.jpg" height="200px" width="800px">
</center>
<br><br><br><br><br><br>
<form action="PartyRegistrationServlet" method="post">
<table align="center" cellpadding="10" cellspacing="10">
<tr>
<td>Party Name</td>
<td><input type="text" id="IDPartyName" name="NamePartyName"></td>
<td>Venue</td>
<td><input type="text" id="IDVenue" name="NameVenue"></td>
</tr>
<tr>
<td>Type of Music</td>
<td><input type="Text" id="IDMusic" name="NameMusic"></td>
<td>Date</td>
<td><input type="text" id="IDDate" name="NameDate"></td>
</tr>
<tr>
<td>Type of Food</td>
<td><input type="Text" id="IDFood" name="NameFood"></td>
<td>Time</td>
<td><input type="text" id="IDTime" name="NameTime"></td>
</tr>
<tr>
<td>Add People</td>
<td>
<%@ page
import="java.util.*"
%>
<%
ArrayList users = (ArrayList) request.getSession().getAttribute("userList");
Iterator itr = users.iterator();
while(itr.hasNext())
{
for(int i=0;i<users.size();i++)
{
	String names = (String) itr.next();
	out.println("<input type=\"checkbox\" name=\"user\" value=" +names+">" +names +"\n");
}
}
%>
</td>
<td></td>
<td></td>
</table>
<center>
<input type="submit" value="Register the Party!" name="submitRegisterParty">
</center>
</form>
</body>
</html>