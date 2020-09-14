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
public class Consola {
    private String nombre;
    private String compañiaDeFabricacion;
    private String complemento;
    private double precio;

    public Consola() {
        
    }
    
    public Consola(String nombre, String compañiaFabricacion, String complemento, double precio){
        this.nombre = nombre;
        this.compañiaDeFabricacion = compañiaFabricacion;
        this.complemento = complemento;
        this.precio = precio;
    }
    
    public Consola(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompañiaDeFabricacion() {
        return compañiaDeFabricacion;
    }

    public void setCompañiaDeFabricacion(String compañiaDeFabricacion) {
        this.compañiaDeFabricacion = compañiaDeFabricacion;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
  
}