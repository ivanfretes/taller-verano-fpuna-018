package Lista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivan
 */
public class ListaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ListaEnlazada<String> l = new ListaEnlazada<String>();
        l.crear_lista();
        //l.listar();
        
        l.insertar_nodo("Juan");
        l.insertar_nodo("Benitez");
        l.insertar_nodo("Veron");
        l.insertar_nodo("Demo");
        l.insertar_nodo("Test");
        l.insertar_nodo("2");
        l.insertar_nodo("1");
        l.insertar_nodo("2");
        l.insertar_nodo("3");
        l.insertar_nodo("87");
        l.insertar_nodo("Ya es tarde");
        
        l.listar();
        
        System.out.println("------------------------------------------");
        
        
        System.out.println(l.consultar("2"));
    }
    
}
