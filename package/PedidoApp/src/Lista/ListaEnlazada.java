package Lista;

import excepciones.ListaVacia;

/**
 *
 * @author ivan
 */
public class ListaEnlazada<G> {
    //Nodo lista;
    protected int tamanho;
    Nodo ultimo; // ultimo en ser insertado

    public ListaEnlazada(){
        //this.crear_lista();
    }
    
    public void crear_lista(){
        this.tamanho = 0;
    }
    
    
    public void eliminar_nodo(G dato){
        
    }
    
    
    public void insertar_nodo(int pos){
        
    }
    
    
    // el primero en insertar
    public void insertar_nodo(G dato){
        Nodo<G> aux = new Nodo<G>(dato);
        
        if (this.esVacia()){
            this.ultimo = aux;
        }
        else {
            aux.siguiente = ultimo;
            ultimo = aux;
        }
        this.tamanho++;
    }
    
    // Lista los elementos
    public void listar(){
        Nodo aux;
        Nodo tmp = this.ultimo;
        do{
            System.out.println(tmp.dato);    
            tmp = tmp.siguiente;
        }
        while(tmp != null);
    }
    
    // Retorna la posicion del dato encontrado
    public int consultar(G dato){
        int count_nodo = 0;
        do{
            count_nodo++;
            if (this.ultimo.dato.equals(dato)){
                return count_nodo;
            } 
            
            this.ultimo = this.ultimo.siguiente;
        }
        while(this.ultimo != null);  
        return -1;
    }
    
    
    // Devuelve si la lista esta vacia
    public boolean esVacia(){
        return 0 == this.tamanho;
    }
}
