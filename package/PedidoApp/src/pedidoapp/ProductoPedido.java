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
public class ProductoPedido {
    protected Producto producto;
    protected int cant_producto;
    protected int monto_por_cantidad;
    protected int precio_unit;

    public ProductoPedido(Producto producto, int cant_producto) {
        this.producto = producto;
        this.cant_producto = cant_producto;
        precio_unit = this.producto.precio_venta;
        this.calcular_monto_por_cantidad();
    }

    ProductoPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public int calcular_monto_por_cantidad(){
        monto_por_cantidad = precio_unit * this.cant_producto;
        return monto_por_cantidad;
    }
    
    
    public Producto getProducto(){
        return this.producto;
    }

    @Override
    public String toString() {
        return "" + cant_producto  + " " + precio_unit + " " + this.producto.getNombre() + " " + monto_por_cantidad;
    }
    
    
    
}
