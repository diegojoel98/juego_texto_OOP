/*
 * Fase 1 Proyecto POO

Intgrantes: Nicolas Alejandro Baak Poot
	    Diego Joel Gongora Gamboa
	    Pedro Abel Moreno Carvajal
 */
package org.publico.Classes;
// CLASE PRINCIPAL Patrón Builder
import javax.swing.JOptionPane;
// CLASE CLIENTE Patrón Adapter
/**
 *
 * @author Diego
 */
public class Main {
    
   static int ganancias = 1000;
   static int gasolina = 1000;
   static int hp = 1000;
   static int escudos = 0;
   static int armas = 0;
         
     public static void main(String args[])
     {
        int op; 
    
       
        JOptionPane.showMessageDialog(null, "\n\n **  CONTRABANDISTAS EN EL ESPACIO  **\n\n\n");
        op = (Integer.parseInt(JOptionPane.showInputDialog("1.- Empezar juego\n2.-Salir\n Opción: ")));
        
        while(op <= 0 || op > 2)
        {
            op = (Integer.parseInt(JOptionPane.showInputDialog(" Opcion no válida, elige otra: \n1.- Empezar juego\n2.-Salir\n Opción: ")));
        }
        switch(op)
        {
            case 1: Juego j1 = new Juego();
                j1.empezarJuego();
            break;
            
            case 2: System.exit(0);
        }
        
       // JOptionPane.showMessageDialog(null, "Elegiste la opción "+op);
    
    }
}