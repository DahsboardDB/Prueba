/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Servidor;

/**
 *
 * @author jsierra
 */
public class ServidorDAO {
    
       public Servidor ConsultarServidor (String Servidor){
            Servidor miServidor = null;
            Conexion miConexion = new Conexion();
            Connection nuevaconn;
            nuevaconn = miConexion.getConn();
            try{
            Statement sentencia = nuevaconn.createStatement();
            String querySQL = "select * from Servidores where Servidor="
                    +Servidor;
            ResultSet rs = sentencia.executeQuery(querySQL);
            while(rs.next()){
            miServidor = new Servidor();
            miServidor.setIdServidores(rs.getInt(1));
            miServidor.setServidor(Servidor);
            
            }
            return miServidor;
            }catch(Exception ex){
            System.out.println(ex.getMessage());
            return miServidor;
            }
            }
    
     public ArrayList<Servidor> ConsultarListadoServidor(String criterio) {
        ArrayList<Servidor> miListadoServidor = new ArrayList<Servidor>();
        Servidor servidor;
        

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        try {
        Statement sentencia = nuevaCon.createStatement();

        String querySQL = " SELECT * " + " FROM Servidores where idServidores="+ criterio;
        ResultSet rs = sentencia.executeQuery(querySQL);
        while (rs.next()) {
            // Asignamos los resultados de la busqueda al objeto que se va a retornar.
        servidor = new Servidor();
        servidor.setIdServidores(rs.getInt(1));
        servidor.setServidor(rs.getString(2));
        
        miListadoServidor.add(servidor);
        }
        return miListadoServidor;
        } catch (Exception ex) {
        System.out.println("Error en consulta de listado usuarios: " + ex.getMessage());
        return miListadoServidor;
        }
    }
    
}
