/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.ServidorDAO;
import static java.lang.System.out;
import java.util.ArrayList;
import modelo.Servidor;

/**
 *
 * @author Jsierra
 */
public class PruebaServidorArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServidorDAO servidordao = new ServidorDAO (); 
        ArrayList <Servidor> servidor = new ArrayList <Servidor> ();
        servidor = servidordao.ConsultarListadoServidor("1");
        int size = servidor.size();
        out.println ("\"<table border = \\\"1\\\"><tr><td>IdServidores</td><td>Servidor</td></tr>");
        for (Servidor S: servidor){
            out.println("<tr>");
            out.println("<td>"+ S.getIdServidores()+ "</td>");
            out.println("<td>"+ S.getServidor()+ "</td>");
            out.println("</tr>");
          
        }
        out.println("</table>");
        
    }
    
}
