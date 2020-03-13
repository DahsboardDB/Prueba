/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.TipoDocumento;


public class TipoDocumentoDAO {
    
    public String adicionarTipoDocumento(TipoDocumento tipodocumento){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = "INSERT INTO TipoDocumento (Descripcion)" 
                    + "VALUES (?,?); ";
            sentencia = nuevaCon.prepareStatement (Query);
            sentencia.setString(1, tipodocumento.getDescripcion());
            sentencia.execute ();
            miRespuesta ="";
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en TipoDocumentoDAO/n" + ex.getMessage());    
        }
        return miRespuesta;
    }
    
        public String ActualizarTipoDocumento(TipoDocumento mitipodocumento) {
        String mirespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaconn;
        nuevaconn = miConexion.getConn();
        PreparedStatement sentencia;
        try{
        String Query ="update TipoDocumento set Descripcion=? where IdTipo=?";
        sentencia = nuevaconn.prepareStatement(Query);
        sentencia.setString(1, mitipodocumento.getDescripcion());
        sentencia.setInt(2, mitipodocumento.getIdTipoDocumento());
        sentencia.executeUpdate();
        mirespuesta ="";
        }catch(Exception ex){
        mirespuesta = ex.getMessage();
        System.err.println("Ocurrio un error en Tipo Documento\n" + ex.getMessage());
        }
        return mirespuesta;
        }
        
        
       public TipoDocumento ConsultarTipoDocumento(int idtipodocumento){
        TipoDocumento tipodocumento = null;
        Conexion miConexion = new Conexion();
        Connection nuevaconn;
        nuevaconn = miConexion.getConn();
        try{
        Statement sentencia = nuevaconn.createStatement();
        String querySQL = "SELECT IdTipo, Descripcion FROM TipoDocumento WHERE IdTipo=" + idtipodocumento;
        ResultSet rs = sentencia.executeQuery(querySQL);
        while(rs.next()){
        tipodocumento = new TipoDocumento();
        tipodocumento.setIdTipoDocumento(rs.getInt(1));
        tipodocumento.setDescripcion(rs.getString(2));

        }
        return tipodocumento;
        }catch(Exception ex){
        System.out.println(ex.getMessage());
        return tipodocumento;
        }
        }  
       
    public String DeleteTipoDocumento(TipoDocumento tipodocumento) {
            String miRespuesta;
            Conexion miConexion = new Conexion();
            Connection nuevaCon;
            nuevaCon = miConexion.getConn();
            PreparedStatement sentencia;
            try {
            String Query = " delete from TipoDocumento where Descripcion= ? and IdTipo =? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, tipodocumento.getIdTipoDocumento());
            sentencia.setString(2, tipodocumento.getDescripcion());
            sentencia.execute();
            miRespuesta = "";
            } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en Tipo DocumentoDAO.DeletePermiso" +
            ex.getMessage());
            }
            return miRespuesta;
            
    
        }
    public ArrayList<TipoDocumento> consultarListadoTipoDocumento(String criterio) {
            ArrayList<TipoDocumento> miListadoTipoDocumento = new ArrayList<TipoDocumento>();
            TipoDocumento tipodocumento;
            
            Conexion miConexion = new Conexion();
            Connection nuevaCon;
            nuevaCon = miConexion.getConn();
  
            try {
            Statement sentencia = nuevaCon.createStatement();
            
            String querySQL = " SELECT IdTipoDocumento,Descripcion "+ " FROM TipoDocumento where Descripcion like '%"+ criterio +"%' ORDER BY Descripcion;";
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {

            tipodocumento = new TipoDocumento();
            tipodocumento.setIdTipoDocumento(rs.getInt(1));
            tipodocumento.setDescripcion(rs.getString(2));
            miListadoTipoDocumento.add(tipodocumento);
            }
            return miListadoTipoDocumento;
            } catch (Exception ex) {
            System.out.println("Error Consulta Listado Marca: " + ex.getMessage());
            return miListadoTipoDocumento;
            }
            }

}
