<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home Page</title>
</head>
<body bgcolor="Black" text="White">
<p align="right">
<a href="PartyPlanner_Login.jsp">Log Out</a>
</p>
<center>
<img src="E:\Supritha\Dream, Determined\Servlet My Examples\Party Planner\lobby.jpg" height="200px" width="800px">
</center>
<br><br><br><br><br><br>
Welcome,
<%
out.println(request.getSession().getAttribute("sessionLoginName"));
%>
<br><br>
<center>
<table cellpadding="10" cellspacing="10">
<tr>
<th>Party Name</th>
<th>Music</th>
<th>Food</th>
<th>Venue</th>
<th>Date</th>
<th>Time</th>
</tr>
<%@ page
import = "java.util.*"
import = "com.atech.partyplannerdto.*"
 %>
<%	
	PartyDetails obj = new PartyDetails();
	ArrayList<PartyDetails> details = new ArrayList<PartyDetails>();
	details = (ArrayList) (request.getSession().getAttribute("partyDetails"));
	System.out.println(details);
	Iterator<PartyDetails> itr = details.iterator();
%>

<%
	while(itr.hasNext())
	{
		PartyDetails str = itr.next();
		out.println("<tr><td>"+str.getPartyName()+"</td>");
		out.println("<td>"+str.getMusic()+"</td>");
		out.println("<td>"+str.getFood()+"</td>");
		out.println("<td>"+str.getVenue()+"</td>");
		out.println("<td>"+str.getDate()+"</td>");
		out.println("<td>"+str.getTime()+"</td></tr>");
				
	}
%>
</table>
</center>
</body>
</html>