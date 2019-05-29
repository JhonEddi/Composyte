/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mickey;

import javax.swing.JFrame;

/**
 *
 * @author estudiantes
 */
public class Mickey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ventana = new JFrame ("Incentro");
        controlador a = new controlador();
        a.agregar(400, 350, 100);
        a.agregar(400, 350, 50);
        a.agregar(325, 300, 100);
        a.agregar(325, 300, 50);
        a.agregar(0, 0, 0);
        a.agregar(0, 0, 0);
        a.agregar(0, 0, 0);
        a.agregar(0, 0, 0);
        a.agregar(0, 0, 0);
        a.agregar(0, 0, 0);
        a.agregar(0, 0, 0);
        ventana.add(a);
        ventana.setSize(800, 700);
        ventana.setLocation(400, 100);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Incentro");
        ventana.setVisible(true);
       
    }
    
}
