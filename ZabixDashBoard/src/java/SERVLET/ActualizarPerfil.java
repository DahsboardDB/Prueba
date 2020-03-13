/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVLET;

import controlador.PerfilDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Perfil;

/**
 *
 * @author Asus
 */
@WebServlet(name = "ActualizarPerfil", urlPatterns = {"/ActualizarPerfil"})
public class ActualizarPerfil extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        String Descripcion = request.getParameter("DescripcionPerfil");
        String Identificacion = request.getParameter("IdPerfil") ;
        
        Perfil miperfil = new Perfil();
        PerfilDAO miperfilDao = new PerfilDAO();
        
        int codigo;
        codigo = Integer.parseInt(Identificacion);
        miperfil.setDescripcionPerfil(Descripcion);
        miperfil.setIdPerfil(codigo);
        //Imprimo la Identificacion
        System.out.println("IdPerfil: " + codigo);
        String respuestaRegistrada = miperfilDao.ActualizarPerfil(miperfil);
        if (respuestaRegistrada.length() == 0) {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('"+"Actualización Realizada."+"');");
        // Se agrega el redreccionamiento la url para visualice la tabla.
        out.println("window.location.href = '/sodi8/VISTA/GestionarRoles.jsp';");
        out.println("</script>");
        } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('"+"No se ha podido relizar la actualizacion."+"\n"+
        respuestaRegistrada +"');");
        out.println("</script>");
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
