<%-- 
    Document   : ServitorHome
    Created on : Mar 9, 2019, 7:02:12 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="servitorHeader.jspf"/>
        <h3>Servitor</h3>
        <h2>Welcome <%= session.getAttribute("username") %></h2>
       <h2> Servitor Home </h2>
    </body>
</html>
