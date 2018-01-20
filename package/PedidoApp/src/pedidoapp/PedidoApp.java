/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidoapp;

import java.lang.reflect.Array;
import java.util.Date;

public class PedidoApp {
    Cliente[] cliente_list = new Cliente[10];
    Producto[] producto_list = new Producto[5];
    Pedido[] pedido_list = new Pedido[100000000];
    ProductoPedido[] producto_pedido;
    
    public PedidoApp() { 
        // creamos el listado de clientes
        
        this.crear_clientes();
        this.cliente_list[5].setNombre("Juan");
        
        // creamos el listado de product
        this.producto_list[0] = new Producto(1000, "Lavandina", 850);
        this.producto_list[1] = new Producto(10000, "OMO JABON", 7000);
        this.producto_list[2] = new Producto(8000, "AYUDIN", 6000);
        this.producto_list[3] = new Producto(95000, "DETERGENTE", 60000);
        this.producto_list[4] = new Producto(5000, "CEPILLO DE ROPA", 4500);
        
        ProductoPedido p = this.crea_pedido_producto(
            this.producto_list[3], 
            5
        );
        
        
        // Crear un pedido
        this.pedido_list[0] = new Pedido(
                new Date(),
                this.cliente_list[5], // Juan
                p
        );
        
        System.out.println(
                this.pedido_list[0].getProducto().calcular_monto_por_cantidad()
        );
        // imprimimos los clientes creados
        //this.imprimir_clientes();
        
    }
    
    
   
    public static void main(String[] args) {
        new PedidoApp();
    }
    
    
    
    // Crea clientes
    private void crear_clientes(){
        
        for (int i = 0; i < this.cliente_list.length; i++) {
            this.cliente_list[i]= new Cliente("", "");
        }
    }
    
    
    // imprimir clientes
    private void imprimir_clientes(){
        
        for (int i = 0; i < this.cliente_list.length; i++) {
            System.out.println(this.cliente_list[i].getNombre());
        }
    }
    
    
    // Generar un pedido de productos
    private ProductoPedido crea_pedido_producto(Producto producto, int cant){
        ProductoPedido p = new ProductoPedido(producto,cant);
        return p;
    }
    
    
}

