<%-- 
    Document   : index
    Created on : 11-oct-2018, 11:19:44
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css" type="text/css">
        <title>Calculadora</title>
    </head>
    <body>
        <%@include file="inc/cabecera.inc"%>
        <form action="Controlador" method="post">
            
            <div id="dibujo">
                CALCULADORA
            </div>
            <div id="formulario">
            <label for="operando1">Operando1</label>
            <input type="text" id="operando1" name="num1"/>
            <label for="operando2">Operando2</label>
            <input type="text" id="operando2" name="num2"/>
            <br/>
              
            <input type="radio" name="radio" value="suma" checked="checked" />Suma
            <input type="radio" name="radio" value="resta"/>Resta
            <input type="radio" name="radio" value="multiplicar"/>Multiplicar
            <input type="radio" name="radio" value="dividir"/>Dividir

            <input type="submit" value="Enviar"/>
              
        </form>
        </div>
    </body>
</html>
