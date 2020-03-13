/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVLET;

import controlador.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuarios;

/**
 *
 * @author Asus
 */
@WebServlet(name = "ConsultarUsuario", urlPatterns = {"/ConsultarUsuario"})
public class ConsultarUsuario extends HttpServlet {

   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        String Accion = request.getParameter("Actualizar");
        System.out.println("Accion " + Accion);
        
        int Identificacion = Integer.parseInt(Accion);
  
        UsuarioDAO miusuarioDao = new UsuarioDAO();
        Usuarios usuario = null;
        usuario = miusuarioDao.ConsultarUsuario(Identificacion);
        if (Accion != null) {
        if (usuario != null) {
        response.sendRedirect("/sodi8/VISTA/GestionarUsuarios.jsp?"
        +"Nombre=" + usuario.getNombres()+ "&" 
        + "Apellido=" + usuario.getApellidos()+ "&"
        + "Direccion=" + usuario.getUserNameUsuario()+ "&"
        + "Username=" + usuario.getContraseña()+ "&"
        + "Contraseña=" + usuario.getTipoDocumento_idTipoDocumento()+ "&"
        + "Tipo Documento=" + usuario.getIdentificacion()+ "&"
        + "Identificacion=" + usuario.getPerfil_idPerfil()+ "&"
        + "Vista=" + "Actualizar" + "&");
        System.out.println("Salio");
        } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                + "Por favor verificar el nombre del perfil: " + Identificacion +
        "');");
        out.println("</script>");
        }
        } else {
        // Va a eliminar cuando el parametro de la accion es nulo
        if (usuario != null) {
        //Si el cliente existe intentará eliminarlo.
        String respuestaRegistrada = miusuarioDao.DeleteUsuario(usuario);
        if (respuestaRegistrada.length() == 0) {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('"+"Eliminacion Realizada."+"');");
        // Se agrega el redreccionamiento la url para visualice la tabla.
        out.println("window.location.href ='/sodi8/VISTA/GestionarUsuarios.jsp';");
        out.println("</script>");
        } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('"+"No se ha podido relizar la eliminacion."+respuestaRegistrada.replace("'", "") +"');");
        out.println("</script>");
        }
        } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
        + "Por favor verificar el nombre del perfil: " + Identificacion +
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
