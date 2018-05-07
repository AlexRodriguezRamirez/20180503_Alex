<%-- 
    Document   : inicioCEquipo
    Created on : 05-may-2018, 21:09:13
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>A&ntilde;adir equipo</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/estilos.css"/>
    </head>
    <body class="contenido">
        <h3>Introduzca los datos a insertar</h3>
        
        <form action="insertEquipo" method="post">
            <table>
                <tr>
                    <td><label>Marca:</label></td>
                    <td><input type="text" name="marca"/></td>
                </tr>
                <tr>
                    <td><label>N&uacute;mero de serie:</label></td>
                    <td><input type="text" name="numSerie"/></td>
                </tr>
                <tr>
                    <td><input type="submit" name="enviar" value="Enviar"/></td>
                    <td><input type="submit" name="volver" value="Volver"/></td>
                </tr>  
            </table>
                   
        </form>
        
    </body>
</html>
