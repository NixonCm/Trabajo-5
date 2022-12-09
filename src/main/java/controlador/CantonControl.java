/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Canton;
import servicio.CantonServiceImpl;

/**
 *
 * @author USUARIO
 */
public class CantonControl {
    
    private CantonServiceImpl cantonServiceImpl;

    public CantonControl(){
        cantonServiceImpl = new CantonServiceImpl();
    }

    public void crear(String [] data){
        var nombre=data[0];
        var expancionTerritorial=Integer.valueOf(data[1]).intValue();//double
        var nroHabitantes=Integer.valueOf(data[2]).intValue();//double
        var pais=data[3];
        var provincia=data[4];
        var canton=new Canton(nombre, expancionTerritorial, nroHabitantes, pais, provincia );
        this.cantonServiceImpl.crear(canton);
    }
    public List<Canton> listar(){
        return this.cantonServiceImpl.listar();

    }
    
}
