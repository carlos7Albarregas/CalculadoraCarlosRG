<%-- 
    Document   : error
    Created on : 11-oct-2018, 11:43:18
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../inc/cabecera.inc"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css" type="text/css">
        <title>Calculadora</title>
    </head>
    <body>
        <div id="dibujo">
            CALCULADORA
        </div>
        <h2><%=request.getAttribute("error")%> </h2>
        <a href=<%=request.getContextPath()%> >Volver a calculadora</a>
    </body>
</html>
