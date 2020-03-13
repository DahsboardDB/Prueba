/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.UsuarioDAO;
import java.util.ArrayList;
import modelo.Usuarios;



/**
 *
 * @author Diego Galvis
 */
public class PruebaUsuariosDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            UsuarioDAO usuarioDao = new UsuarioDAO();
            Usuarios usuarios = usuarioDao.ConsultarUsuario(0);
            if (usuarios != null){
            System.out.println("Nombre : " + usuarios.getNombres()+ "Apellido : " + usuarios.getApellidos()+ "Tipo Documento : " + usuarios.getTipoDocumento_idTipoDocumento()+ "Numero ID : " + usuarios.getIdentificacion());
            } else {
            System.out.println("El usuario no existe");
            }
            UsuarioDAO miusuario = new UsuarioDAO();
            ArrayList<Usuarios> miListadoUsuario = miusuario.ConsultarListadoUsuario("");
            for (Usuarios U : miListadoUsuario) {
            System.out.println("Nombre : " + usuarios.getNombres()+ "Apellido : " + usuarios.getApellidos()+ "Tipo Documento : " + usuarios.getTipoDocumento_idTipoDocumento()+ "Numero ID : " + usuarios.getIdentificacion());
            }
            System.out.println("SE ELIMINO");
            usuarioDao.DeleteUsuario(miListadoUsuario.get(0));
            miListadoUsuario = miusuario.ConsultarListadoUsuario("");
            for (Usuarios U : miListadoUsuario) {
            System.out.println("Nombre : " + usuarios.getNombres()+ "Apellido : " + usuarios.getApellidos()+ "Tipo Documento : " + usuarios.getTipoDocumento_idTipoDocumento() + "Numero ID : " + usuarios.getIdentificacion());
            }
            }
    }
    

