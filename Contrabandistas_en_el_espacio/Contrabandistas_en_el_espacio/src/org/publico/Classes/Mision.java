/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.publico.Classes;
// CLASE DIRECTOR Patrón Builder
import javax.swing.JOptionPane;
// CLASE ADAPTADOR Patrón Adapter
/**
 *
 * @author Diego
 */
// CLASE COLEGA Patrón Mediator
public class Mision extends Main implements IAdaptador{
   /* String descripcion;
    String planeta;
    boolean mision; // true para legal, false para ilegal
    float impuesto;
    float ganancias;
    float gasolina;
*/
     @Override
     public void misiones1()
{
    m1();
}
static void m1()
{
    int op = (Integer.parseInt(JOptionPane.showInputDialog(" - Lista de misiones planeta 1!\n\n Misión 1:\n -Planeta 1\n - Legal\n -Se tiene que pagar 150 de impuestos\n -Ganancias: 350\n -Gasto de 500 de gasolina\n\n Misión 2:\n -Planeta 2\n - Ilegal\n -Se tiene que pagar 0 de impuestos\n -Ganancias: 1500\n -Gasto de 700 de gasolina\n\n Misión 3:\n -Planeta 3\n - Legal\n -Se tiene que pagar 275 de impuestos\n -Ganancias: 500\n -Gasto de 800 de gasolina\n\n 4.- Regresar al menú anterior\n\n Opción: ")));
    
    while(op <= 0 || op > 4)
    {
            op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: \n\n Misión 1:\n -Planeta 1\n - Legal\n -Se tiene que pagar 150 de impuestos\n -Ganancias: 350\n -Gasto de 500 de gasolina\n\n Misión 2:\n -Planeta 2\n - Ilegal\n -Se tiene que pagar 0 de impuestos\n -Ganancias: 1500\n -Gasto de 700 de gasolina\n\n Misión 3:\n -Planeta 3\n - Legal\n -Se tiene que pagar 275 de impuestos\n -Ganancias: 500\n -Gasto de 800 de gasolina\n 4.- Regresar al menú anterior\n\n Opción: ")));
    }
    Planeta p1 = new Planeta();
    switch(op)
    {
        case 1: mision1();
        break;
        
        case 2: mision2();
        break;
        
        case 3: mision3();
        break;
        
        case 4: p1.planeta1();
        break;
    }
}

public static void estatus()
    {
        JOptionPane.showMessageDialog(null, " * Ahora cuentas con: "+ganancias+ " de credito\n *Tienes: "+ gasolina+" de gasolina\n* Cuentas con la nave 1\n * Tienes "+armas+" armas y "+escudos+" escudos, tu nave tiene "+hp+ " de salud");
    }

static void mision1()
{
    Nave n1 = new Nave();
    String descripcion1 = "Mision 1";
    String planeta1 = "Planeta 1";
    boolean mision1 = true;
    int impuesto1 = 150;
    int ganancias1 = 350;
    int gasolina1 = 500;
    
    if(gasolina < gasolina1 || ganancias < impuesto1 || hp <0 )
    {
        JOptionPane.showMessageDialog(null, "No tienes la gasolina, salud o el crédito suficiente para realizar esta misión");
        m1();
    }
    JOptionPane.showMessageDialog(null, "Realizando mision...");
    JOptionPane.showMessageDialog(null, "Misión completa!\n Has gastado: "+gasolina1+" de gasolina y "+impuesto1+" de impuestos\n Obtuviste: "+ganancias1+" de ganancias");
    gasolina = gasolina - gasolina1;
    ganancias = ganancias + ganancias1;
    ganancias -= impuesto1;
    if(hp < 0)
    {
        JOptionPane.showMessageDialog(null, "Tienes salud negativa, necesitas recuperarte");
        n1.repararNave();
    }
    if(ganancias < 0)
    {
         JOptionPane.showMessageDialog(null, "Te haz quedado sin créditos :/...\n Haz perdido. Fin del Juego");
         System.exit(0);
    } 
    estatus();
    m1();
}

static void mision2()
{
    Nave n1 = new Nave();
    String descripcion2 = "Mision 2";
    String planeta2 = "Planeta 2";
    boolean mision2 = false;
    int impuesto2 = 0;
    int ganancias2 = 1500;
    int gasolina2 = 450;
    
    if(gasolina < gasolina2 || hp < 0 )
    {
        JOptionPane.showMessageDialog(null, "No tienes la gasolina, salud o el crédito suficiente para realizar esta misión");
        m1();
    }
    
    JOptionPane.showMessageDialog(null, "Realizando misión...");
    double rand = Math.random();
    double rand1 = Math.random();
    if(rand <0.3)
    {
        JOptionPane.showMessageDialog(null, "Interrupción!!, te ha encontrado la policia");
        JOptionPane.showMessageDialog(null, "La policia te ha atrapado, te han retirado tu mercancia y un poco de tus créditos");
        ganancias -= 415;
        gasolina -= 405;
        if(hp < 0)
    {
        JOptionPane.showMessageDialog(null, "Tienes salud negativa, necesitas recuperarte");
        n1.repararNave();
    }
        if(ganancias < 0)
    {
         JOptionPane.showMessageDialog(null, "Te haz quedado sin créditos :/...\n Haz perdido. Fin del Juego");
         System.exit(0);
    }
    }
    else{
    if(rand >0.3 || rand < 0.6)
    {
        JOptionPane.showMessageDialog(null, "Interrupción!!, te han encontrado piratas espaciales");
        int op = (Integer.parseInt(JOptionPane.showInputDialog("Tienes las siguientes opciones\n 1.- Combatir con ellos para terminar misión \n 2.- Rendirse, y no sufrir daños \n Opción: ")));
         while(op <= 0 || op > 2)
        {
            op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: \n 1.- Combatir con ellos para terminar misión \n 2.- Rendirse, y no sufrir daños \n Opción:   ")));
        }
         
        switch(op)
        {
            case 1: JOptionPane.showMessageDialog(null, "Conbatiendo con los piratas espaciales");
            if(rand1 < 0.5)
            {
                JOptionPane.showMessageDialog(null, "Haz perdido! :(\n sufriste algo de daño y perdiste algunos créditos");
                ganancias -=600;
                hp -= 425;
                gasolina -= 475;
                if(hp < 0)
                {
                JOptionPane.showMessageDialog(null, "Tienes salud negativa, necesitas recuperarte");
                n1.repararNave();
                }
                if(ganancias < 0)
                {
                JOptionPane.showMessageDialog(null, "Te haz quedado sin créditos :/...\n Haz perdido. Fin del Juego");
                System.exit(0);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Haz ganado!, felicidades, completaste la misión aunque sufriste algo de daño");
                JOptionPane.showMessageDialog(null, "Misión completa!\n Has gastado: "+gasolina2+" de gasolina y "+impuesto2+" de impuestos\n Obtuviste: "+ganancias2+" de ganancias");
                gasolina -= gasolina2;
                ganancias += ganancias2;
                hp -= 480;
            }estatus();
            m1();
            break;
            
            case 2: JOptionPane.showMessageDialog(null, "Te haz rendido, no sufriste daño pero perdiste la mercancia y algunos créditos");
            ganancias -= 575;
            if(hp < 0)
            {
            JOptionPane.showMessageDialog(null, "Tienes salud negativa, necesitas recuperarte");
            n1.repararNave();
            }
            if(ganancias < 0)
            {
            JOptionPane.showMessageDialog(null, "Te haz quedado sin créditos :/...\n Haz perdido. Fin del Juego");
            System.exit(0);
            }
            estatus();
            m1();
            break;
        }
    }
    }
   /* JOptionPane.showMessageDialog(null, "Realizando misión...\n Misión completa!\n Has gastado: "+gasolina2+" de gasolina y "+impuesto2+"de impuestos\n Obtuviste: "+ganancias2+" de ganancias");
    gasolina = gasolina - gasolina2;
    ganancias = ganancias + ganancias2;
    ganancias -= impuesto2;*/
   if(hp < 0)
    {
        JOptionPane.showMessageDialog(null, "Tienes salud negativa, necesitas recuperarte");
        n1.repararNave();
    }
   if(ganancias < 0)
    {
         JOptionPane.showMessageDialog(null, "Te haz quedado sin créditos :/...\n Haz perdido. Fin del Juego");
         System.exit(0);
    }
   estatus();
    m1();
}

static void mision3()
{
    Nave n1 = new Nave();
    String descripcion3 = "Misión 3";
    String planeta3 = "Planeta 3";
    boolean mision3 = true;
    int impuesto3 = 275;
    int ganancias3 = 500;
    int gasolina3 = 400;
    
    if(gasolina < gasolina3 || ganancias < impuesto3 || hp < 0 )
    {
        JOptionPane.showMessageDialog(null, "No tienes la gasolina, salud o el crédito suficiente para realizar esta misión");
        m1();
    }
    
    JOptionPane.showMessageDialog(null, "Realizando misión...");
    JOptionPane.showMessageDialog(null, "Misión completa!\n Has gastado: "+gasolina3+" de gasolina y "+impuesto3+" de impuestos\n Obtuviste: "+ganancias3+" de ganancias");
    gasolina = gasolina - gasolina3;
    ganancias = ganancias + ganancias3;
    ganancias -= impuesto3;
    if(hp < 0)
    {
        JOptionPane.showMessageDialog(null, "Tienes salud negativa, necesitas recuperarte");
        n1.repararNave();
    }
    if(ganancias < 0)
    {
         JOptionPane.showMessageDialog(null, "Te haz quedado sin créditos :/...\n Haz perdido. Fin del Juego");
         System.exit(0);
    }
    estatus();
    m1();
}

     @Override
    public void misiones2()
{
    int op = (Integer.parseInt(JOptionPane.showInputDialog(" - Lista de misiones planeta 1!\n 1.- Mision 1:\n -Planeta 1\n - Legal\n -Se tiene que pagar 150 de impuestos\n -Ganancias: 350\n -Gasto de 500 de gasolina\n Misión 2:\n -Planeta 2\n - Ilegal\n -Se tiene que pagar 0 de impuestos\n -Ganancias: 1500\n -Gasto de 700 de gasolina\n Misión 3:\n -Planeta 3\n - Legal\n -Se tiene que pagar 275 de impuestos\n -Ganancias: 500\n -Gasto de 800 de gasolina\n  Opción: ")));
    
    while(op <= 0 || op > 3)
    {
            op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: ")));
    }
    
    switch(op)
    {
        case 1: mision1();
        break;
        
        case 2: mision2();
        break;
        
        case 3: mision3();
        break;
    }
}
    
     @Override
    public void misiones3()
{
    int op = (Integer.parseInt(JOptionPane.showInputDialog(" - Lista de misiones planeta 1!\n 1.- Misión 1:\n -Planeta 1\n - Legal\n -Se tiene que pagar 150 de impuestos\n -Ganancias: 350\n -Gasto de 500 de gasolina\n Misión 2:\n -Planeta 2\n - Ilegal\n -Se tiene que pagar 0 de impuestos\n -Ganancias: 1500\n -Gasto de 700 de gasolina\n Misión 3:\n -Planeta 3\n - Legal\n -Se tiene que pagar 275 de impuestos\n -Ganancias: 500\n -Gasto de 800 de gasolina\n  Opción: ")));
    
    while(op <= 0 || op > 3)
    {
            op = (Integer.parseInt(JOptionPane.showInputDialog(" Opción no válida, elige otra: ")));
    }
    
    switch(op)
    {
        case 1: mision1();
        break;
        
        case 2: mision2();
        break;
        
        case 3: mision3();
        break;
    }
}

}