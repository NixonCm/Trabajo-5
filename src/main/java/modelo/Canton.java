/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Canton {
    
    private String nombre;
    private double expancionTerritorial;
    private double nroHabitantes;
    private Provincia provincia;

public Canton(String nombre, double expancionTerritorial, double nroHabitantes, Pais pais, Provincia provincia) {
        this.nombre = nombre;
        this.expancionTerritorial = expancionTerritorial;
        this.nroHabitantes = nroHabitantes;
        this.provincia = provincia;
    }

    public Canton(String nombre, int expancionTerritorial, String nroHabitantes, String provincia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Canton(String nombre, int expancionTerritorial, int nroHabitantes, String provincia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Canton(String nombre, int expancionTerritorial, int nroHabitantes, String pais, String provincia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExpancionTerritorial() {
        return expancionTerritorial;
    }

    public void setExpancionTerritorial(double expancionTerritorial) {
        this.expancionTerritorial = expancionTerritorial;
    }

    public double getNroHabitantes() {
        return nroHabitantes;
    }

    public void setNroHabitantes(double nroHabitantes) {
        this.nroHabitantes = nroHabitantes;
    }


    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Canton{" + "nombre=" + nombre + ", expancionTerritorial=" + expancionTerritorial + ", nroHabitantes=" + nroHabitantes + ", provincia=" + provincia + '}';
    }

    
}
