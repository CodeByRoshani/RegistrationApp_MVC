<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String name = (String) session.getAttribute("name");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Successful</title>

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
    background:linear-gradient(135deg,#00c6ff,#0072ff);
}

.container{
    background:#fff;
    width:420px;
    padding:40px;
    border-radius:20px;
    text-align:center;
    box-shadow:0 15px 35px rgba(0,0,0,0.25);
}

.icon{
    width:90px;
    height:90px;
    background:#28a745;
    color:white;
    font-size:50px;
    border-radius:50%;
    margin:auto;
    display:flex;
    justify-content:center;
    align-items:center;
}

h1{
    margin-top:20px;
    color:#28a745;
}

p{
    margin-top:15px;
    color:#555;
    font-size:17px;
}

.username{
    color:#0072ff;
    font-weight:bold;
}

.btn{
    display:inline-block;
    margin-top:30px;
    padding:12px 28px;
    background:#0072ff;
    color:white;
    text-decoration:none;
    border-radius:8px;
    transition:.3s;
    font-weight:bold;
}

.btn:hover{
    background:#0056cc;
}
</style>

</head>

<body>

<div class="container">

<div class="icon">
✓
</div>

<h1>Registration Successful</h1>

<p>
Congratulations
<span class="username"><%= name %></span> 🎉
</p>

<p>
Your account has been created successfully.
You can continue using the application.
</p>

<a href="NewFile.html" class="btn">
Go to Home
</a>

</div>

</body>
</html>