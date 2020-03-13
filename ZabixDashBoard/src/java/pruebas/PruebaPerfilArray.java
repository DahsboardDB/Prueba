/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.PerfilDAO;
import static java.lang.System.out;
import java.util.ArrayList;
import modelo.Perfil;

/**
 *
 * @author Jsierra
 */
public class PruebaPerfilArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         PerfilDAO perfilDao = new PerfilDAO();
        ArrayList<Perfil> listaPerfil = new ArrayList<Perfil>();
        listaPerfil = perfilDao.consultarListadoPerfil("");
        int size = listaPerfil.size();
        out.println("<table border=\"1\"><tr><td>IdPerfil</td><td>DescripcionPerfil</td></tr>");
        for(Perfil p : listaPerfil){
        out.println("<tr>");
        out.println("<td>" + p.getIdPerfil()+ "</td>");
        out.println("<td>" + p.getDescripcionPerfil()+ "</td>");
        out.println("</tr>");
        }
        out.println("</table>");
        }
        
    
}
