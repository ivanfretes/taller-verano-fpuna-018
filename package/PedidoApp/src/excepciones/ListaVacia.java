package excepciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivan
 */
public class ListaVacia extends Exception {

    /**
     * Creates a new instance of <code>ListaVacia</code> without detail message.
     */
    public ListaVacia() {
    }

    /**
     * Constructs an instance of <code>ListaVacia</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ListaVacia(String msg) {
        super(msg);
    }
}
