/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.PerfilDAO;
import java.util.Scanner;
import modelo.Perfil;

/**
 *
 * @author Diego Galvis
 */
public class PruebaRolActualizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner Leer = new Scanner(System.in);
         PerfilDAO perfilDAO = new PerfilDAO();
         Perfil misperfil = new Perfil();
         String Descripcion;
         System.out.println("Por favor ingrese la descripcion a modificar");
         Descripcion = Leer.nextLine();
         misperfil.setDescripcionPerfil(Descripcion);
         misperfil.setIdPerfil(1);
         String respuesta1 = perfilDAO.ActualizarPerfil(misperfil);
         if (respuesta1.length()==0) {
         System.out.println("Actualizado");
         }else{
         System.out.println("Error" + respuesta1);
         }
}

}
  

    

