<%-- 
    Document   : division
    Created on : 11-oct-2018, 21:17:27
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../inc/cabecera.inc"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="dibujo">
            CALCULADORA
        </div>
        <h2><%=request.getAttribute("division")%> </h2>
        <br/>
        <a href=<%=request.getContextPath()%> >Volver a calculadora</a>
    </body>
</html>
