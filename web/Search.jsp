<%-- 
    Document   : search
    Created on : Oct 4, 2018, 6:59:43 PM
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
    <body align='center'>
        <% if(session.getAttribute("username")==null)
        {%>
            <jsp:include page="MainHeader.jspf"/> 
       <% }
else
{
%>
<jsp:include page="customerHeader.jspf"/> 
<%}
                  %>
               

        <h1>Search Service Provider</h1>
        <hr>
       
        <form>
            <table align='center'>
               
                 <td>Type</td>
                        <td><select name="t4" required>
                                <option>Electrician</option>
                                <option>Plumber</option>
                                <option>Painter</option>
                                <option>Carpenter</option>
                                <option>Medical</option>
                                <option>Other</option>

                             </select></td>
             
                   <td>City</td>
                        <td><select name="t6" required="">
                                <option>Jabalpur</option>
                                <option>Bhopal</option>
                                <option>Indore</option>
                                <option>Delhi</option>
                                <option>Mumbai</option>
                                <option>Pune</option>
                                <option>Bangalore</option>
                            </select></td>
             
                    <td>
            <input type="submit" value="SEARCH" name="b2" />
                 </td>
             
              
            
            </tbody>
        </table>
    </form>

        
        <table align='center'>
            <tr>
                <td>Photo</td>
                <td>Name</td>
                <td>Mobile</td>
                <td>Address</td>
                <td>City</td>     
                <td>Experience</td>
    
            </tr>
            
            <%
                if(request.getParameter("b2")!=null)
                {
                    try
                    {
                        String sql="select * from registration1 where trim(utype)='"
                                +request.getParameter("t4")+"' "
                                + " and trim(City)='"+request.getParameter("t6")+"'";
                        
                         DBConnect x=new DBConnect();
                        ResultSet rs=x.queryReturner(sql);
                        while(rs.next())
                        {%>
                            <tr>
                             <td> <img src = "photos/<%=rs.getString(8).trim()%>" height =100 width=100 ></td>
                   
                           <td><%=rs.getString(1)%></td>
                       <td><%=rs.getString(5)%></td>
                           <td><%=rs.getString(7)%></td>
                             <td><%=rs.getString(6)%></td>
                             <td><%=rs.getString(9)%></td>
                            </tr>
                            <%

                        }
                    }
                    catch(Exception ex)
                    {
                        out.println(ex);
                    }
                }
                %>
        </table>
        
    </body>
</html>
