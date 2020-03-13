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
@WebServlet(name = "AdicionarUsuario", urlPatterns = {"/AdicionarUsuario"})
public class AdicionarUsuario extends HttpServlet {

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
        
        String Nombres  = request.getParameter("Nombres");
        String Apellidos = request.getParameter("Apellidos");
        String UsernameUsuario = request.getParameter("UsernameUsuario");
        String Contraseña = request.getParameter("Contraseña");
        int TipoDocumento_idTipoDocumento = Integer.parseInt ( request.getParameter("TipoDocumento_idTipoDocumento"));
        String Identificacion = request.getParameter("Identificacion");
        int Perfil_idPerfil = Integer.parseInt(request.getParameter("Perfil_idPerfil"));
        String BanderaEstado = request.getParameter("BanderaRegistro");
        
        Usuarios miusuario = new Usuarios();
        UsuarioDAO miusuarioDao = new UsuarioDAO();
        
        miusuario.setNombres(Nombres);
        miusuario.setApellidos(Apellidos);
        miusuario.setUserNameUsuario(UsernameUsuario);
        miusuario.setContraseña(Contraseña);
        miusuario.setTipoDocumento_idTipoDocumento(TipoDocumento_idTipoDocumento);
        miusuario.setIdentificacion(Identificacion);
        miusuario.setPerfil_idPerfil(Perfil_idPerfil);
        

        System.out.println("El valor es " + BanderaEstado);
        if (BanderaEstado.equals("Correcto")){
        String respuestaRegistrada = miusuarioDao.adicionarUsuario(miusuario);
        System.out.println("Res " + respuestaRegistrada);
        System.out.println("Res " + respuestaRegistrada.length());
        if (respuestaRegistrada.length() == 0) {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('"+"Registro Realizado."+"');");
        // Se agrega el redreccionamiento la url para visualice la tabla.
        out.println("window.location.href ='/ZabixDashBoard/register.jsp';");
        out.println("</script>");
        } else {
        out.println("<script type=\"text/javascript\">");
        //out.println("alert('"+respuestaRegistrada+"');");
        out.println("alert('"+"Error Encontrado: "+respuestaRegistrada.replace("'",
        "")+"');");
        out.println("window.history.back();");
        out.println("</script>");
        }
    } else {
    System.out.println("El valor no es correcto " + BanderaEstado);
    }
    }
}
