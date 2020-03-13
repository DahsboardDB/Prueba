/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author APRENDIZ
 */
public class Conexion {

    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String baseDatos = "base4";
    private String url = "jdbc:mysql://127.0.0.1:3306/" +baseDatos + "?useTimezone=true&serverTimezone=UTC";

    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn == null) {
                System.out.println("No se establecio la conexion" + "/n" + url);
            } else {
                System.out.println("Conexion establecida");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    public Connection getConn() {
        return conn;
    }

}
