<%-- 
    Document   : inicioDAlumno
    Created on : 07-may-2018, 1:40:03
    Author     : Alex
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar alumno</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/estilos.css"/>
    </head>
    <body class="contenido">
        <h3>Seleccione el alumno que desea eliminar</h3>
        
        <form action="eliminarAlumno" method="post">
            <table>
                <tr>
                    <th></th>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Grupo</th>
                    <th>Equipo</th>
                </tr>
                
                <c:forEach var="alumno" items="${alumnos}">
                    <tr>
                        <td><input type="radio" name="eleccion" value="${alumno.idAlumno}"/></td>
                        <td><label>${alumno.idAlumno}</label></td>
                        <td><label>${alumno.nombre}</label></td>
                        <td><label>${alumno.grupo}</label></td>
                        <td>
                            <c:choose>
                                <c:when test="${alumno.equipo.idEquipo == 0}">
                                    <label>Sin asignar</label>
                                </c:when>
                                    
                                <c:otherwise>
                                    <label>${alumno.equipo.marca}</label>
                                </c:otherwise>
                            </c:choose>
                        </td>
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
