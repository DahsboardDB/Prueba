/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import controlador.TipoDocumentoDAO;
import modelo.TipoDocumento;

/**
 *
 * @author Jhoan Torres
 */
public class PruebaTipoDocumentoSelect {

public static void main(String[] args) {
// TODO code application logic here
TipoDocumentoDAO TipoDocumentoDAO = new TipoDocumentoDAO();
TipoDocumento tipodocumento = TipoDocumentoDAO.ConsultarTipoDocumento(1);
if (tipodocumento != null) {
System.out.println("Encontrado " + tipodocumento.getIdTipo()+". " +
tipodocumento.getDescripcion() + ". " + tipodocumento.getEstado());
}else{
System.out.println("No encontrado");
}
}  
}
