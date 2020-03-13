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
import modelo.Perfil;

/**
 *
 * @author APRENDIZ
 */
public class PerfilDAO {
    public String adicionarPerfil(Perfil perfil){
       
       String miRespuesta;
       Conexion miConexion = new Conexion();
       Connection nuevaCon;
       nuevaCon = miConexion.getConn();
       
       PreparedStatement sentencia;
       try {
           String Query = "INSERT INTO Perfil (DescripcionPerfil) " 
                   + "VALUES (?)";
       sentencia = nuevaCon.prepareStatement(Query);
       sentencia.setString(1, perfil.getDescripcionPerfil());
       sentencia.execute();
       miRespuesta = "";
       } catch (Exception ex){
           miRespuesta = ex.getMessage();
           System.err.println("Ocurrio un problema en RolDAO/n" + ex.getMessage());
       }
       return miRespuesta;
   }
     public String ActualizarPerfil(Perfil miperfil) {
        String mirespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaconn;
        nuevaconn = miConexion.getConn();
        PreparedStatement sentencia;
        try{
        String Query ="update Perfil set Descripcionperfil=? where Idperfil=?";
        sentencia = nuevaconn.prepareStatement(Query);
        sentencia.setString(1, miperfil.getDescripcionPerfil());
        sentencia.setInt(2, miperfil.getIdPerfil());
        sentencia.executeUpdate();
        mirespuesta ="";
        }catch(Exception ex){
        mirespuesta = ex.getMessage();
        System.err.println("Ocurrio un error en roles\n" + ex.getMessage());
        }
        return mirespuesta;
        }

    public Perfil ConsultarPerfil(String IdPerfil){
        Perfil perfil = null;
        Conexion miConexion = new Conexion();
        Connection nuevaconn;
        nuevaconn = miConexion.getConn();
        try{
        Statement sentencia = nuevaconn.createStatement();
        String querySQL = "select IdPerfil, DescripcionPerfil from Perfil where IdPerfil = '" + IdPerfil +"'"; 
        ResultSet rs = sentencia.executeQuery(querySQL);
        while(rs.next()){
        perfil = new Perfil();
        perfil.setIdPerfil(rs.getInt(1));
        perfil.setDescripcionPerfil(rs.getString(2));
                }
        return perfil;
        }catch(Exception ex){
        System.out.println(ex.getMessage());
        return perfil;
        }
    }
    public String DeletePerfil(Perfil perfil) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;
        try{
        String Query = " delete from Perfil where DescripcionPerfil = ? and IdPerfil =? ;";
        sentencia = nuevaCon.prepareStatement(Query);
        sentencia.setString(1, perfil.getDescripcionPerfil());
        sentencia.setInt(2, perfil.getIdPerfil());
        sentencia.execute();
        miRespuesta = "";
        }catch(Exception ex){
        miRespuesta = ex.getMessage();
        System.err.println("Ocurrio un error en PerfilDAO.DeletePerfil" +
        ex.getMessage());
        }
        return miRespuesta;
        }
    public ArrayList<Perfil> consultarListadoPerfil(String criterio) {
        ArrayList<Perfil> miListadoperfil = new ArrayList<Perfil>();
        Perfil perfil;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        try {
        Statement sentencia = nuevaCon.createStatement(); 
        String querySQL = " SELECT IdPerfil,DescripcionPerfil " + " FROM Perfil where DescripcionPerfil like '%"+ criterio +"%' ORDER BY DescripcionPerfil;";
        ResultSet rs = sentencia.executeQuery(querySQL);
        while (rs.next()) {
        perfil = new Perfil();
        perfil.setIdPerfil(rs.getInt(1));
        perfil.setDescripcionPerfil(rs.getString(2));
        miListadoperfil.add(perfil);
        }
        return miListadoperfil;
        } catch (Exception ex) {
        System.out.println("Error Consultar Listado Perfil: " + ex.getMessage());
        return miListadoperfil;
        }
    }  
}
