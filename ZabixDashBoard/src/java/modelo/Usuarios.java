/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usr
 */
public class Usuarios {
    
   private int idUsuarios;
   private String Nombres;
   private String Apellidos;
   private String UserNameUsuario;
   private String Contraseña;
   private int TipoDocumento_idTipoDocumento;
   private String Identificacion;
   private int Perfil_idPerfil;
    

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getUserNameUsuario() {
        return UserNameUsuario;
    }

    public void setUserNameUsuario(String UserNameUsuario) {
        this.UserNameUsuario = UserNameUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getTipoDocumento_idTipoDocumento() {
        return TipoDocumento_idTipoDocumento;
    }

    public void setTipoDocumento_idTipoDocumento(int TipoDocumento_idTipoDocumento) {
        this.TipoDocumento_idTipoDocumento = TipoDocumento_idTipoDocumento;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public int getPerfil_idPerfil() {
        return Perfil_idPerfil;
    }

    public void setPerfil_idPerfil(int Perfil_idPerfil) {
        this.Perfil_idPerfil = Perfil_idPerfil;
    }
    

   

}
