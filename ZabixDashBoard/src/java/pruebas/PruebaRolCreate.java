/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.PerfilDAO;
import java.util.Scanner;
import modelo.Perfil;

/**
 *
 * @author APRENDIZ
 */
public class PruebaRolCreate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        PerfilDAO rolDao = new PerfilDAO();
        Perfil misperfil = new Perfil();
        
        Scanner Leer = new Scanner(System.in);
        
        String Descripcion = "";
        
        System.out.println("Por favor ingrese la descripcion del rol");
        Descripcion = Leer.next ();
        misperfil.setDescripcionPerfil(Descripcion);
        String respuesta = rolDao.adicionarPerfil(misperfil);
        if (respuesta.length() == 0){
            System.out.println("Rol registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    
    }
    
}
