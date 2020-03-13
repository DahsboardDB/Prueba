
package pruebas;

import controlador.TipoDocumentoDAO;
import static java.lang.System.out;
import java.util.ArrayList;
import modelo.TipoDocumento;

/**
 *
 * @author Jhoan Torres
 */
public class PruebaTipoDocumentoArray {

    public static void main(String[] args) {

        TipoDocumentoDAO tipodocumentoDao = new TipoDocumentoDAO();
        ArrayList<TipoDocumento> miListadoTipoDocumento= new ArrayList<TipoDocumento>();
        miListadoTipoDocumento = tipodocumentoDao.consultarListadoTipoDocumento("");
        int size = miListadoTipoDocumento.size();
        out.println("<table border=\"1\"><tr><td>IdTipo</td><td>Descripcion</td></tr>");
        for(TipoDocumento p : miListadoTipoDocumento){
        out.println("<tr>");
        out.println("<td>" + p.getIdTipo()+ "</td>");
        out.println("<td>" + p.getDescripcion()+ "</td>");
        out.println("</tr>");
        }
        out.println("</table>");
        }
    
}
