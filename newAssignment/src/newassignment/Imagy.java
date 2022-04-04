/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newassignment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;                                                                                                                                                                                                                                                                                                        
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author Owner
 */
public class Imagy extends JComponent{
    private Image image;
	    private int compWidth = 500;
	    private int compHeight = 300;

	   // @Override
	    public void paintComponent(Graphics g) { 
	        System.out.println("paintComponent is called!");
	        image = new ImageIcon("capturej.png").getImage();
	        g.drawImage(image, 0, 0, null);
	        
	        g.setColor(Color.YELLOW);
	        g.fillRect(475, 380, 100, 140);
	        
	        g.setColor(Color.BLUE);
	        g.fillRect(578, 380, 100, 140);
	   
	       // g.drawString("Program Design & Construction", 100, 120);

	    }

	  //  @Override
	    public Dimension getPreferredSize() {
	        return new Dimension(compWidth, compHeight);
	    }
    
}
