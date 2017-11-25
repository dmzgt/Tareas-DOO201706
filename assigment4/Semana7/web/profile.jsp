<%-- 
    Document   : profile
    Created on : 22/11/2017, 01:40:00 PM
    Author     : dmz
--%>
<%
    if(session.getAttribute("name") == null)
        response.sendRedirect("login.jsp");
%>

<%
String color = "";
Cookie[] cookies = request.getCookies();
for(Cookie c : cookies) { 
  if(c.getName().equals("color")) { 
    color = c.getValue();
  }
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>





<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="fondos.css" type="text/css"/>
        <title>JSP Page</title>
    </head>
 <body style="background-color: <%= color %>;">

        <form action="ProfileController" method="post">
            <select name="colors" id="colors">
            
                <option value="white" style="background-color: white;">Blanco</option>
                <option value="blanchedalmond" style="background-color: blanchedalmond;">Almendra</option>
                <option value="grey" style="background-color: grey">Gris</option>
                <p><input type="submit" value="Guardar"></p>
            </select>
               
        </form>
     
        <h1>Hola, <%= session.getAttribute("name") %></h1>
        <a href="LogoutController" >Cerrar Sesion</a>
    </body>
</html>
