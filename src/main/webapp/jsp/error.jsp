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
        <title>Calculadora</title>
    </head>
    <body>
        <h2><%=request.getAttribute("error")%> </h2>
        <a href=<%=request.getContextPath()%> >Volver a calculadora</a>
    </body>
</html>
