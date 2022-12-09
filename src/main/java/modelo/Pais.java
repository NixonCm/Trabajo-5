/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Pais {
    
    private int nroProvincias;
    private String capital;
    private String presidente;
    private String continente;
    private String nombre;

    public Pais(int nroProvincias, String capital, String presidente,String continente,String nombre) {
        this.nroProvincias = nroProvincias;
        this.capital = capital;
        this.presidente = presidente;
        this.continente = continente;
        this.nroProvincias = nroProvincias;
    }

    public Pais(int nroProvincia, int capital, String presidente, String continente, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNroProvincias() {
        return nroProvincias;
    }

    public String getCapital() {
        return capital;
    }

    public String getPresidente() {
        return presidente;
    }

    public String getContinente() {
        return continente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNroProvincias(int nroProvincias) {
        this.nroProvincias = nroProvincias;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" + "nroProvincias=" + nroProvincias + ", capital=" + capital + ", presidente=" + presidente + ", continente=" + continente + ", nombre=" + nombre + '}';
    }
    
}
