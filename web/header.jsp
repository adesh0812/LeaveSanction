<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <link href="stylesheets/home.css" type="text/css" rel="stylesheet" />  
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
    <font color="white"><marquee direction="left" style="background:rgb(108,0,0)">
    <H1 STYLE ="FONT-SIZE:15PX"><B>SHRI RAM MURTI SMARAK COLLEGE OF ENGINEERING AND TECHNOLOGY</H1>
</B></marquee>
</font>
<BR><BR>
<img style="position:absolute;top:54px;left:0px;height:90px;width:600px;" src="images/logo.png">
<p style="position:absolute;top:85px;left:1020px;width:356px;height:34px">
<u><b><u>PROMOTING EDUCATION AND HEALTHCARE</b></u></p>
<br>
<br>
<br>
<hr style="top:10%;width:100%;color:black;"/>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
        <a class="navbar-brand" href="home.jsp">Home</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        
          
          <li><a href="search.jsp">Search</a></li>
        <li><a href="account.jsp">Account</a></li>
        <li><a href="grant.jsp">Grant</a></li>
        
      </ul>
      <ul class="nav navbar-nav navbar-right">
          <%
          if(session.getAttribute("username")!=null)
            out.println("<li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Log Out </a></li> ");
          else
            out.println("<li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Log In </a></li> ");
          %>
      </ul>
    </div>
  </div>
</nav>

</body>
</html>
