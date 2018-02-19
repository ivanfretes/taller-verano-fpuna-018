/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidoapp;


import Lista.ListaEnlazada;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PedidoApp {
    Cliente[] cliente_list = new Cliente[10];
    Producto[] producto_list = new Producto[6];
    ListaEnlazada<ProductoPedido> l_pedido_producto = new ListaEnlazada<ProductoPedido>();
    Pedido pedido1;
    
    public PedidoApp() { 
        // creamos el listado de clientes y actualizamos el 6 por Juan

        this.crear_clientes();
        this.cliente_list[5].setNombre("Juan");
        this.cliente_list[5].setApellido("Perez");
        
        // creamos el listado de product
        this.producto_list[0] = new Producto(1000, "Lavandina", 850);       
        this.producto_list[1] = new Producto(10000, "OMO JABON", 7000);
        this.producto_list[2] = new Producto(8000, "AYUDIN", 6000);
        this.producto_list[3] = new Producto(95000, "DETERGENTE", 60000);
        this.producto_list[4] = new Producto(5000, "CEPILLO DE ROPA", 4500);
        this.producto_list[5] = new Producto(8657, "PRODUCTOX", 6789);
        
        /*
        Listado de Pedidos a realizar
        
        */ 
        l_pedido_producto.crear_lista();
        l_pedido_producto.insertar_nodo(
              new ProductoPedido(
                      this.producto_list[0],
                      6
              )
        );
        l_pedido_producto.insertar_nodo(
              new ProductoPedido(
                      this.producto_list[1],
                      3
              )
        );
        l_pedido_producto.insertar_nodo(
              new ProductoPedido(
                      this.producto_list[3],
                      8
              )
        );
        l_pedido_producto.insertar_nodo(
              new ProductoPedido(
                      this.producto_list[3],
                      7
              )
        );
        l_pedido_producto.insertar_nodo(
              new ProductoPedido(
                      this.producto_list[4],
                      5
              )
        );
        
        //l_pedido_producto.listar();
        
        
        // Creamos factura
        this.pedido1 = new Pedido(
                new Date(),
                this.cliente_list[5],
                l_pedido_producto
        );
        
        // Imprimimos datos de la factura
        System.out.println(this.pedido1);
        System.out.println("-----------------------");
        this.pedido1.getProductoPedido();
        
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
    
    
    // Generar un nuevo Pedido
    private void generar_pedido(){
        
    }
    
    // leer opciones desde el teclado
    private int leer_opciones(String msg){
        Scanner s = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println(msg);
            op = s.nextInt();
        }
        while(-1 != op);
        
        
        return op;
    }
    
   
}

