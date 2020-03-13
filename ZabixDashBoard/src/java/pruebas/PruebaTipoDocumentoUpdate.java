/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.TipoDocumentoDAO;
import java.util.Scanner;
import modelo.TipoDocumento;

/**
 *
 * @author Jhoan Torres
 */
public class PruebaTipoDocumentoUpdate {

 public static void main(String[] args){
Scanner Leer = new Scanner(System.in);
TipoDocumentoDAO TipoDocumentoDAO = new TipoDocumentoDAO();
TipoDocumento mitipodocumento = new TipoDocumento();
String Descripcion;
System.out.println("Por favor ingrese la descripcion a modificar");
Descripcion = Leer.nextLine();
mitipodocumento.setDescripcion(Descripcion);
mitipodocumento.setIdTipo(1);
String respuesta1 = TipoDocumentoDAO.ActualizarTipoDocumento(mitipodocumento);
if (respuesta1.length()==0) {
System.out.println("Actualizado");
}else{
System.out.println("Error" + respuesta1);
}
}

}
