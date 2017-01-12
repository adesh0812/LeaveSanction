<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="initialize.jsp" %>
<%@include file="headeradmin.jsp" %>
<!DOCTYPE html>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Faculty</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="stylesheets/addfaculty.css" type="text/css" rel="stylesheet" />  
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
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
            <form action="<%=request.getRequestURI()%>" method="post">
                <div id="first">
                <img id="logo" src="images/logo.png"><br>
                <center><label>Full Name :</label></center>
                    <input id="fname" placeholder="Full Name" name="name_f" type="text">
                    <center><label>Branch :</label></center>
                    <input id="branch" placeholder="Branch" name="branch_f" type="text">
                    <center><label>Designation :</label></center>
                    <input id="desg" placeholder="Designation" name="designation_f" type="text">
                    <br><br>
                    <center><center>
                    <input type="submit" value="Add Faculty" type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal"/>
                </center>
                
                </center>
            </form>
                </div>
        </div>
            
            
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
 
    <%
    }
    else
    {
        response.sendRedirect("./login.jsp");
    }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    %>   
    <br>
    <br>
        
        
    <%@include file="footer.jsp" %>
    </body>
</html>
