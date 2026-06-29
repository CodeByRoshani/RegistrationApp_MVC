<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String name = (String) session.getAttribute("name");
    if(name==null){
        name="User";
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Failed</title>

<style>

*{
margin:0;
padding:0;
box-sizing:border-box;
font-family:Arial, Helvetica, sans-serif;
}

body{
height:100vh;
display:flex;
justify-content:center;
align-items:center;
background:linear-gradient(135deg,#ff416c,#ff4b2b);
}

.container{

background:white;
width:430px;
padding:40px;
border-radius:18px;
text-align:center;
box-shadow:0 15px 35px rgba(0,0,0,.3);

}

.icon{

width:90px;
height:90px;
margin:auto;
border-radius:50%;
background:#dc3545;
color:white;
font-size:55px;
display:flex;
justify-content:center;
align-items:center;

}

h1{

margin-top:20px;
color:#dc3545;

}

p{

margin-top:15px;
font-size:17px;
color:#555;

}

.username{

font-weight:bold;
color:#ff416c;

}

.btn{

display:inline-block;
margin-top:30px;
padding:12px 28px;
text-decoration:none;
background:#dc3545;
color:white;
border-radius:8px;
font-weight:bold;
transition:.3s;

}

.btn:hover{

background:#b02a37;

}

</style>

</head>

<body>

<div class="container">

<div class="icon">
✖
</div>

<h1>Registration Failed</h1>

<p>

Sorry
<span class="username"><%=name %></span>

</p>

<p>

We couldn't complete your registration.

Please try again.

</p>

<a href="NewFile.html" class="btn">

Try Again

</a>

</div>

</body>
</html>