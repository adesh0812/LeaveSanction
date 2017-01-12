<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
if(session.getAttribute("type")!=null)
{
%>
<%@include file="headeradmin.jsp" %>
<%
}
else
{
%>
<%@include file="header.jsp" %>
<%
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <%@include file="homepage.jsp" %>
    </body>
</html>
<%@include file="footer.jsp" %>