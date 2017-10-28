<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>CodeAve.com (JavaScript: Slide-Show)</title>
<body bgcolor="#FFFFFF">

<SCRIPT LANGUAGE="JavaScript">
<!-- // Begin Header portion of the script
// CodeAve.com JavaScript SlideShow
// Created from the JavaScript SlideShow ScriptWriter on 10-02-2000
// http://www.codeave.com

var pictures = new Array
// List all the pictures in the slideshow here
(
 "E:\Supritha\Harry Potter and Friends\Sequence\1.jpg" 
,"E:\Supritha\Harry Potter and Friends\Sequence\2.jgp" 
,"E:\Supritha\Harry Potter and Friends\Sequence\3.jpg" 
,"E:\Supritha\Harry Potter and Friends\Sequence\4.jpg" 
,"E:\Supritha\Harry Potter and Friends\Sequence\5.jpg" 
,"E:\Supritha\Harry Potter and Friends\Sequence\6.jpg" 
,"E:\Supritha\Harry Potter and Friends\Sequence\7.jpg" 
,"E:\Supritha\Harry Potter and Friends\Sequence\8.jpg" 
,"E:\Supritha\Harry Potter and Friends\Sequence\9.jpg" 
);
var picture_num = 0;
var current_picture = new Image();
current_picture.src = pictures[picture_num];
function start_show() 
{
// Time is in seconds X 1000
setInterval("slideshow()", 3000);
}
function slideshow() 
{
picture_num++;
if (picture_num == pictures.length) 
{
picture_num = 0;
}
current_picture.src = pictures[picture_num];
document["rotating_picture"].src = current_picture.src;
}
// End of header portion of script -->
</script>
</head>

<body OnLoad="start_show()">

<center>
<img name="rotating_picture" src="E:\Supritha\Harry Potter and Friends\Sequence\1.jpg" width="100" height="100">
</center>
</body>
</html>
