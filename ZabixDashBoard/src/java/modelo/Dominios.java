/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jsierra
 */
public class Dominios {

    private int idDominios;
    private int Servidores_idServidores;
    private int Dominio;
    private String NombreAplicacion;
    private String NombreCampaña;

    
    
    public int getIdDominios() {
        return idDominios;
    }

    public void setIdDominios(int idDominios) {
        this.idDominios = idDominios;
    }

    public int getServidores_idServidores() {
        return Servidores_idServidores;
    }

    public void setServidores_idServidores(int Servidores_idServidores) {
        this.Servidores_idServidores = Servidores_idServidores;
    }

    public int getDominio() {
        return Dominio;
    }

    public void setDominio(int Dominio) {
        this.Dominio = Dominio;
    }

    public String getNombreAplicacion() {
        return NombreAplicacion;
    }

    public void setNombreAplicacion(String NombreAplicacion) {
        this.NombreAplicacion = NombreAplicacion;
    }

    public String getNombreCampaña() {
        return NombreCampaña;
    }

    public void setNombreCampaña(String NombreCampaña) {
        this.NombreCampaña = NombreCampaña;
    }
    

   
    
}
