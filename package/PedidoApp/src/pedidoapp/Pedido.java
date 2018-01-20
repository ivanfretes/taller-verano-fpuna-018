/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidoapp;

import java.util.Date;

/**
 *
 * @author ivan
 */
public class Pedido {
    protected Date fecha;
    protected Cliente cliente_data;
    protected ProductoPedido producto_pedido_list;// atributo del objeto

    public Pedido(Date fecha, Cliente cliente_data, ProductoPedido pl) {
        this.fecha = fecha;
        this.cliente_data = cliente_data;
        this.producto_pedido_list = pl;
    }

    public Pedido() {
    }
    
    public ProductoPedido getProducto(){
        return this.producto_pedido_list;
    }
    
}
