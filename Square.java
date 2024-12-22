package Ayush;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Square extends Frame {
	
	public void paint(Graphics g) {
		int[] xPoints = {40,100,160};
		int[] yPoints = {150,50,150};
		g.drawPolygon(xPoints, yPoints, 3);
		g.setColor(Color.RED);
		g.drawRect(50, 150, 100, 100);
		g.fillRect(50, 150, 100, 100);
		
 	}
	
	public static void main(String[] args) {
		Square square = new Square();
	  square.setSize(300,200);
	  square.setTitle("Draw a chana wala ghar");
	  square.setVisible(true);
	}
	
	

}
