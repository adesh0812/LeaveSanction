<%@page import="java.time.ZoneId"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="initialize.jsp" %>
<%@include file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Account</title>
        <link href="stylesheets/login.css" type="text/css" rel="stylesheet" />
        <link href="stylesheets/account.css" type="text/css" rel="stylesheet" />
        <script type="text/JavaScript"> function grant(){
            alert("Are you sure!");
        }</script>
    </head>
    <body background="images/2.jpg">
    <%
    try
    {
    if(session.getAttribute("username")!=null)
    {
        username=(String)session.getAttribute("username");
        if(session.getAttribute("id")==null)
            response.sendRedirect("./search.jsp");
        id=(Integer)session.getAttribute("id");
        stmt8=conn.prepareStatement("SELECT name FROM faculty_info where id=?");
        stmt8.setInt(1, id);
        rs8=stmt8.executeQuery();
        while(rs8.next())
            name=rs8.getString(1);
    %>
    <br><br><br><br><br>
            
        
                <center>
                <h1> </h1>
                <h1>
                    <b><p style="position:absolute;top:260px;left:400px;width:600px;height:62px"><%= name%></p></b>
                </h1>
                
                <br>
                
                </center>
                <center>
                <h1>
                    <p style="position:absolute;top:340px;left:320px;width:365px;height:62px">Leaves till Date :</p>
                </h1>
                </center>
    
       <div>
            <center>
            <table class="fixed_headers" border="3">
            <tr>
                <th>Start Date</th> <th>End Date</th> <th>Reason</th>
            </tr>
            <%
            stmt2=conn.prepareStatement("select * from leave_record where id=? order by leaveno desc");
            stmt2.setInt(1, id);
            rs3=stmt2.executeQuery();
            while(rs3.next())
            {
            %>
                <tr>
                    <td><%= rs3.getString(3)%></td> <td><%= rs3.getString(4)%></td> <td><%= rs3.getString(5)%></td>
                </tr>
            <%
            }
            %>          
            </table>
        </center>
       </div> 
    
   
            
        
        
        
    <center>     
        <div class="container">
            <div class="btn"> 
                <p style="position:absolute;top:810px;left:420px;width:345px;height:62px">
                <button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal">Check Eligibility</button>
                </p>
            </div>
            <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog modal-sm">
                    <div class="modal-content">
                        <div class="modal-header">
                            <%
                            stmt4=conn.prepareStatement("select * from leave_record where id=? and leaveno= "
                                + "(select max(leaveno) from leave_record where id=?)");
                            stmt4.setInt(1, id);
                            stmt4.setInt(2, id);
                            rs4=stmt4.executeQuery();
                            while(rs4.next())
                            {
                                leaveno=rs4.getInt(2);
                                date=rs4.getString(3);
                                month=Integer.parseInt(date.substring(5,7));
                                currentMonth = localDate.getMonthValue();
                            }
                            session.setAttribute("leaveno", leaveno);
                            %>
                            <% 
                            if(month==currentMonth && month!=0)
                            {
                            %>
                                <h4 class="modal-title">Not Eligible</h4>
                                
                            <%
                            }
                            else
                            {
                            %>
                                <h4 class="modal-title">Eligible</h4>
                            <%
                            }
                            %>
                        </div>
                          
                        <div class="modal-footer">
                            <center>    <button type="button" class="btn btn-default" data-dismiss="modal">Get Back</button>  </center>   
                        </div>
                               
                    </div>      
                </div>
            </div>
        </div>
    </center>     
    
   
                        
                        <h1>
                           
                            <b><p style="position:absolute;top:340px;left:950px;width:265px;height:62px"><%=leaveno%></p></b>
                        </h1>    
                        
                                               
                        
                        
                        
                        
                        
                        <h1>
                           
                            <p style="position:absolute;top:750px;left:570px;width:345px;height:62px">Grant Leave</p>
                        </h1>    
                        <center>
        <div>
           
            <form action="grant.jsp" method="post">
                <div class="btn">
                
                    <p style="position:absolute;top:810px;left:590px;width:345px;height:62px">
                        <input type="submit" value="Grant Leave" onClick="grant()" type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal"/></p>
                
                </div>
            </form> 
        </div>
                        </center>
        
        
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
    </body>
</html>
<%@include file="footer.jsp" %>

