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
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Francisco
 */
public class AgregaProductoServlet extends HttpServlet {

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
            out.println("<title>Servlet AgregaProductoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String nombre_p = request.getParameter("txt_nombre_p");
            int stock = Integer.parseInt(request.getParameter("txt_stock"));
            String tipo = request.getParameter("txt_tipo");
            int precio = Integer.parseInt(request.getParameter("txt_precio"));
            
            int id_d = Integer.parseInt(request.getParameter("txt_id_det"));
            String proveedor = request.getParameter("txt_proveedor");
            String fecha_ing = request.getParameter("txt_fecha_ing");
            String marca = request.getParameter("txt_marca");
            String tamano = request.getParameter("txt_tamano");
            String modalidad = request.getParameter("txt_mod");
            int grados = Integer.parseInt(request.getParameter("txt_grados"));
            
            Productos p = new Productos();
            Detalles d = new Detalles();
            
            p.setNombre_producto(nombre_p);
            p.setStock(stock);
            p.setTipo(tipo);
            p.setPrecio(precio);
            
            d.setId(id_d);
            d.setProveedor(proveedor);
            d.setFecha_ing(fecha_ing);
            d.setMarca(marca);
            d.setTamano(tamano);
            d.setModalidad(modalidad);
            d.setGrados(grados);
            
            productosFacade.create(p);
            detallesFacade.create(d);
            
                    
            out.println("<h1>El nuevo producto ha sido agregado exitosamente!<br>"
                    + "<img src=\"imagenes/smile.png\" alt=\"smile\" title=\"hola!\" /></h1>");
            out.println("<hr/>");
            out.println("<div>Puede ver el listado de productos <a href='ListaProductosServlet'>aquí.</a></div>");
            out.println("<link href=\'estilos.css\' rel=\'stylesheet\' type=\'text/css\'/>");
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
