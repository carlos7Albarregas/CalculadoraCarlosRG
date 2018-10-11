<%-- 
    Document   : resultado
    Created on : 11-oct-2018, 11:43:24
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css" type="text/css">
        <title>Resultado</title>
    </head>
    <body>
        <%@include file="../inc/cabecera.inc"%>
        <div id="dibujo">
            CALCULADORA
        </div>
        <div id="resul">
            <h2><%=request.getAttribute("calcula")%></h2>
            <br/>
            <a href=<%=request.getContextPath()%> >Volver a calculadora</a>
        </div>
    </body>
</html>
