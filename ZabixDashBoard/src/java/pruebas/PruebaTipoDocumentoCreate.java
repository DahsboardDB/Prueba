/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.TipoDocumentoDAO;
import java.util.Scanner;
import modelo.TipoDocumento;


public class PruebaTipoDocumentoCreate {

 
    public static void main(String[] args) {
         
        TipoDocumentoDAO tipodocumentoDao = new TipoDocumentoDAO ();
        TipoDocumento mitipodocumento = new TipoDocumento ();
        Scanner Leer = new Scanner (System.in);
        String Descripcion = "";
        System.out.println("Por favor ingrese la descripcion del tipo de documento");
        Descripcion = Leer.next();
        mitipodocumento.setDescripcion(Descripcion);
        mitipodocumento.setEstado("Act");
        String respuesta = tipodocumentoDao.adicionarTipoDocumento(mitipodocumento);
        if (respuesta.length() == 0){
            System.out.println("Tipo de documento registrado");
        } else{
            System.out.println("Error" + respuesta);
        }
    }
    
}
