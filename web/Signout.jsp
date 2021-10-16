<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

           
session.removeAttribute("name");
session.removeAttribute("email");
session.removeAttribute("utype");
session.removeAttribute("mobile");
session.removeAttribute("photo");
response.sendRedirect("login.jsp");
        %>
    </body>
</html>
