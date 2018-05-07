<%-- 
    Document   : inicioDEquipo
    Created on : 07-may-2018, 3:59:04
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar equipo</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/estilos.css"/>
    </head>
    <body class="contenido">
        <h3>Seleccione el equipo que desea eliminar</h3>
        
        <form action="eliminarEquipo" method="post">
            <table>
                <tr>
                    <th></th>
                    <th>ID</th>
                    <th>Marca</th>
                    <th>N&uacute;mero de serie</th>
                </tr>
                
                <c:forEach var="equipo" items="${equipos}">
                    <tr>
                        <td><input type="radio" name="eleccion" value="${equipo.idEquipo}"/></td>
                        <td><label>${equipo.idEquipo}</label></td>
                        <td><label>${equipo.marca}</label></td>
                        <td><label>${equipo.numSerie}</label></td>
                    </tr>
                </c:forEach>
                    <tr>
                        <td></td>
                        <td></td>
                        <td><input type="submit" name="enviar" value="Enviar"/></td>
                        <td><input type="submit" name="volver" value="Volver"/></td>
                    </tr>
                
            </table>
            
        </form>
    </body>
</html>