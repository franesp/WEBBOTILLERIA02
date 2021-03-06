/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import Persistencia.ProductosFacadeLocal;
import Procesos.Productos;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Francisco
 */
public class EditarProductoServlet extends HttpServlet {

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
        response.setCharacterEncoding("UTF-8");
        
        int id = Integer.parseInt(request.getParameter("hdn_id"));
        String nombre = request.getParameter("txt_editaNombre");
        int precio = Integer.parseInt(request.getParameter("txt_editaPrecio"));
        String tipo = request.getParameter("txt_editaTipo");
        int stock = Integer.parseInt(request.getParameter("txt_editaStock"));
        
        Productos editaProducto = new Productos();
        
        editaProducto.setId(id);
        editaProducto.setNombre_producto(nombre);
        editaProducto.setPrecio(precio);
        editaProducto.setTipo(tipo);
        editaProducto.setStock(stock);
        
        try{
            productosFacade.edit(editaProducto);
        }catch(Exception e){
        out.println("AYAYAI!!!... SE HA PRODUCIDO UN ERROR AL INTENTAR ACTUALIZAR :)");
        }
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditarProductoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            
            out.println("<h1>El producto " +nombre+", ha sido actualizado exitosamente!</h1>"
                    + "<img src=\"imagenes/smile.png\" alt=\"smile\" title=\"hola!\" /></h1><hr>");
            out.println("Volver al lisrado de productos <a href='ListaProductosServlet'>aquí... </a>");
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
