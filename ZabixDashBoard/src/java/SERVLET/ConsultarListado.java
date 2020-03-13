/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVLET;

import controlador.ListaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Lista;

/**
 *
 * @author jsierra
 */
@WebServlet(name = "ConsultarListado", urlPatterns = {"/ConsultarListado"})
public class ConsultarListado extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        String Accion = request.getParameter("Actualizar");
        System.out.println("Accion " + Accion);
        
        String Descripcion = request.getParameter("IdConsultado");
  
        ListaDAO milistaDao = new ListaDAO();
        Lista lista = null;
        lista = milistaDao.ConsultarLista(Descripcion);
        if (Accion != null) {
        if (lista != null) {
        response.sendRedirect("/sodi8/VISTA/GestionarUsuarios.jsp?"
        +"Descripcion =" + lista.getDescripcion()+ "&" 
        + "Vista=" + "Actualizar" + "&");
        System.out.println("Salio");
        }
         }
        }
  }
}