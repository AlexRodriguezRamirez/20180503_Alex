<%-- 
    Document   : inicioCAlumno
    Created on : 05-may-2018, 21:09:04
    Author     : Alex
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>A&ntilde;adir alumno</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/estilos.css"/>
    </head>
    <body class="contenido">
        <h3>Introduzca los datos a insertar</h3>
        
        <form action="insertAlumno" method="post">
            <table>
                <tr>
                    <td><label>Nombre:</label></td>
                    <td><input type="text" name="nombre"/></td>
                </tr>
                <tr>
                    <td><label>Grupo:</label></td>
                    <td><input type="text" name="grupo"/></td>
                </tr>
                <tr>
                    <td><label>Equipo:</label></td>
                    <td>
                        <select name="idEquipo">
                            <option value="0">Seleccione uno...</option>
                            <c:forEach var="equipo" items="${equipos}">
                                <option value="${equipo.idEquipo}">${equipo.marca}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" name="enviar" value="Enviar"/></td>
                    <td><input type="submit" name="volver" value="Volver"/></td>
                </tr>  
            </table>
                   
        </form>
        
    </body>
</html>
