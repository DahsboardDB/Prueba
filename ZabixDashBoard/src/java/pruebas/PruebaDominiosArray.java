/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.DominiosDAO;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Dominios;

/**
 *
 * @author Jsierra
 */
public class PruebaDominiosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        DominiosDAO dominiosDao = new DominiosDAO (); 
        ArrayList <Dominios> listaDominios = new ArrayList <Dominios>();
        listaDominios = dominiosDao.ConsultarListadoDominios("1");
        int size = listaDominios.size ();
        out.println ("<table border = \"1\"><tr><td>IdDominios</td><td>Servidor_idServidore</td><td>Dominio</td><td>NombreAplicacion</td></tr>");
        for (Dominios p: listaDominios){
            out.println("<tr>");
            out.println("<td>"+ p.getIdDominios()+ "<td>");
            out.println("<td>"+ p.getServidores_idServidores() +"</td>");
            out.println("<td>"+ p.getDominio() +"</td>");
            out.println("<td>"+ p.getNombreAplicacion() +"</td>");
            out.println("<tr>");
        }
       out.println("</table>");
        
    }
    
}
