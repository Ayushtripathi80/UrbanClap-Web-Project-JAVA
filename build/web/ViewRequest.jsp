<%-- 
    Document   : ViewRequest
    Created on : Apr 3, 2019, 12:42:16 PM
    Author     : 2k
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
    <body>
       <jsp:include page="servitorHeader.jspf"/>
       
       <h2 align="center">Requests
           <%=session.getAttribute("usercity")%>
           <%=session.getAttribute("usertype")%>
       </h2>
       <form method="POST" action="Reply.jsp">
                  
           <table align="center"border="1">
               <thead>
                   <tr>
                      <th>PHOTO</th>
                       <th>NAME</th>
                       <th>DESCRIPTION</th>
                       <th>REQUIRED ON</th>
                         <th>ADDRESS</th>
                       <th>CONTACT NO</th>
                       <th>BOOK</th>
                 
                   </tr>
               </thead>
               <tbody>
                  <%
                   String type= session.getAttribute("usertype").toString().trim();
                  
                    try {
                        String sql = "select * from requirements where servitortype='"+type+"'";
                       
                        DBConnect x = new DBConnect();
                        ResultSet rs = x.queryReturner(sql);
                      
                     while (rs.next() ) {
             
               String email=rs.getString(2).trim();
                        String sql1 = "select * from registration1 where trim(email)='"+email
                                +"' and trim(city)=(select trim(city) from registration1 where trim(email)='"+
                            email+"')"    
                                ;
                        ResultSet rs1 = x.queryReturner(sql1);
                        while(rs1.next()){
                %>
                <tr>
                    <td><img src="photos/<%=rs1.getString(8).trim()%>" height="150" width="150"  />      </td>
                   
                     <td><%=rs1.getString(1)%></td>
                    <td><%=rs.getString(5)%></td>
                    <td><%=rs.getString(6)%></td>
                     <td><%=rs1.getString(7)%></td>
                    <td><%=rs1.getString(5)%></td>
                    <td><input type="submit" value="REPLY" name="b1" /></td>
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
       </form>

       </form>
    </body>
</html>
