<%-- 
    Document   : UpdateCustomerProfile
    Created on : Mar 28, 2019, 12:15:01 PM
    Author     : 2k
--%>
<%@page import="utility.DBConnect"%>
<%@ page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="customerHeader.jspf"/>
    <h1>Welcome !
        <%= session.getAttribute("username")%>
       
    </h1>
    <style>
img {
  border-radius: 50%;
}
</style>
</head>
<body>
    <%
        try {
            if (session.getAttribute("username") == null) {
                response.sendRedirect("login.jsp");
            }
        } catch (Exception ex) {

        }
    %>


    <%! String email = ""; %>
    <%! String name = ""; %>
    <%! String password = ""; %>
    <%! String mobile = ""; %>
    <%! String city = ""; %>
    <%! String address = ""; %>
    <%! String photo = ""; %>
    <%! String type = "";%>


    <%
        try {
            String sql = "select * from registration1 where trim(email)='"
                    + session.getAttribute("useremail") + "'";
            DBConnect x = new DBConnect();
            ResultSet rs = x.queryReturner(sql);
            while (rs.next()) {
                name = rs.getString(1);
                email = rs.getString(2);
                password = rs.getString(3);
                type = rs.getString(4);
                mobile = rs.getString(5);
                city = rs.getString(6);
                address = rs.getString(7);
                photo = rs.getString(8);

            }

        } catch (Exception ex) {

        }
    %>
    <form action="./UpdateSubmit" method="post">
        <table border="0" cellspacing="3">

            <tbody>
                <tr>
                    <td></td>
                    <td><img src="photos/<%=photo.trim()%>" height="150" width="150" alt="Avatar" style="width:150px"/>
            </td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="t0"  value="<%=email%>" readonly /></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="t1" value="<%=name%>" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="t2" value="<%=password%>" /></td>
            </tr>
            <tr>
                <td>Mobile</td>
                <td><input type="text" name="t3" value="<%=mobile%>" /></td>
            </tr>

            <tr>
                <td>Type</td>
                <td><input type="text" name="t8" value="<%=type%>" readonly /></td>
            </tr>
            <tr>
                <td>City</td>
                <td><input  list="t4" name="t44" value="<%=city%>"/>
                    <datalist id="t4">
                        <option value="Pune">
                        <option value="Bhopal">
                        <option value="Delhi">
                        <option value="Mumbai">
                        <option value="Banglore">
                    </datalist>
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input name="t5" value="<%=address%>" rows="4" cols="20"
                           /></td>
            </tr>
            <tr>
                <td>Change Photo</td>
                <td><input type="file" name="t6" value="<%=photo%>" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="b2" value="Update" /></td>
            </tr>

            </tbody>
        </table>

    </form>
</body>
</html>
