/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.PerfilDAO;
import java.util.ArrayList;
import modelo.Perfil;

/**
 *
 * @author APRENDIZ
 */
public class PruebaRolDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          PerfilDAO rolDao = new PerfilDAO();
        Perfil miRol = rolDao.Consultarroles("");
        if (miRol != null){
        System.out.println("Nombre : " + miRol.getDescripcionRol() + " " + miRol.getEstado());
        } 
        else {
        System.out.println("El rol no existe");
        }
        PerfilDAO Rol = new PerfilDAO();
        ArrayList<Perfil> miListadoRol = Rol.consultarListadoRoles("");
        for (Perfil C : miListadoRol) {
        System.out.println(" Nombre : " + C.getDescripcionRol() + " Id. " +C.getIdRol() + " Estado : " + C.getEstado());
        }
        System.out.println("SE ELIMINO");
        Rol.DeleteRol(miListadoRol.get(0));
        miListadoRol = Rol.consultarListadoRoles("");
        for (Perfil C : miListadoRol) {
        System.out.println(" Nombre : " + C.getDescripcionRol() + " Id. " + C.getIdRol() + " Estado : " + C.getEstado());
        }
    }
    
}
