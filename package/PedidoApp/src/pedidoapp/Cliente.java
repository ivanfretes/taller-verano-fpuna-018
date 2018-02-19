/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidoapp;

/**
 *
 * @author ivan
 */
public class Cliente {
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected String telefono; // (021) 
    protected int cedula;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Cliente(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String a) {
       apellido = a;
    }
    
    
    
}
