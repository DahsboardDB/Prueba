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
 * @author usr
 */
@WebServlet(name = "ConsultarRol", urlPatterns = {"/ConsultarRol"})
public class ConsultarPerfil extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
        String Accion = request.getParameter("Actualizar");
        System.out.println("Accion " + Accion);
        String IdPerfil = request.getParameter("IdConsultado");
  
        PerfilDAO miperfilDao = new PerfilDAO();
        Perfil perfil = null;
        perfil = miperfilDao.ConsultarPerfil(IdPerfil);
        if (Accion != null) {
        if (perfil != null) {
        response.sendRedirect("/sodi8/VISTA/GestionarRoles.jsp?"
        +"IdPerfil="+ perfil.getIdPerfil()+ "&" 
        + "DescripcionPerfil=" + perfil.getDescripcionPerfil()+ "&"
        + "Vista=" + "Actualizar" + "&");
        System.out.println("Salio");
        } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                + "Por favor verificar el nombre del perfil: " + IdPerfil +
        "');");
        out.println("</script>");
        }
        } else {
        // Va a eliminar cuando el parametro de la accion es nulo
        if (perfil != null) {
        //Si el cliente existe intentará eliminarlo.
        String respuestaRegistrada = miperfilDao.DeletePerfil(perfil);
        if (respuestaRegistrada.length() == 0) {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('"+"Eliminacion Realizada."+"');");
        // Se agrega el redreccionamiento la url para visualice la tabla.
        out.println("window.location.href ='/sodi8/VISTA/GestionarRoles.jsp';");
        out.println("</script>");
        } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('"+"No se ha podido relizar la eliminacion."+respuestaRegistrada.replace("'", "") +"');");
        out.println("</script>");
        }
        } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
        + "Por favor verificar el nombre del rol: " + IdPerfil +
        "');");
        out.println("</script>");
        }
        }
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
