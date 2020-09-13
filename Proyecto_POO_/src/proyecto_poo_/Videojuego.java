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
public class Videojuego{
    private String nombre;
    private double precio;
    private String exclusividad;

    public Videojuego() {
    }

    public Videojuego(String nombre, double precio, String exclusividad) {
        this.nombre = nombre;
        this.precio = precio;
        this.exclusividad = exclusividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getExclusividad() {
        return exclusividad;
    }

    public void setExclusividad(String exclusividad) {
        this.exclusividad = exclusividad;
    }
    
    public void visualizarJuegos(){
        
    }
    
    public boolean esExclusivo(){
        boolean esExclusivo;
        if(this.exclusividad.equals("Si")){
            esExclusivo = true;
        }else{
            esExclusivo = false;
        }
        return esExclusivo;
    }
    
    public void agregarDescuento(){
        this.precio = this.precio*0.7;
    }
}
