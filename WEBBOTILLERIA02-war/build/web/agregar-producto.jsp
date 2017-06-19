<%-- 
    Document   : ingresar-producto
    Created on : 05-06-2017, 19:48:31
    Author     : Francisco 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso de Productos</title>
        
    </head>
    <body>
        <h1>Ingreso de productos:</h1>
        <form name="frm_Ingresa_producto" method="post" action="AgregaProductoServlet">
            <img src="imagenes/agregar.png"/><br>
            <!--Ingresar id: <input type="text" name="txt_id_pro"  placeholder="Sólo números"><br>-->
            Ingresar nombre producto:<input type="text" name="txt_nombre_p"  placeholder="Ingresa nombre producto"><br>
            Ingresar Stock ini: <input type="text" name="txt_stock" placeholder="Ingresa stock inicial"><br>
            Ingresar tipo: <input type="text" name="txt_tipo"  placeholder="Ingresa tipo alcohol"><br>
            Ingresar precio: <input type="text" name="txt_precio" placeholder="Ingresa precio"><br>
            Ingresar id detalle:<input type="text" name="txt_id_det"  placeholder="Sólo números"><br>
            Ingresar proveedor: <input type="text" name="txt_proveedor"  placeholder="Ingresa tipo proveedor"><br>
            Ingresar fecha ingreso: <input type="text" name="txt_fecha_ing"  placeholder="Ej: 01/12/17"><br>
            Ingresar marca: <input type="text" name="txt_marca"  placeholder="Ingresa marca"><br>
            Ingresar tamaño: <input type="text" name="txt_tamano"  placeholder="Ej: 1.2L; 350cc"><br>
            Ingresar modalidad: <input type="text" name="txt_mod" placeholder="Ej: caja, botella, pack..."><br>
            Ingresar grados alcohol: <input type="text" name="txt_grados"  placeholder="Ingresa grados alcohol">
            <input type="submit" value="Ingresar"> 
                       
        </form>
        
        <hr />
       
        <h1>Búsqueda por ID:</h1>
        <form name="frm_busca_producto" method="post" action="BuscaPorIDServlet">
            <img src="imagenes/buscar.png"/><br>
            Ingresa ID del producto para iniciar la búsqueda: <input type="text" name="txt_busca_id"  placeholder="Ingresa id">
            <input type="submit" value="Buscar"> 
        </form>
        <hr /> 
        <form name="Lista_productos" method="post" action="ListaProductosServlet">
            <h1>Mostrar listado de productos:</h1>
            <img src="imagenes/lista.png"/><br>
            <input type="submit" value="Listar productos existentes">
        </form>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
    </body>
</html>
