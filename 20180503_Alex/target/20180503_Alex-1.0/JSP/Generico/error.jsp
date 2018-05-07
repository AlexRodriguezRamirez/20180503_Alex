<%-- 
    Document   : error
    Created on : 06-may-2018, 18:23:40
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/estilos.css"/>
    </head>
    <body class="contenido">
        <h3>Se han producido los siguientes errores</h3>
        
        <p class="error">${error}</p>
        
        <br>
        <a href="${pageContext.request.contextPath}">Volver al men&uacute; principal</a>
    </body>
</html>
