/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Lista;

/**
 *
 * @author jsierra
 */
public class ListaDAO {
    
     public Lista ConsultarLista (String Descripcion){
            Lista miLista = null;
            Conexion miConexion = new Conexion();
            Connection nuevaconn;
            nuevaconn = miConexion.getConn();
            try{
            Statement sentencia = nuevaconn.createStatement();
            String querySQL = "select * from Lista where Descripcion="
                    +Descripcion;
            ResultSet rs = sentencia.executeQuery(querySQL);
            while(rs.next()){
            miLista = new Lista();
            miLista.setIdLista(rs.getInt(1));
            miLista.setDescripcion(rs.getString(2));
            
            }
            return miLista;
            }catch(Exception ex){
            System.out.println(ex.getMessage());
            return miLista;
            }
            }
    
     public ArrayList<Lista> ConsultarListadoLista(String criterio) {
        ArrayList<Lista> miListadoLista = new ArrayList<Lista>();
        Lista lista;
        

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        try {
        Statement sentencia = nuevaCon.createStatement();

        String querySQL = " SELECT * " + " FROM Lista where idLista="+ criterio;
        ResultSet rs = sentencia.executeQuery(querySQL);
        while (rs.next()) {
            // Asignamos los resultados de la busqueda al objeto que se va a retornar.
        lista = new Lista();
        lista.setIdLista(rs.getInt(1));
        lista.setDescripcion(rs.getString(2));
        
        miListadoLista.add(lista);
        }
        return miListadoLista;
        } catch (Exception ex) {
        System.out.println("Error en consulta de listado usuarios: " + ex.getMessage());
        return miListadoLista;
        }
    }
    
    
}

