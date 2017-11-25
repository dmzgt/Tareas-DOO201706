<%-- 
    Document   : register
    Created on : 15/10/2017, 08:45:09 PM
    Author     : shizune
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro</h1>
        <form action="" method="post">
            <h2>Nombre</h2>  
            <input type="text" name="nombre">
            <h2>Apellido</h2>  
            <input type="text" name="apellido">
            <h2>Usuario</h2>  
            <input type="text" name="usuario">
            <h2>Contrasenia</h2>  
            <input type="password" name="contra">
            <h2>Confirma contrasenia</h2>  
            <input type="password" name="contra1">
            <input type="submit" name ="Enviar" value="Registrarse">
            <input type="button" value="Ya tengo cuenta" onclick = "location='login.jsp'"/>        
        </form>  
    </body>
</html>
