/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Usuarios;


/**
 *
 * @author usr
 */
public class UsuarioDAO {
    
   public String adicionarUsuario(Usuarios usuario){
       
       String miRespuesta;
       Conexion miConexion = new Conexion();
       Connection nuevaConn;
       nuevaConn = miConexion.getConn();
       
       PreparedStatement sentencia;
       try {
           String Query = "INSERT INTO Usuarios (Nombres, Apellidos, UserNameUsuario, Contraseña, TipoDocumento_idTipoDocumento, Identificacion, Perfil_idPerfil) " 
                   + "VALUES (?,?,?,?,?,?,?)";
       sentencia = nuevaConn.prepareStatement(Query);
       sentencia.setString(1, usuario.getNombres());
       sentencia.setString (2, usuario.getApellidos());
       sentencia.setString (3, usuario.getUserNameUsuario());
       sentencia.setString (4, usuario.getContraseña());
       sentencia.setInt (5, usuario.getTipoDocumento_idTipoDocumento());
       sentencia.setString (6, usuario.getIdentificacion());
       sentencia.setInt(7, usuario.getPerfil_idPerfil());
       sentencia.execute();
       miRespuesta = "";
       } catch (Exception ex){
           miRespuesta = ex.getMessage();
           System.err.println("Ocurrio un problema en UsuarioDAO/n" + ex.getMessage());
       }
       return miRespuesta;
   }
   
       public String ActualizarUsuario(Usuarios usuario) {
        String mirespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaconn;
        nuevaconn = miConexion.getConn();
        PreparedStatement sentencia;
        try{
        String Query ="update Usuarios set NombreUsuario=?, ApellidoUsuario=?, DireccionUsuario=?, UserNameUsuario=?, Contraseña=?, TipoDocumento_IdTipo=?, Identificacion=?, Rol_IdRol=?, Estado=? where IdUsuario=?";
        sentencia = nuevaconn.prepareStatement(Query);
       sentencia.setString(1, usuario.getNombres());
       sentencia.setString (2, usuario.getApellidos());
       sentencia.setString (3, usuario.getUserNameUsuario());
       sentencia.setString (4, usuario.getContraseña());
       sentencia.setInt (5, usuario.getTipoDocumento_idTipoDocumento());
       sentencia.setString (6, usuario.getIdentificacion());
       sentencia.setInt(7, usuario.getPerfil_idPerfil());
       sentencia.setInt(10, usuario.getIdUsuarios());
        sentencia.executeUpdate();
        mirespuesta ="";
        }catch(Exception ex){
        mirespuesta = ex.getMessage();
        System.err.println("Ocurrio un error en Usuario\n" + ex.getMessage());
        }
        return mirespuesta;
        }

    public Usuarios ConsultarUsuario(int Identificacion){
            Usuarios miusuario = null;
            Conexion miConexion = new Conexion();
            Connection nuevaconn;
            nuevaconn = miConexion.getConn();
            try{
            Statement sentencia = nuevaconn.createStatement();
            String querySQL = "select * from Usuarios where Identificacion="
                    +Identificacion;
            ResultSet rs = sentencia.executeQuery(querySQL);
            while(rs.next()){
            miusuario = new Usuarios();
            miusuario.setIdUsuarios(rs.getInt(1));
            miusuario.setNombres(rs.getString(2));
            miusuario.setApellidos(rs.getString(3));
            miusuario.setUserNameUsuario(rs.getString(4));
            miusuario.setContraseña(rs.getString(5));
            miusuario.setTipoDocumento_idTipoDocumento(rs.getInt(6));
            miusuario.setIdentificacion(rs.getString(7));
            miusuario.setPerfil_idPerfil(rs.getInt(8));            

            }
            return miusuario;
            }catch(Exception ex){
            System.out.println(ex.getMessage());
            return miusuario;
            }
            }
    
    public String DeleteUsuario(Usuarios usuario) {
            String miRespuesta;
            Conexion miConexion = new Conexion();
            Connection nuevaCon;
            nuevaCon = miConexion.getConn();
            PreparedStatement sentencia;
            try{
            String Query = " delete from Usuario where Nombres = ? and Usuario =? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, usuario.getIdUsuarios());
            sentencia.execute();
            miRespuesta = "";
            }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en UsuarioDAO.DeleteUsuario" +
    ex.getMessage());
}
return miRespuesta;
}
    public ArrayList<Usuarios> ConsultarListadoUsuario(String criterio) {
        ArrayList<Usuarios> miListadoUsuario = new ArrayList<Usuarios>();
        Usuarios usuarios;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        try {
        Statement sentencia = nuevaCon.createStatement();

        String querySQL = " SELECT IdUsuarios,Nombres,Apellidos,UserNameUsuario,Contraseña,TipoDocumento_idTipoDocumento,Identificacion,Perfil_idPerfil" + " FROM Usuarios where NombreUsuario like '%"+ criterio +"%' ORDER BY NombreUsuario;";
        ResultSet rs = sentencia.executeQuery(querySQL);
        while (rs.next()) {
            // Asignamos los resultados de la busqueda al objeto que se va a retornar.
        usuarios = new Usuarios();
        usuarios.setIdUsuarios(rs.getInt(1));
        usuarios.setNombres(rs.getString(2));
        usuarios.setApellidos(rs.getString(3));
        usuarios.setUserNameUsuario(rs.getString(4));
        usuarios.setContraseña(rs.getString(5));
        usuarios.setTipoDocumento_idTipoDocumento(rs.getInt(6));
        usuarios.setIdentificacion(rs.getString(7));
        usuarios.setPerfil_idPerfil(rs.getInt(8));
        
        miListadoUsuario.add(usuarios);
        }
        return miListadoUsuario;
        } catch (Exception ex) {
        System.out.println("Error en consulta de listado usuarios: " + ex.getMessage());
        return miListadoUsuario;
        }
    }
}
    
    
    
