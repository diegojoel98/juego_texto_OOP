// CLASE PRODUCTO Patrón Builder

package org.publico.Classes;

import javax.swing.JOptionPane;
// CLASE ADAPTABLE Patrón Adapter
/**
 *
 * @author Diego
 */
public class Juego extends Main{
    String planetaActual;
    String listaMisiones;
    String nave;
    
    public void empezarJuego()
    {
        JOptionPane.showMessageDialog(null, "Iniciando...\n * Ahora cuentas con: "+ganancias+ " de credito\n * Cuentas con la nave 1\n * Tienes "+armas+" armas y "+ escudos +" escudos, y tu salud es: "+hp+ "");
   
        eleccion();
    }
    
    
    
     void eleccion()
    {
        int op = (Integer.parseInt(JOptionPane.showInputDialog(" - Comenzemos eligiendo un planeta\n 1.- Planeta 1\n 2.- Planeta 2\n 3.- Planeta 3\n   Opcion: ")));
        Planeta p1 = new Planeta();
        while(op <= 0 || op > 3)
        {
            op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: \n 1.- Planeta 1\n 2.- Planeta 2\n 3.- Planeta 3\n   Opcion: ")));
        }
        
        switch(op)
        {
            case 1: p1.planeta1();
            break;
            
            case 2: p1.planeta2();
            break;
            
            case 3: p1.planeta3();
            break;
        }
    }
}
