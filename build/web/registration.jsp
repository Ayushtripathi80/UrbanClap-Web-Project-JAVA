<%-- 
    Document   : registration
    Created on : Mar 9, 2019, 5:54:42 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body  align="center">
        
        <jsp:include page="MainHeader.jspf"/>
        <h1>Registration</h1>
        <hr>
    
        <table border="10" align="center">
           
            <tbody >
                <tr>
                    <td><a href="CustomerReg.jsp">Register As a Customer</a></td>
                </tr>
                <tr>
                    <td><a href="ServitorReg.jsp">Register As a Service Provider</a></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
