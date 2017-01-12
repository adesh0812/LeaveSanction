<%@page import="java.time.ZoneId"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.sql.*,java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
    //Db
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/leave_sanct","root","adesh");
    PreparedStatement stmt=null,stmt1=null,stmt2=null,stmt3=null,stmt4=null,stmt5=null,stmt6=null,stmt7=null,stmt8=null;
    ResultSet rs=null,rs1=null,rs2=null,rs3=null,rs4=null,rs5=null,rs6=null,rs7=null,rs8=null;
    
    //Date
    Date dateTime = new Date();
    LocalDate localDate = dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    
    //users
    String username=null;
    String password=null;
    String type=null;
    String name=null;
    
    //faculty_info
    int id=0;
    int id_f=0;
    String name_f=null;
    String branch_f=null;
    String designation=null;
    String designation_f=null;
    
    //leave_record
    int leaveno=0;
    String dateStart=null;
    String dateEnd=null;
    String reason=null;
    String date=null;
    int month=0;
    int currentMonth=0;
    
    //extra
    String search=null;
    
    //admin
    String username_a=null;
    String password_a=null;
    String confirmPassword_a=null;
    String type_a=null;
    String name_a=null;
    String designation_a=null;
 
%>
