<%-- 
    Document   : editarProducto
    Created on : 19-06-2017, 0:47:32
    Author     : Francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id = Integer.parseInt(request.getParameter("p_id"));
    String nombre = request.getParameter("p_nombre");
    int precio = Integer.parseInt(request.getParameter("p_precio"));
    int stock = Integer.parseInt(request.getParameter("p_stock"));
    
%>    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Producto</title>
    </head>
    <body>
        <h1>Editar Producto...</h1><hr>
        <form name="frm_editarProducto" method="post" action="EditarProductoServlet">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="hidden" name="hdn_id" value="<%out.print(id);%>"> </td>
                </tr>
                <tr>
                    <td>NOMBRE</td>
                    <td><input type="text" name="txt_editaNombre" value="<%out.print(nombre);%>"></td>
                </tr>
                <tr>
                    <td>PRECIO</td>
                    <td><input type="text" name="txt_editaPrecio" value="<%out.print(precio);%>"></td>
                </tr>
                <tr>
                    <td>STOCK</td>
                    <td><input type="text" name="txt_editaStock" value="<%out.print(stock);%>"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Editar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>

<!-- <input type="text" name="txt_editaNombre" placeholder="Ingresa nuevo nombre"><br>
             
            Precio: <input type="integer" name="txt_editaPrecio" placeholder="Ingresa nuevo precio"><br>
            Stock: <input type="integer" name="txt_editaStock" placeholder="Ingresa nuevo stock">
-->