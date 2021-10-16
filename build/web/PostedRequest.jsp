<%-- 
    Document   : PostedRequest
    Created on : Apr 2, 2019, 9:09:09 AM
    Author     : Hp
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="utility.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <%
            
String id[] = new String[10];
for (int i = 0; i < 10; i++) {
id[i] = request.getParameter("check" + i);
}
%>
    <body>
          <%
        try{
                if(session.getAttribute("username")==null)
                {
                    response.sendRedirect("login.jsp");
                }
            }
        catch(Exception ex)
        {
            
        }
        %>
        
        <jsp:include page="customerHeader.jspf"/>
        <hr>
        <form >
        <table border="1">
            <thead>
                <tr>
                    <th>CHECK</th>
                    <th>ID</th>
                    <th>PUBLISHED</th>
                    <th>SERVITOR TYPE</th>
                    <th>DESCRIPTION</th>
                    <th>REQUIRED ON</th>
                </tr>
            </thead>
            <tbody>
                <%
                    
                    try {
                        String sql = "select * from requirements where trim(postbyemail)='"+session.getAttribute("useremail")+"'";
                        DBConnect x = new DBConnect();
                        ResultSet rs = x.queryReturner(sql);
                        int i=0;
                     while (rs.next()) {
                String ch=rs.getString(1);
                String email=rs.getString(2);
                        String sql1 = "select * from registration1 where trim(email)='"+email+"'";
                        ResultSet rs1 = x.queryReturner(sql1);
                        while(rs1.next()){
                %>
                <tr>
                    <td><input type="checkbox" name="check<%=i%>"
                   value=<%=ch%>></td>
                    <td><%=rs.getInt(1)%></td>
                     <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(5)%></td>
                    <td><%=rs.getString(6)%></td>
                </tr>
                <%
                      }
                     }
                       }
                       catch(Exception ex)
                       {
                           out.println(ex);
                       }
                
                %>
            </tbody>
        </table>
            <input type="submit" value="Delete" name="b1" >
            
        </form>
          

            <%
               if(request.getParameter("b1")!=null)
               {
           
try {
 
                        
for (int a = 0; a < 10; a++) {
    DBConnect x = new DBConnect();
    String sql1 = "delete from requirements where id=' "+id[a]+" ' ";

ResultSet rs = x.queryReturner(sql1);
if(id[a] != null){%>
<h3><font color="green">ID : <%= id[a]%> Deleted Successfully</font></h3>
<% }}
} catch (Exception e) {
System.out.println(e.getMessage());
}
}

%>
            
    </body>
</html>
