<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="initialize.jsp" %>
<%@include file="headeradmin.jsp" %>
<!DOCTYPE html>
<!DOCTYPE HTML>
<head>
<title>LOGIN PAGE</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link href="stylesheets/adduser.css" type="text/css" rel="stylesheet" /> 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<%
    try
    {
    if(session!=null)
    {
    username=(String)session.getAttribute("username");
    stmt=conn.prepareStatement("select * from users where username=?");
    stmt.setString(1, username);
    rs=stmt.executeQuery();
    rs.next();
    name=rs.getString(4);
    designation=rs.getString(5);
    session.setAttribute("name", name);
    %>    
        <div>
<form method="post" action="<%= request.getRequestURI()%>">
    <div id="first">
        <img id="logo" src="images/logo.png"><br>
        <br>
        
        <center>
            <label>Full Name :</label>
        </center>
        <input id="fname" placeholder="Full Name" name="name_a" type="text">
        <center>
            <label>Designation :</label>
        </center>
        <input id="desg" placeholder="Designation" name="designation_a" type="text">
        <center>
            <label>User Type :</label>
        </center>
        <br>
        <div class="styled-select">
            <center>
                <select name="type_a">
                    <option value="Admin">admin</option>
                    <option value="user">user</option>
                </select>
            </center>
        </div>
        <br>
        <center>
            <label>User name :</label>
        </center>
        <input id="desg" placeholder="Username" name="username_a" type="text">
        <center>
            <label>Password :</label>
        </center>
        <input id="desg" placeholder="Password" name="password_a" type="password">
        <center>
            <label>Confirm Password :</label>
        </center>
        <input id="desg" placeholder="Confirm password" name="confirm_password_a" type="password">
        <br><br>
        <center>
      <center>
                    <input type="submit" value="Add User" type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal"/>
                </center>
                  </center>
    </div>
</form>
<%
            name_a=request.getParameter("name_a");
            designation_a=request.getParameter("designation_a");
            type_a=request.getParameter("type_a");
            username_a=request.getParameter("username_a");
            password_a=request.getParameter("password_a");
            confirmPassword_a=request.getParameter("confirm_password_a");
            stmt5=conn.prepareStatement("insert into users values (?,?,?,?,?)");
            stmt5.setString(1, username_a);
            stmt5.setString(2, password_a);
            stmt5.setString(3, type_a);
            stmt5.setString(4, name_a);
            stmt5.setString(5, designation_a);
            stmt5.executeUpdate();
            %>     
        </div>
    <%
    }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    %>   
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
        
        
    <%@include file="footer.jsp" %>
    </body>
</html>
