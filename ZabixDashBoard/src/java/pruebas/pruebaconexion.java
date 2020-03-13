/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.Conexion;
import java.sql.Connection;

/**
 *
 * @author APRENDIZ
 */
public class pruebaconexion {

    /**
     * @param args the command sline arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Conexion con = new Conexion();
         
         Connection reg = con.getConn();
        
    }
    
}
