<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="initialize.jsp" %>
<%@include file="header.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="stylesheets/search.css" type="text/css" >
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script type="text/JavaScript">
            function alertp(){
                alert("redirecting to profile");
            }
        </script>
        <title>Search</title>
    </head>
    <body background="images/2.jpg">
        <%
        try
        {
        if(session.getAttribute("username")!=null)
        {
        %>
        <div>
            <br>
            
            <form method="get" action="<%=request.getRequestURI()%>" class="smart-green">
                <center>
                
                <center>
                <h1> </h1>
                <h1>
                    
                    <p style="position:absolute;top:280px;left:600px;width:165px;height:62px">Search Here</p>
                </h1>
                </center>
                    <br>
                    <br>
                    
                <input type="text" name="search" value="" />
                <br>
                <br>
                <br>
                
                <div class="btn">
                    <b>
                    <input type="submit" value="Find" type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal"/>
                </b>
                </div>
                </center>
                
                
            </form>  
                <br>
                <br>
                
                <form method="post" action="interaccount.jsp">
                <center>
                    <table class="fixed_headers" border="3">
                    
                                            
                        <%
                        search=request.getParameter("search");
                        stmt1=conn.prepareStatement("select * from faculty_info");
                        rs1=stmt1.executeQuery();
                        if(search!=null)
                        {
                        %>
                        
                        <tr>
                            <th>Select</th> 
                            <th>ID</th> <th>Name</th> <th>Branch</th> <th>Designation</th> 
                        </tr>
                        <%
                        while(rs1.next())
                        {
                            if(rs1.getString(2).contains(search))
                            {
                        %>
                            <tr>
                                <td>
                                    <input type="radio" name="input" value="<%= rs1.getString(1)%>"/>
                                </td> 
                                <td><%= rs1.getString(1)%></td> <td><%= rs1.getString(2)%></td> <td><%= rs1.getString(3)%></td> <td><%= rs1.getString(4)%></td> 
                            </tr>    
                        <%
                            }
                            }
                        %>
                    </table>
                    <br>
                <div class="btn">
                <center>
                    <input type="submit" value="Go to Profile" onClick="alertp()" type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal"/>
                </center>
                </div>
                </center>
                        <% } %>
                    
            </form>
        </div>
        <%
        }
        else
        {
            response.sendRedirect("./login.jsp");
        }
        }
        catch(Exception e)
        {
        }
        %>
        
        </body>
</html>
<br>
<br>

<%@include file="footer.jsp" %>
