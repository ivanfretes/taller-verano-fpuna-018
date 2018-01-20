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
public class Producto {
    protected int precio_venta;
    protected String nombre;
    protected int precio_costo;

    public Producto(int precio_venta, String nombre, int precio_costo) {
        this.precio_venta = precio_venta;
        this.nombre = nombre;
        this.precio_costo = precio_costo;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    
    public int getPrecioVenta(){
        return this.precio_venta;
    }
    
   
}
