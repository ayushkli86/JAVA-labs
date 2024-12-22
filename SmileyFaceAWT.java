package Ayush;
import java.awt.*;
import java.awt.event.*;

public class SmileyFaceAWT extends Frame {

    public SmileyFaceAWT() {
        setTitle("Smiley Face");
        setSize(400, 400);

//        addWindowListener(new WindowAdapter() {
          //  public void windowClosing(WindowEvent we) {
              //  System.exit(0);
            }
       // });
  //  }

    @Override
    public void paint(Graphics g) {
        Graphics g1 = g;

        
        g1.setColor(Color.YELLOW);
        g1.fillOval(100, 100, 200, 200); 

       
        g1.setColor(Color.BLACK);
        g1.fillOval(150, 150, 20, 20); 
        g1.fillOval(230, 150, 20, 20); 

       
        g1.drawArc(150, 200, 100, 50, 0, -180); 
        }

    public static void main(String[] args) {
        SmileyFaceAWT smileyFace = new SmileyFaceAWT();
        smileyFace.setVisible(true);
    }
}
