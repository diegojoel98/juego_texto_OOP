
package org.publico.Classes;
// ABSTRACT BUILDER
/**
 *
 * @author Diego
 */
public abstract class JuegoBuilder {
    protected Juego Juego;
    
    public void crearNuevoJuego() { 
        Juego = new Juego(); 
    }
    
    public abstract void empezarJuego();
    abstract void eleccion();
}
