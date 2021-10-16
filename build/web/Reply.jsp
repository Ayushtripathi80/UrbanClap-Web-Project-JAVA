<%-- 
    Document   : Reply
    Created on : Apr 3, 2019, 9:56:55 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="servitorHeader.jspf"/>
    </head>
    <body align="center">
  <h2>Book Customer Request</h2>
  <h1> Welcome <%= %></h1>
  <table border="1" align="center">
      <thead>
          <tr>
              <th>RESPONSE</th>
          </tr>
      </thead>
      <tbody>
          
          <tr>
              <td><textarea name="t1" rows="4" cols="20">
                  </textarea></td>
          </tr>
               <tr>
              <th>CHARGES</th>
          </tr>
          <tr>
            <td><input  list="t2" name="t2" />
                    <datalist id="t2">
                        <option value="Not Defined">
                        <option value="Discuss in Call">
                        <option value="Depends on Days of Work">
                        <option value="Depends On amount of Work">
                      
                    </datalist>
                </td>
         
          <tr>
              <td><input type="submit" value="SUBMIT" name="b2" /></td>
          </tr>
      </tbody>
  </table>

       
    </body>
</html>
