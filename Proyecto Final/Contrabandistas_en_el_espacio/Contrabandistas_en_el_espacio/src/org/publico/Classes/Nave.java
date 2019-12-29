/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.publico.Classes;

import javax.swing.JOptionPane;
// CLASE MEDIADORA Patrón Mediator
/**
 *
 * @author Diego
 */
public class Nave extends Main implements IMediador{
    /*float defensas;
    float armas;*/
  
     void taller1()
{
    int op = (Integer.parseInt(JOptionPane.showInputDialog(" - MENÚ TALLER --\n 1.- Comprar gasolina\n 2.- Reparar nave\n 3.- Regresar al menu anterior  ")));
      Planeta p1 = new Planeta();
    while(op <= 0 || op > 3)
    {
        op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: ")));
    }
   
    switch(op)
    {
        case 1: compraGas();
        break;
        
        case 2: repararNave();
        break;
        
        case 3: p1.planeta1();
        break;
    }
}

 void compraGas()
{
    int op = (Integer.parseInt(JOptionPane.showInputDialog(" - Comprar gasolina --\n *Cada nave puede tener máximo 1000 unidades de gasolina\n * Tu cuentas con: "+gasolina+" unidades de gasolina\n 1.- Comprar 100 unidades de gasolina - 100 créditos\n 2.- Comprar 300 unidades de gasolina - 300 créditos\n 3.- Comprar 500 unidades de gasolina - 500 créditos\n 4.- Regresar al menu anterior  \n Opción: ")));
    
    while(op <= 0 || op > 4)
    {
        op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: ")));
    }
   
    switch(op)
    {
        case 1: //gasolina += 100;
        if((gasolina + 100) > 1000)
        {
            JOptionPane.showMessageDialog(null, "No puedes comprar 100 unidades, rebasas el límite de 1000");
            //gasolina -=100;
        }
        else
        {     
        gasolina += 100;
        ganancias -=100;
        JOptionPane.showMessageDialog(null, "Transacción en proceso...\n Haz comprado 100 unidades de gasolina");
        }
        break;
        
        case 2: //gasolina +=300;
        if(gasolina + 300 > 1000)
        {
            JOptionPane.showMessageDialog(null, "No puedes comprar 300 unidades, rebasas el límite de 1000");
            //gasolina -=300;
        }
        else
        {
        gasolina +=300;
        ganancias -=300;
        JOptionPane.showMessageDialog(null, "Transacción en proceso...\n Haz comprado 300 unidades de gasolina");
        }
        break;
        
        case 3: //gasolina +=500;
        if(gasolina + 500 > 1000)
        {
            JOptionPane.showMessageDialog(null, "No puedes comprar 500 unidades, rebasas el límite de 1000");
            //gasolina -=500;
        }
        else
        {
        gasolina += 500;
        ganancias -=500;
        JOptionPane.showMessageDialog(null, "Transacción en proceso...\n Haz comprado 500 unidades de gasolina");
        }
        break;
        
        case 4: taller1();
        break;
    }
    if(ganancias < 0)
    {
         JOptionPane.showMessageDialog(null, "Te haz quedado sin créditos :/...\n Haz perdido. Fin del Juego");
         System.exit(0);
    }
}

void repararNave()
{
    int op = (Integer.parseInt(JOptionPane.showInputDialog(" - Reparar Nave --\n * Cada nave puede tener máximo 1000 Health Power HP  \n * Tu cuentas con: "+hp+" de salud\n 1.- Comprar 100 unidades de salud - 100 créditos\n 2.- Comprar 300 unidades de salud - 300 créditos\n 3.- Comprar 500 unidades de salud - 500 créditos\n 4.- Regresar al menú anterior  \n Opcion: ")));
    
    while(op <= 0 || op > 4)
    {
        op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: ")));
    }
   
    switch(op)
    {
        case 1: //hp += 100;
        if(hp +100 > 1000)
        {
            JOptionPane.showMessageDialog(null, "No puedes comprar 100 unidades, rebasas el límite de hp, 1000");
            //hp -=100;
        }
        else
        {
        ganancias -=100;
        hp +=100;
        JOptionPane.showMessageDialog(null, "Transacción en proceso...\n Haz comprado 100 unidades de hp para tu nave");
        }
        break;
        
        case 2: //hp +=300;
        if(hp + 300 > 1000)
        {
            JOptionPane.showMessageDialog(null, "No puedes comprar 300 unidades, rebasas el límite de hp, 1000");
            //hp -=300;
        }
        else
        {
        ganancias -=300;
        hp +=300;
        JOptionPane.showMessageDialog(null, "Transacción en proceso...\n Haz comprado 300 unidades de hp para tu nave");
        }
        break;
        
        case 3:// hp +=500;
        if(hp +500 > 1000)
        {
            JOptionPane.showMessageDialog(null, "No puedes comprar 500 unidades, rebasas el límite de hp, 1000");
            //hp -=500;break;
        }
        else
        {
        ganancias -=500;
        hp +=500;
        JOptionPane.showMessageDialog(null, "Transacción en proceso...\n Haz comprado 500 unidades de hp para tu nave");
        }
        break;
        
        case 4: taller1();
        break;
    }
    if(ganancias < 0)
    {
         JOptionPane.showMessageDialog(null, "Te haz quedado sin créditos :/...\n Haz perdido. Fin del Juego");
         System.exit(0);
    }
}

@Override
 public void tienda1()
{
    int op = (Integer.parseInt(JOptionPane.showInputDialog(" - Tienda --\n *Artículos en venta\n * Tu cuentas con: "+escudos+" escudos y "+armas+" armas\n 1.- Comprar 1 escudo - 200 créditos\n 2.- Comprar 5 armas - 500 créditos\n 3.- Regresar al menú anterior  \n Opción: ")));
    Planeta p2 = new Planeta();
    while(op <= 0 || op > 4)
    {
        op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: ")));
    }
   
    switch(op)
    {
        case 1: //gasolina += 100;
        if((escudos*200) + 200 > 400)
        {
            JOptionPane.showMessageDialog(null, "No puedes comprar unidades, rebasas el límite de 2 escudos");
            //gasolina -=100;
        }
        else
        {     
        escudos += 1;
        ganancias -=200;
        JOptionPane.showMessageDialog(null, "Transacción en proceso...\n Haz comprado un escudo");
        }tienda1();
        break;
        
        case 2: //gasolina +=500;
        if((armas*100) + 500 > 1000)
        {
            JOptionPane.showMessageDialog(null, "No puedes comprar 5 unidades, rebasas el límite de 10");
            //gasolina -=500;
        }
        else
        {
        armas += 5;
        ganancias -=500;
        JOptionPane.showMessageDialog(null, "Transacción en proceso...\n Haz comprado 5 armas");
        }tienda1();
        break;
        
        case 3: p2.planeta1();
        break;
    }
    if(ganancias < 0)
    {
         JOptionPane.showMessageDialog(null, "Te haz quedado sin créditos :/...\n Haz perdido. Fin del Juego");
         System.exit(0);
    }
}

}
