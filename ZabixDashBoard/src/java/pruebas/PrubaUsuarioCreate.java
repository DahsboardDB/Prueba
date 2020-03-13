
package pruebas;


import controlador.UsuarioDAO;
import java.util.Scanner;
import modelo.Usuarios;

//* PENDIENTE PRUEBA */

public class PrubaUsuarioCreate {


    public static void main(String[] args) {

        UsuarioDAO usuarioDao = new UsuarioDAO();
        Usuarios miusuario = new Usuarios();
        
        Scanner Leer = new Scanner(System.in);
        
        String Nombres;
        String Apellidos;
        String UserNameUsuario;
        String Contraseña ;
        String Tipo_idTipoDocumento ="";
        int Tipo_idTipoDocumentoR;
        String Identificacion ="";
        String Perfil_idPerfil ="";
        int Perfil_idPerfilR;

        
        
        System.out.println("Por favor ingrese su nombre");
        Nombres = Leer.next ();
        miusuario.setNombres(Nombres);
        
        System.out.println("Por favor ingrese su apellido");
        Apellidos = Leer.next ();
        miusuario.setApellidos(Apellidos);
        
        System.out.println("Por favor ingrese su username");
        UserNameUsuario = Leer.next ();
        miusuario.setUserNameUsuario(UserNameUsuario);
        
        System.out.println("Por favor ingrese su contraseña");
        Contraseña = Leer.next ();
        miusuario.setContraseña(Contraseña);
        
        System.out.println("Por favor ingrese su tipo de documento");
        Tipo_idTipoDocumento = Leer.next ();
        Tipo_idTipoDocumentoR = Integer.parseInt(Tipo_idTipoDocumento);
        miusuario.setTipoDocumento_idTipoDocumento(Tipo_idTipoDocumentoR);
        
        System.out.println("Por favor ingrese su numero de identificacion");
        Identificacion = Leer.next ();
        //IdentificacionR = Integer.parseInt(Identificacion);
        miusuario.setIdentificacion(Identificacion);
        
        System.out.println("Por favor ingrese el rol");
        Perfil_idPerfil = Leer.next ();
        Perfil_idPerfilR = Integer.parseInt(Perfil_idPerfil);
        miusuario.setPerfil_idPerfil(Perfil_idPerfilR);
 
       
        String respuesta = usuarioDao.adicionarUsuario (miusuario);
        if (respuesta.length() == 0){
            System.out.println("usuario registrada");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}
