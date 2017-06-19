/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import Persistencia.DetallesFacadeLocal;
import Persistencia.ProductosFacadeLocal;
import Procesos.Detalles;
import Procesos.Productos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Francisco
 */
public class ListaProductosServlet extends HttpServlet {

    @EJB
    private DetallesFacadeLocal detallesFacade;

    @EJB
    private ProductosFacadeLocal productosFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListaProductosServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            List<Productos>ListaProductos = productosFacade.findAll();
            //List<Detalles>ListaDetalles = detallesFacade.findAll();
            
            out.println("<h1><img src=\'imagenes/lista1.png\'/> LISTADO DE PRODUCTOS: </h1>");
            out.println("<hr/>");
            
                out.println("<table>");
                    out.println("<tr>");
                    out.println("<td>ID</td>");
                    out.println("<td>NOMRBE</td>");
                    out.println("<td>PRECIO</td>");
                    out.println("<td>STOCK</td>");
                    out.println("</tr>");
                    for(Productos p: ListaProductos){
                    out.println("<tr>");
                    out.println("<td>"+p.getId()+"</td>");
                    out.println("<td>"+p.getNombre_producto()+"</td>");
                    out.println("<td>"+p.getPrecio()+"</td>");
                    out.println("<td>"+p.getStock()+"</td>");
                    out.println("<td> <a href='editarProducto.jsp?p_id="+p.getId()
                            +"&p_nombre="+p.getNombre_producto()+"&p_precio="+p.getPrecio()
                            +"&p_stock="+p.getStock()+"'> Editar </a> - "
                            + "<a href='eliminar-producto.jsp?p_id="+p.getId()
                            +"&p_nombre="+p.getNombre_producto()+"'> Eliminar </a></td>");
                    out.println("</tr>");
                    }
                    /*
                    out.println("</table>");
                    out.println("<table>");
                    out.println("<tr>");
                    out.println("<td>FECHA INGRESO</td>");
                    out.println("<td>MARCA</td>");
                    out.println("<td>MODALIDAD</td>");
                    out.println("<td>PROVEEDOR</td>");
                    out.println("<td>TAMAÑO</td>");
                    out.println("<td>GRADOS ALCOHOL</td>");
                    out.println("</tr>");
                    for(Detalles d: ListaDetalles){
                    out.println("<tr>");
                    out.println("<td>"+d.getFecha_ing()+"</td>");
                    out.println("<td>"+d.getMarca()+"</td>");
                    out.println("<td>"+d.getModalidad()+"</td>");
                    out.println("<td>"+d.getProveedor()+"</td>");
                    out.println("<td>"+d.getTamano()+"</td>");
                    out.println("<td>"+d.getGrados()+"</td>");
                    out.println("<td> <a href='#'> Editar </a> - <a href='#'> Eliminar </a></td>");
                    out.println("</tr>");
                    }
                    */
                out.println("</table>");
            /*    
            for(Productos p: ListaProductos){   
            out.println("<h1> - Nombre: " +p.getNombre_producto()+ 
                    " ~ Precio: $" +p.getPrecio() +" ~ Tipo: "+ p.getTipo() + 
                    " ~ Id: " +p.getId()+ "<br>" +"</h1>");
                }
            */
            
            out.println("<h1>Servlet ListaProductosServlet at " + request.getContextPath() + "</h1>");
            out.println(" <link href=\'estilos.css\' rel=\'stylesheet\' type=\'text/css\'/>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
