<%-- 
    Document   : login
    Created on : 19/11/2017, 04:09:15 PM
    Author     : dmz
--%>

<%
    if(session.getAttribute("name") != null)
        response.sendRedirect("profile.jsp");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <form action="LoginController" method="post">
        <h2>Usuario</h2>  
        <input type="text" name="usuario">
        <h2>Contrasenia</h2>  
        <input type="password" name="contra">
        <input type="submit" name ="Enviar" value="Iniciar Sesion">
        <input type="button" value="Registrarse" onclick = "location='register.jsp'"/>        
        </form>    
    </body>
</html>

