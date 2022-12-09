/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Canton;

/**
 *
 * @author USUARIO
 */
public class CantonServiceImpl implements CantonService {
    
     private static List<Canton> cantonList;

    public CantonServiceImpl() {
        cantonList = new ArrayList<>();
    }

    @Override
    public void crear(Canton canton) {
        this.cantonList.add(canton);
    }

    @Override
    public List<Canton> listar() {
        return this.cantonList;
    }
    
}
