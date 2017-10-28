<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
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
<script>
function validate()
{
var password=document.getElementById("IDPassword").value;
var pwdtext=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}$/;
if(password.length<6)
	{
		alert("Please enter a password greater than 6 letters");
		
	}
if(!password.value.match(pwdtext))
	{
		alert("Password should contain atleast one lower case, one upper case and one number");
		return false;
	}	
else
	{
		return true;
	} 
}

</script>
</head>
<body bgcolor="Black" text="White">
<center>
<p class = "heading">USER REGISTRATION </p><br><br>
<img src="E:\Supritha\Dream, Determined\Servlet My Examples\Party Planner\lobby.jpg" height="200px" width="800px">
</center>
<br><br><br><br><br><br>
<form action="UserRegistrationServlet" method="post" name="form1" onsubmit="return validate()">
<table align="center" cellpadding="10" cellspacing="10">
<tr>
<td>Name</td>
<td><input type="text" id="IDName1" name="NameUser"></td>
<td>Date of Birth</td>
<td><input type="text"id="IDDob" name="NameDob"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" id="IDPassword" name="NamePassword"></td>
<td>Address</td>
<td><input type="text" id="IDPassword" name="NameAddress"></td>
</tr>
<tr>
<td>Confirm Password</td>
<td><input type="password" id="IDConfirmPassword" name="NameConfirmPassword"></td>
<td>Phone Number</td>
<td><input type="text" id="IDPhoneNumber" name="NamePhoneNumber"></td>
</tr>
<tr>
<td>Gender</td>
<td><input type="radio" id="IDGender" value="ValueMale" name="NameGender">Male<br>
<input type="radio" id="IDGender" value="ValueFemale" name="NameGender">Female</td>
<td>Email ID</td>
<td><input type="text" id="IDEmail" name="NameEmail"></td>
</tr>
</table>
<br>
<center>
<input type="submit" value="Register" name="submitRegister">
</center>
</form>
</body>
</html>