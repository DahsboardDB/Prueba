/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


import controlador.UsuarioDAO;
import modelo.Usuarios;

/**
 *
 * @author usr
 */
public class PruebaUsuarioSelect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    UsuarioDAO usuarioDao = new UsuarioDAO(); 
    Usuarios usuario = usuarioDao.ConsultarUsuario(0);
    if (usuario != null) {
    System.out.println("Encontrado " + usuario.getIdUsuarios()+". " + usuario.getNombres()+". "+ usuario.getApellidos()+". "+ usuario.getUserNameUsuario()+". "+ usuario.getTipoDocumento_idTipoDocumento()+". "+ usuario.getIdentificacion()+". "+ usuario.getPerfil_idPerfil());
    }else{
    System.out.println("No encontrado");
    }
    }
    
}
