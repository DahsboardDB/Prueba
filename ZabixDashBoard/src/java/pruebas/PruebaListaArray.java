/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.ListaDAO;
import static java.lang.System.out;
import java.util.ArrayList;
import modelo.Lista;

/**
 *
 * @author jsierra
 */
public class PruebaListaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaDAO listadao = new ListaDAO (); 
        ArrayList <Lista> lista = new ArrayList <Lista> ();
        lista = listadao.ConsultarListadoLista("1");
        int size = lista.size();
        out.println ("\"<table border = \\\"1\\\"><tr><td>IdLista</td><td>Descripcion</td></tr>");
        for (Lista L: lista){
            out.println("<tr>");
            out.println("<td>"+ L.getIdLista()+ "</td>");
            out.println("<td>"+ L.getDescripcion()+ "</td>");
            out.println("</tr>");
          
        }
        out.println("</table>");
        
    }
        
        
    }
    

