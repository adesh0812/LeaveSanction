<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="initialize.jsp" %>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Grant</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="stylesheets/grant.css" type="text/css" rel="stylesheet" /> 
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="stylesheets/login.css" type="text/css" rel="stylesheet" />
<script type="text/JavaScript">function grant1(){
    alert("The process has been recorded!");
}
</script>
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
        leaveno=(Integer)session.getAttribute("leaveno");
        leaveno++;
        Calendar c=Calendar.getInstance();
        String hour=String.valueOf(c.get(Calendar.HOUR_OF_DAY));
        String minute=String.valueOf(c.get(Calendar.MINUTE));
        String second=String.valueOf(c.get(Calendar.SECOND));
        dateStart=localDate.getYear()+"-"+localDate.getMonthValue()+"-"+localDate.getDayOfMonth()+" "
                +hour+":"+minute+":"+second;
        dateEnd=localDate.getYear()+"-"+localDate.getMonthValue()+"-"+localDate.getDayOfMonth()+" "
                +16+":"+40+":"+"00";    
%>
<br>

<div>
        <form action="" method="post">
<div id="first">
<img id="logo" src="images/logo.png"><br>
<br>
<center><label>Faculty Name : <%=id %></label></center>
<br>
<center><b><label>Leave No :<%=leaveno %></label></b></center>
<br>
<center><label>Start Date :</label></center>

<input id="fname" placeholder="Full Name" type="text" name="startDate" value="<%=dateStart%>">
<center><label>End Date :</label></center>
<input id="branch" placeholder="Branch" type="text" name="endDate" value="<%=dateEnd%>">
<center><label>Reason :</label></center>
<br>
<div class="area">
<textarea rows="5" cols="45" name="reason">
</textarea>
</div>
<br>
<center>
<div class="btn">
                    <b>
                    <input type="submit" value="Grant Leave" onClick="grant1()" type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal"/>
                </b>
                </div>
                </center>
</div>
</form>
</div>
<%
        dateStart=request.getParameter("startDate");
        dateEnd=request.getParameter("endDate");
        reason=request.getParameter("reason");
        stmt5=conn.prepareStatement("insert into leave_record values (?,?,?,?,?)");
        stmt5.setInt(1,id);
        stmt5.setInt(2,leaveno);
        stmt5.setString(3,dateStart);
        stmt5.setString(4,dateEnd);
        stmt5.setString(5,reason);
        stmt5.executeUpdate();        
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

</body>

</html>
<%@include file="footer.jsp" %>
