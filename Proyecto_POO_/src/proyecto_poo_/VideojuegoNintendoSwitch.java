/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo_;

/**
 *
 * @author Pavilion
 */
public class VideojuegoNintendoSwitch extends Videojuego{
    
    public VideojuegoNintendoSwitch(String nombre, double precio, String exclusividad) {
        setNombre(nombre);
        setPrecio (precio);
        setExclusividad(exclusividad);
    }
}
