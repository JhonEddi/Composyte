package mickey;


import java.awt.Graphics;
import java.awt.Label;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayan
 */
public class controlador extends JPanel {
    
    private String nombre1, nombre2, nombre3;
    private Vector<Nodo> VectorNodo;
 
 
    int x,y,d;
    
    public controlador(){
        this.VectorNodo = new Vector<>();   
    }

   
    

    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        for (Nodo nodos : VectorNodo){
            nodos.print(g);
        
    }
    }
   
    public void agregar(int x, int y, int d) {
        //VectorNodo es la composicion de Nodos
            this.VectorNodo.add(new Nodo(x,y,d)); 
            repaint();
            
        
    }

   
   
   
    
}
