<%-- 
    Document   : buscaproducto
    Created on : 17-05-2017, 1:36:36
    Author     : Francisco Espinoza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busqueda Productos...</title>
         <link rel="stylesheet" type="text/css" href="estilos.css"> 
         
    </head>
  
    <body >
        <h1 style="font-family: Times New Roman;"> Búsqueda de productos....</h1>
        <hr />
        <h1 style="font-family: Arial;"> Ingresa nombre de producto para iniciar la búsqueda:</h1>
        <form name="frm_buscar" method="post" action="...">
            <label style=" text-align: center;">Nombre Producto:</label>
            <input type="text" name="txt_NombreProducto" placeholder="Ingresa producto">
            <!-- <input type="Integer" name="ingresa_codigo" placeholder="Ingrese codigo"> -->
            <input type="submit" value="Buscar">
          
        </form>
        <hr />
        
        <form name="frm_buscaPorCategoria" method="post" action="BuscaPorTipoServlet">
            Ingrese Tipo: <input type="text" name="txt_tipo" placeholder="Ej: Cerveza, vino, pisco">
            <input type="submit" value="Buscar">
        </form>
        <div style="text-align:center;" > <img src="imagenes/imagen04.jpg"/> </div>
        <!--<script src="JS/funcionBoton.js" type="text/javascript"></script>-->
    </body>
</html>
