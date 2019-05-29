package mickey;

import java.awt.Graphics;

/**
 *
 * @author Brayan
 */
public class Nodo {
    private int x, y, d;
   
    
    

    public Nodo(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }
   
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void print (Graphics g){
        g.drawOval(this.x-d/2, this.y-d/2, d, d);
 
    }
    
    
    
}
