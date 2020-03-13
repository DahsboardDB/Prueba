/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.TipoDocumentoDAO;
import java.util.ArrayList;
import modelo.TipoDocumento;

/**
 *
 * @author Jhoan Torres
 */
public class PruebaTipoDocumentoDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            TipoDocumentoDAO tipodocumentoDao = new TipoDocumentoDAO();
            TipoDocumento tipodocumento = tipodocumentoDao.ConsultarTipoDocumento(1);
            if (tipodocumento != null){
            System.out.println("Descripcion : " + tipodocumento.getDescripcion());
            } else {
            System.out.println("El tipo de documento no existe");
            }
            TipoDocumentoDAO mitipodocumento = new TipoDocumentoDAO();
            ArrayList<TipoDocumento> miListadoTipoDocumento = mitipodocumento. consultarListadoTipoDocumento("");
            for (TipoDocumento T : miListadoTipoDocumento) {
            System.out.println(" Descripcion del tipo de documento : " + T.getDescripcion() + " Id. " + T.getIdTipo());
            }
            System.out.println("SE ELIMINO");
            mitipodocumento.DeleteTipoDocumento(miListadoTipoDocumento.get(0));
            miListadoTipoDocumento = mitipodocumento.consultarListadoTipoDocumento("");
            for (TipoDocumento T : miListadoTipoDocumento) {
            System.out.println(" Descripcion del tipo de documento : " + T.getDescripcion() + " Id. " + T.getIdTipo());
            }
    }
}
