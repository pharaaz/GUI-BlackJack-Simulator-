/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newassignment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Owner
 */
public class UserGUI extends JFrame{
    
   private String name;
   
    
    public UserGUI() {
		
		JTextArea area = new JTextArea(1,20);
                /////////////////////////////////////////
		JLabel welcome =new JLabel("Welcome to Faraaz's Casino!!!!", JLabel.LEFT);
		JLabel label=new JLabel("Please enter your name to continue with Balance, or new name for new balance", JLabel.CENTER);
		
		
		welcome.setFont(new Font("Serif", Font.BOLD,15));
		label.setFont(new Font("Serif", Font.BOLD,15));
	
		welcome.setForeground(Color.RED);
		label.setForeground(Color.BLUE);
		
		JButton button = new JButton("Enter Casino");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//new SecondGUI(area.getText().trim()).setVisible(true);
                                name=area.getText().trim();
                                
                                
                                
                                new Gui(name).setVisible(true);
                                
                                
                                
			}
		});
		
		JPanel panel = new JPanel(); 
		panel.add(area);
		panel.add(button);
		//panel.add(label);
		
		this.add(label);
		//this.add(welcome);
		
		this.add(panel,BorderLayout.SOUTH);
		
		this.setTitle("Faraaz's Black Jack");
		this.setSize(550,100);
		this.setLocation(200,100);
		//this.setForeground(Color.GREEN);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                ////////////////////////save user here............
		this.setVisible(true);
		
	}
    
   @Override
    public String getName(){
        return this.name;
    }
    
    
    
    
}
