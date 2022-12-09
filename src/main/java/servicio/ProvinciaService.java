/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Provincia;

/**
 *
 * @author USUARIO
 */
public interface ProvinciaService {
    
    public void crear(Provincia provincia);

    public List<Provincia> listar();
    
}
