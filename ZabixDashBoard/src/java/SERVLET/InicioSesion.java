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



@WebServlet(name = "InicioSesion", urlPatterns = {"/Iniciar"})
public class InicioSesion extends HttpServlet {

  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String Usuario = request.getParameter("usuario");
        String Password = request.getParameter("pass");
        
        try{
            int Identificacion = Integer.parseInt(Usuario); 
            
            UsuarioDAO miusuarioDAO = new UsuarioDAO();
            Usuarios miusuario = new Usuarios();
            
            miusuario = miusuarioDAO.ConsultarUsuario(Identificacion);
            if (miusuario == null){
                out.println("<script type=\"text/javascript\">");
                out.println("alert('"+"Identificacion  "+ Usuario + ", no existe."+"');");
                out.println("window.location.href = '/ZabixDashBoard/login.jsp';");
                out.println("</script>");
            } else {
                System.out.println(miusuario.getContraseña());
                System.out.println(Password);
                if (miusuario.getContraseña().equals(Password)){
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('"+"Bienvenido : " + miusuario.getNombres()+ " " +
                            miusuario.getApellidos()+"');");
                    out.println("window.location.href ='/ZabixDashBoard/index.jsp';");
                    out.println("</script>");
                } else {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('"+"Contraseña incorrecta"+"');");
                    out.println("window.location.href = '/ZabixDashBoard/login.jsp';");
                    out.println("</script>");
                }
            }
        }
        catch(NumberFormatException ex){
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+"La identificacion debe ser numerica : " + Usuario +"');");
            out.println("window.location.href = '/ZabixDashBoard/login.jsp';");
            out.println("</script>");
        }
        
    }

   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { processRequest(request, response);
    }

  
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
