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
public class BuscaPorTipoServlet extends HttpServlet {

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
            out.println("<title>Servlet BuscaPorTipoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String tipo = request.getParameter("txt_tipo");
            List<Productos>listaProducto=productosFacade.buscarProductoSegunTipo(tipo);
            out.println("LISTADO DE PRODUCTOS SEGÚN TIPO:<hr>");
            out.println("<table>");
            out.println("<tr>");
                    out.println("<td>NOMRBE</td>");
                    out.println("<td>PRECIO</td>");
                    out.println("<td>TIPO</td>");
            out.println("</tr>");
            for(Productos p: listaProducto){
            out.println("<tr>");
                    out.println("<td>"+p.getNombre_producto()+"</td>");
                    out.println("<td>"+p.getPrecio()+"</td>");
                    out.println("<td>"+p.getTipo()+"</td>");
            out.println("</tr>");
            }
            out.println("<h1>Servlet BuscaPorTipoServlet at " + request.getContextPath() + "</h1>");
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
