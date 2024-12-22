package Ayush;
import java.awt.*;
import java.awt.event.*;

public class GermanyFlagAWT extends Frame {

    public GermanyFlagAWT() {
        setTitle("Germany Flag");
        setSize(500, 300);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Graphics g1 =  g;

        int width = getWidth();
        int height = getHeight();
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height / 3);
        
        g.setColor(Color.RED);
        g.fillRect(0, height / 3, width, height / 3);
        
        g.setColor(Color.YELLOW);
        g.fillRect(0, 2 * height / 3, width, height / 3);
    }

    public static void main(String[] args) {
        GermanyFlagAWT flag = new GermanyFlagAWT();
        flag.setVisible(true);
    }
}
