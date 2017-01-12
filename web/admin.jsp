<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%@include file="initialize.jsp" %>
<%@include file="headeradmin.jsp" %>
<html>
    <head>
        <title>Admin Page!</title>
        <link href="stylesheets/login.css" type="text/css" rel="stylesheet" />
    </head>
    <body background="images/2.jpg">
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
            <h1>Add Faculty</h1>
            <form action="#" method="POST">
                Name : <input type="text" name="name_f" value="" /><br>
                Branch : <input type="text" name="branch_f" value="" /><br>
                Designation : <input type="text" name="designation_f" value="" /><br>
                <input type="submit" value="Add Faculty!" />                
            </form>
            <%
            //SELECT max(id) from faculty_info;
            stmt6=conn.prepareStatement("SELECT max(id) from faculty_info");
            rs6=stmt6.executeQuery();
            rs6.next();
            id_f=rs6.getInt(1)+1;
            name_f=request.getParameter("name_f");
            branch_f=request.getParameter("branch_f");
            designation_f=request.getParameter("designation_f");
            stmt7=conn.prepareStatement("insert into faculty_info values (?,?,?,?)");
            stmt7.setInt(1, id_f);
            stmt7.setString(2, name_f);
            stmt7.setString(3, branch_f);
            stmt7.setString(4, designation_f);
            stmt7.executeUpdate();
            
            %>
        </div>
        
            
        <div>
            <h1>Add Users!</h1>
            <form method="post" action="<%= request.getRequestURI()%>">
                Name : <input type="text" name="name_a" value="" /><br>
                Designation : <input type="text" name="designation_a" value="" /><br>
                User Type : <select name="type_a">
                                <option>user</option>
                                <option>admin</option>
                            </select><br>
                Username : <input type="text" name="username_a" value="" /><br>
                Password : <input type="password" name="password_a" value="" /><br>
                Confirm Password :<input type="text" name="confirm_password_a" value="" /><br>
                <input type="submit" value="Add Users!" />
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
    