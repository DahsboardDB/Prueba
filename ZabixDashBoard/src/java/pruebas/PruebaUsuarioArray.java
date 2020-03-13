/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.UsuarioDAO;
import static java.lang.System.out;
import java.util.ArrayList;
import modelo.Usuarios;

/**
 *
 * @author Diego Galvis
 */
public class PruebaUsuarioArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UsuarioDAO usuarioDao = new UsuarioDAO();
        ArrayList<Usuarios> miListaUsuario= new ArrayList<Usuarios>();
        miListaUsuario = usuarioDao.ConsultarListadoUsuario("");
        int size = miListaUsuario.size();
        out.println("<table border=\"1\"><tr><td>IdVendedor</td><td>NombreVendedor</td><td>ApellidoVendedor</td><td>DireccionVendedor</td><td>UserNameVendedor</td><td>Contraseña</td><td>TipoId_IdTipo</td><td>Identificacion</td><td>Rol_IdRol</td><td>Estado</td></tr>");
        for(Usuarios p : miListaUsuario){
        out.println("<tr>");
        out.println("<td>" + p.getIdUsuarios()+ "</td>");
        out.println("<td>" + p.getNombres()+ "</td>");
        out.println("<td>" + p.getApellidos()+ "</td>");
        out.println("<td>" + p.getUserNameUsuario()+ "</td>");
        out.println("<td>" + p.getContraseña()+ "</td>");
        out.println("<td>" + p.getTipoDocumento_idTipoDocumento()+ "</td>");
        out.println("<td>" + p.getIdentificacion()+ "</td>");
        out.println("<td>" + p.getPerfil_idPerfil()+ "</td>");
        out.println("</tr>");
        }
        out.println("</table>");
        }
    }
    

