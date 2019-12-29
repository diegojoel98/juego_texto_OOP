/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.publico.Classes;
// CLASE COLEGA CONCRETA Patrón Mediator
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Planeta extends Mision{
    /*String nombre;
    float posicionEspacio;*/
   
    
    public void planeta1()
    {
        Nave n2 = new Nave();
        Juego j2 = new Juego();
        int op = (Integer.parseInt(JOptionPane.showInputDialog(" - Bienvenido al planeta 1!\n\n 1.- Ver misiones de este planeta\n 2.- Ir al taller de este planeta\n 3.- Ir a la tienda de este planeta\n 4.- Ver tu estatus\n 5.- Regresar al menú anterior\n\n Opción: ")));
        
        while(op <= 0 || op > 5)
        {
            op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: \n1.- Ver misiones de este planeta\n 2.- Ir al taller de este planeta\n 3.- Ir a la tienda de este planeta\n 4.- Ver tu estatus \n 5.- Regresar al menú anterior\n\n Opción: ")));
        }
        
        switch(op)
        {
            case 1: misiones1();
            break;
            
            case 2: n2.taller1();
            planeta1();
            break;
            
            case 3: n2.tienda1();
            break;
            
            case 4: estatus();
            planeta1();
            break;
            
            case 5: j2.eleccion();
            break;
        }
    }
    
     void planeta2()
    {
        int op = (Integer.parseInt(JOptionPane.showInputDialog(" - Bienvenido al planeta 2!\n\n 1.- Ver misiones de este planeta\n 2.- Ir al taller de este planeta\n 3.- Ir a la tienda de este planeta\n 4.- Ver el estatus de la nave\n 5.- Regresar al menú anterior\n\n Opción: ")));
        Nave n2 = new Nave();
        Juego j2 = new Juego();
        while(op <= 0 || op > 5)
        {
            op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: \n 1.- Ver misiones de este planeta\n 2.- Ir al taller de este planeta\n 3.- Ir a la tienda de este planeta\n 4.- Ver tu estatus \n 5.- Regresar al menú anterior\n\n Opción: ")));
        }
        
        switch(op)
        {
            case 1: misiones1();
            break;
            
            case 2: n2.taller1();
            planeta1();
            break;
            
            case 3: n2.tienda1();
            break;
            
            case 4: estatus();
            planeta1();
            break;
            
            case 5: j2.eleccion();
            break;
        }
    }
    
     void planeta3()
    {
        int op = (Integer.parseInt(JOptionPane.showInputDialog(" - Bienvenido al planeta 3!\n\n 1.- Ver misiones de este planeta\n 2.- Ir al taller de este planeta\n 3.- Ir a la tienda de este planeta\n 4.- Ver el estatus de la nave\n 5.- Regresar al menú anterior\n\n Opción: ")));
        Nave n2 = new Nave();
        Juego j2 = new Juego();
        while(op <= 0 || op > 5)
        {
            op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: \n.- Ver misiones de este planeta\n 2.- Ir al taller de este planeta\n 3.- Ir a la tienda de este planeta\n 4.- Ver tu estatus \n 5.- Regresar al menú anterior\n\n Opción: ")));
        }
        
        switch(op)
        {
            case 1: misiones1();
            break;
            
            case 2: n2.taller1();
            planeta1();
            break;
            
            case 3: n2.tienda1();
            break;
            
            case 4: estatus();
            planeta1();
            break;
            
            case 5: j2.eleccion();
            break;
        }
    }

}
