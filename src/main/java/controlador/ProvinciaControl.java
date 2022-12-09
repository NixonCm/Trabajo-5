/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Provincia;
import servicio.ProvinciaServiceImpl;

/**
 *
 * @author USUARIO
 */
public class ProvinciaControl {
    
    private ProvinciaServiceImpl provinciaServiceImpl;

    public ProvinciaControl(){
        provinciaServiceImpl = new ProvinciaServiceImpl();
    }

    public void crear(String [] data){
        var nombre=data[0];
        var expancionTerritorial=Double.valueOf(data[1]).doubleValue();//double
        var inicioCedula=data[2];
        var pais=data[3];
        var nroHabitantes=Double.valueOf(data[4]).doubleValue();//double
        var provincia=new Provincia(nombre, expancionTerritorial, inicioCedula, pais, nroHabitantes);
        this.provinciaServiceImpl.crear(provincia);
    }
    public List<Provincia> listar(){
        return this.provinciaServiceImpl.listar();

    }

    
}
