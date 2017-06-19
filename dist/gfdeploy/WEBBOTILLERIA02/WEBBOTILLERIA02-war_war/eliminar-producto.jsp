<%-- 
    Document   : eliminar-producto
    Created on : 19-06-2017, 2:50:12
    Author     : Francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
int id = Integer.parseInt(request.getParameter("p_id"));
String nombre = request.getParameter("p_nombre");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Producto</title>
    </head>
    <body>
        <h1>Eliminar Producto</h1><hr>
        ¿Confirma que desea eliminar este producto?<br>
        <%out.println(nombre);%><br>
        <a href="EliminarProductoServlet?p_id=<%out.print(id);%>">Sí, Eliminar!</a> -
        <a href="javascript:history.back();">No, Volver</a>
    </body>
</html>
