/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Dominios;
import modelo.Lista;
import modelo.Servidor;

/**
 *
 * @author Jsierra
 */
public class DominiosDAO {
   
    
     public Dominios ConsultarDominio (String idDominios){
            Dominios miDominio = null;
            Conexion miConexion = new Conexion();
            Connection nuevaconn;
            nuevaconn = miConexion.getConn();
            try{
            Statement sentencia = nuevaconn.createStatement();
            String querySQL = "select * from Dominios where idDominios="
                    +idDominios;
            ResultSet rs = sentencia.executeQuery(querySQL);
            while(rs.next()){
            miDominio = new Dominios();
            miDominio.setIdDominios(rs.getInt(1));
            miDominio.setServidores_idServidores(rs.getInt(2));
            miDominio.setDominio(rs.getInt(3));
            miDominio.setNombreAplicacion(rs.getString(4));
            miDominio.setNombreCampaña(rs.getString(5));
            
            }
            return miDominio;
            }catch(Exception ex){
            System.out.println(ex.getMessage());
            return miDominio;
            }
            }
    
    
    public ArrayList <Dominios> ConsultarListadoDominios (String criterio) { 
        ArrayList <Dominios> miListadoDominios = new ArrayList <Dominios> ();
        Dominios dominios;
        
        Conexion miConexion = new Conexion ();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        try { 
            Statement sentencia = nuevaCon.createStatement ();
            /*like '"%%"' para buscar registros iguaes en la BD*/
            String querySQL = " SELECT * " + "FROM Dominios where idDominios="+criterio; 
            ResultSet rs = sentencia.executeQuery(querySQL); 
            while (rs.next()) {
       
                dominios = new Dominios (); 
                dominios.setIdDominios(rs.getInt(1));
                dominios.setServidores_idServidores(rs.getInt(2));
                dominios.setDominio(rs.getInt(3));
                dominios.setNombreAplicacion(rs.getString(4));
                dominios.setNombreCampaña(rs.getString(5));
                
                miListadoDominios.add(dominios);
            } 
            return miListadoDominios; 
        } catch (Exception ex ){ 
            System.out.println("Error en la consulta de listado dominios "+ ex.getMessage());
        return miListadoDominios;    
        }
        
    }
    
}
