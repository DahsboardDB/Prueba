/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.PerfilDAO;
import modelo.Perfil;

/**
 *
 * @author APRENDIZ
 */
public class PruebaRolConsultar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
     PerfilDAO rolDao = new PerfilDAO();
    Perfil rol = rolDao.ConsultarPerfil("1");
    if (rol != null) {
    System.out.println("Encontrado " + rol.getIdPerfil()+". " + rol.getDescripcionPerfil());
    }
    else {
    System.out.println("No encontrado");
    }
    
    }
   }
