<%-- 
    Document   : index
    Created on : 03-may-2018, 16:17:37
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD</title>
        <link rel="stylesheet" type="text/css" href="CSS/estilos.css"/>
        <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="https://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script>
        $(document).ready(function(){
            $("#mostrar1").click(function(){
                $("#1").fadeIn();
            });
            
            $("#mostrar2").click(function(){
                $("#2").fadeIn();
            });
            
            $("#mostrar3").click(function(){
                $("#3").fadeIn();
            });
            
            $("#mostrar4").click(function(){
                $("#4").fadeIn();
            });
            
        });
        </script>
    </head>
    <body class="contenido">
        <h1>Elija una opción:</h1>
        <form action="operacion" method="post">
            <h3 id="mostrar1" class="cabecera">A&ntilde;adir</h3>
            <br/>
            <div id="1" hidden="hidden">
                <input type="submit" class="link" name="cAlumno" value="Alumno"><br/>
                <input type="submit" class="link" name="cEquipo" value="Equipo">
            </div>
            <br/>
            
            
            <h3 id="mostrar2" class="cabecera">Consultar</h3>
            <br/>
            <div id="2" hidden="hidden">
                <input type="submit" class="link" name="rAlumno" value="Alumno"><br/>
                <input type="submit" class="link" name="rEquipo" value="Equipo"><br/>
                <input type="submit" class="link" name="rTodo" value="Ambos">
            </div>
            <br/>
            
            <h3 id="mostrar3" class="cabecera">Actualizar</h3>
            <br/>
            <div id="3" hidden="hidden">
                <input type="submit" class="link" name="uAlumno" value="Alumno"><br/>
                <input type="submit" class="link" name="uEquipo" value="Equipo">
            </div>
            <br/>
        
            <h3 id="mostrar4" class="cabecera">Eliminar</h3>
            <br/>
            <div id="4" hidden="hidden">
                <input type="submit" class="link" name="dAlumno" value="Alumno"><br/>
                <input type="submit" class="link" name="dEquipo" value="Equipo">
            </div> 
            <br/>       
        
            
        </form>
    </body>
</html>
