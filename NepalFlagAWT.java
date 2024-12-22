package Ayush;
import java.awt.*;
import java.awt.event.*;

public class NepalFlagAWT extends Frame {

    public NepalFlagAWT() {
        setTitle("Nepal Flag");

        setSize(400, 400);}

    @Override
    public void paint(Graphics g) {
    
    	
    	 g.drawLine(150,150, 150,450);
        int[] xpoints1 = {150, 300, 150};
        int[] ypoints1 = {100, 200, 200};
        
        int[] xpoints2 = {150, 300, 150};
        int[] ypoints2 = {200, 350, 350};

        
       
        g.setColor(Color.RED);
        g.fillPolygon(xpoints1, ypoints1, 3);

        g.fillPolygon(xpoints2, ypoints2, 3);

        g.setColor(Color.BLUE);
        g.drawPolygon(xpoints1, ypoints1, 3);
        g.drawPolygon(xpoints2, ypoints2, 3);

      
     
           
        
    }

    public static void main(String[] args) {
        // Create instance of frame
        NepalFlagAWT flag = new NepalFlagAWT();
        flag.setVisible(true);
    }
}
