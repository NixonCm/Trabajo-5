/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Pais;
import servicio.PaisServiceImpl;

/**
 *
 * @author USUARIO
 */
public class PaisControl {
    
    private PaisServiceImpl paisServiceImpl;

    public PaisControl(){
        paisServiceImpl = new PaisServiceImpl();
    }

    public void crear(String [] data){
        var nroProvincia=Integer.valueOf(data[0]).intValue();
        var capital=Integer.valueOf(data[1]).intValue();
        var presidente=data[2];
        var continente=data[3];
        var nombre=data[4];
        var pais=new Pais(nroProvincia, capital, presidente, continente, nombre);
        this.paisServiceImpl.crear(pais);
    }
    public List<Pais> listar(){
        return this.paisServiceImpl.listar();

    }
    
}
