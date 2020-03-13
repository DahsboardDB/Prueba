/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.UsuarioDAO;
import java.util.Scanner;
import modelo.Usuarios;

/**
 *
 * @author 
 */
public class PruebaUsuarioUpdate {
    private static Object miusuario;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Leer = new Scanner(System.in);
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuarios usuario = new Usuarios();
    
        String NombreUsuario;
        String ApellidoUsuario;
        String DireccionUsuario;
        String UserNameUsuario;
        String Contraseña ;
        String TipoDocumento_IdTipo ="";
        String Identificacion ="";
        String Rol_IdRol ="";
        String Estado;
    
    System.out.println("Por favor ingrese el nombre del Vendedor");
    NombreUsuario = Leer.nextLine();
    usuario.setNombres(NombreUsuario);
    
    System.out.println("Por favor ingrese el Apellido del Vendedor");
    ApellidoUsuario = Leer.nextLine();
    usuario.setApellidos(ApellidoUsuario);
    
    /*System.out.println("Por favor ingrese la Direccion del Vendedor");
    DireccionUsuario = Leer.nextLine();
    usuario.setDireccionUsuario(DireccionUsuario)*/
    
    System.out.println("Por favor ingrese el UserName del Vendedor");
    UserNameUsuario = Leer.nextLine();
    usuario.setUserNameUsuario(UserNameUsuario);
    
    System.out.println("Por favor ingrese el Password del Vendedor");
    Contraseña = Leer.nextLine();
    usuario.setContraseña(Contraseña);
    
    System.out.println("Por favor ingrese el TipoId_IdTipo del Vendedor");
    TipoDocumento_IdTipo = Leer.nextLine();
    int TipoId_IdTipoR;
    TipoId_IdTipoR = Integer.parseInt(TipoDocumento_IdTipo);
    usuario.setTipoDocumento_idTipoDocumento(TipoId_IdTipoR);
    
    System.out.println("Por favor ingrese la Identificacion del Vendedor");
    Identificacion = Leer.nextLine();
    int IdentificacionR;
    IdentificacionR = Integer.parseInt(Identificacion);
    usuario.setIdentificacion(Identificacion);
    
    System.out.println("Por favor ingrese el Rol_IdRol del Vendedor");
    Rol_IdRol = Leer.nextLine();
    int Rol_IdRolR;
    Rol_IdRolR = Integer.parseInt(Rol_IdRol);
    usuario.setPerfil_idPerfil(Rol_IdRolR);
    
   /*System.out.println("Por favor ingrese el Estado del Vendedor");
    Estado = Leer.nextLine();
    usuario.setEstado(Estado);*/
    
    usuario.setIdUsuarios(3);
    String respuesta1 = usuarioDAO.ActualizarUsuario(usuario);
    if (respuesta1.length()==0) {
    System.out.println("Actualizado");
    }else{
    System.out.println("Error" + respuesta1);
    }
    }
    }
    
