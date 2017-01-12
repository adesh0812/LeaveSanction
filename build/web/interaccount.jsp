<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="initialize.jsp" %>
<%
    id=Integer.parseInt(request.getParameter("input"));
    session.setAttribute("id", id);
    response.sendRedirect("./account.jsp");
%>