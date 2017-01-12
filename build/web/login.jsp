<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%@include file="initialize.jsp" %>    
<%@include file="header.jsp" %>
    
<html>
    
    <head>
        <title>Login Portal</title>
        <meta charset="utf-8">
        <link href="stylesheets/login.css" type="text/css" rel="stylesheet" />
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>    
        <script type="text/javascript">function alertbox(){
            alert("login successful");
           }
        function alertb(){
            alert("successfully loged out!");
        }
    </script>
                </head>
    
    <body background="images/2.jpg">
           
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        <BR>
        
        <%
        try
        {
        if(session.getAttribute("username")==null)
        {
            
        %> 
    <center>
        <form action="<%=request.getRequestURI()%>" method="POST" class="smart-green">
            <center>
                <h1> </h1>
                <h1>
                    
                    <p style="position:absolute;top:280px;left:600px;width:165px;height:62px">Enter Details</p>
                </h1>
            </center>
            <br>
            <label>
                <span>Username :</span>
                <input id="name" type="text" name="username" placeholder="Your USER ID" />
            </label>
            <br>
            <label>
                <span>Password :</span>
                <input id="pass" type="password" name="password" placeholder="Your PASSWORD"/>
            </label>
            <br>
            <label>
                <span>User Type :</span>
                <select name="selection">
                    <option value="USER">user</option>
                    <option value="ADMINISTRATOR">admin</option>
                </select>
            </label>  
            <br><br>  
            <label>
                <span>&nbsp;</span> 
                <div class="btn">
                <center>
                    <input type="submit" value="Login" onClick="alertbox()" type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal"/>
                </center>
                </div> 
            </label>    
        </form>
        </center>
        <%
        username=request.getParameter("username");
        password=request.getParameter("password");
        type=request.getParameter("type");
        stmt=conn.prepareStatement("select * from users where username=? and password=?");
        stmt.setString(1, username);
        stmt.setString(2, password);
        rs=stmt.executeQuery();
        if(rs.next())   
        {
            if(rs.getString(3).equals("user"))
            {
                session.setAttribute("username", username);
                response.sendRedirect("./home.jsp");     
            }
            else if(rs.getString(3).equals("admin"))
            {
                session.setAttribute("username", password);
                session.setAttribute("type", "admin");
                response.sendRedirect("./home.jsp");     
            }
        }
        %>
        
        
        <%
        }
        else
        //logout
        {
        %>
        <div>
            <center> <h1>Hello <%= (String)session.getAttribute("username")%>!</h1></center>
            <br>
            <center> <h2>Confirm Logout!</h2></center>
            <br><br>
            <center> <form action="logout.jsp">
                 <input type="submit" value="Log out!" onClick="alertb()" type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal"/>

                </form></center>
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
    
        
        
        
        
        <%@include file="footer.jsp" %>
    </body>
</html>
        
        