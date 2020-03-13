/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.TipoDocumentoDAO;
import java.util.Scanner;
import modelo.TipoDocumento;

/**
 *
 * @author APRENDIZ
 */
public class PruebaTipoDocumento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        TipoDocumentoDAO rolDao = new TipoDocumentoDAO();
        TipoDocumento misdocumentos = new TipoDocumento();
        
        Scanner Leer = new Scanner(System.in);
        
        String Descripcion = "";
        
        System.out.println("Por favor ingrese la descripcion del documento");
        Descripcion = Leer.next ();
        misdocumentos.setDescripcion(Descripcion);
        misdocumentos.setEstado("Act");
        String respuesta = rolDao.adicionarTipoDocumento(misdocumentos);
        if (respuesta.length() == 0){
            System.out.println("Tipo de documento registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    
    }
    
}
