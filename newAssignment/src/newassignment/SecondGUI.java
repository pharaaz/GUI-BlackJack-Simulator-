/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newassignment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Owner
 */
public class SecondGUI extends JFrame implements ActionListener{
    
    float bal;
    String y;
    float risk;
    String answer ="1";
    private DrawPanel drawPanel;
    String logo;
    private JButton hit;
    private JButton stand;
    private  JButton button;
    private JPanel but ;
    private JPanel panel;
    private ArrayList<Cards> playerHand;
     private ArrayList<Deck> dealerHand;
    
    //game modes
    boolean bet = true;
    boolean des=false;
     boolean valid = false;
     Imagy myComp = new Imagy();
     
     private Image image;
	    private int compWidth = 500;
	    private int compHeight = 300;

	  
	//private DrawPanel drawPanel;
	
	public SecondGUI() {
            System.out.println("F11111111111111111111111");
           
        System.out.println("F2222222222222222");
	//boolean exit = false;
        
		//label = new JLabel(lab);
		//this.add(label);
               this.bal=bal;
               
		this.setTitle("Faraaz's Black Jack");
		this.setSize(1170, 650);
		this.setLocation(200,100);
               //this.setBackground(Color.GREEN);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setResizable(false);
                
                
                drawPanel = new DrawPanel();
                this.add(drawPanel, BorderLayout.CENTER);
		
		//this.add(myComp);
		
                /*
		JLabel welcome =new JLabel("Avaliable balance: $" +bal +". How much would you like to bet?", JLabel.LEFT);
                welcome.setFont(new Font("Serif", Font.BOLD,20));
                
                JTextArea area = new JTextArea(1,20);
                */
                 button = new JButton("Ready");
        
                
                button.setBackground(Color.orange);
                but = new JPanel();
                  but.add(button);
                 but.setVisible(true);
                  button.addActionListener(this);
                 this.add(but, BorderLayout.EAST);
                  panel = new JPanel();
                            /*
                System.out.println("F3333333333333333333333");
                */
//		button.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				drawPanel = new DrawPanel();
//                                add(drawPanel, BorderLayout.CENTER);
//                                myComp.setVisible(false);
//                                but.setVisible(false);
//                              panel.setVisible(true);
//                              Continue();
//               
//                             
//                            } 
//			
//		});
                 /*
                 System.out.println("kkkkkkkkkkkkkkkkklkp");
               */             
                hit = new JButton("hit");
                hit.setBackground(Color.yellow);
                hit.setFont(new Font("Serif", Font.BOLD,30));
                hit.addActionListener(this);
                
                stand = new JButton("stand");
                stand.setFont(new Font("Serif", Font.BOLD,30));
             stand.setBackground(Color.PINK);
             stand.addActionListener(this);
                
              
               
                //but.add(stand);
                //this.add(hit);
                //this.add(but, BorderLayout.SOUTH);
                
                  //
               
                
		
		
		panel.add(hit);
                panel.add(stand);
                //panel.add(button);
		this.add(panel, BorderLayout.SOUTH);
               
                     panel.setVisible(false);
                
                
                
//                hit.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("hit");
//                                answer="1";
//				
//                              
//                                
//			}
//		});
//                   stand.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("stand");
//                                answer="2";
//				
//                              
//                                
//			}
//		});
               
				
			
	
        }
        
        
        
        public void actionPerformed(ActionEvent e)
   { Object source = e.getSource();
     if(source == hit)
     {
    	 System.out.println("hit");
         answer="1";
    	 //Human human = new Human(humans, drawPanel.getWidth()/2, drawPanel.getHeight()/2);
    	// humans.add(human);
    	 //Thread t = new Thread(human);
    	// t.start();
    	// Ball ball = new Ball(getHeight(), getWidth());
     }
     if(source == stand)
     {
    	 System.out.println("stand");
         answer="2";
//    	 Zombie zombie = new Zombie(humans, drawPanel.getWidth()/2, drawPanel.getHeight()/2);
//    	 zombies.add(zombie);
//    	 Thread t = new Thread(zombie);
//    	 t.start();
//    	// Ball ball = new Ball(getHeight(), getWidth());
     }
     if(source==button)
     {
         
                                myComp.setVisible(false);
                                but.setVisible(false);
                              panel.setVisible(true);
                              Continue();
     }
     
   }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        private class DrawPanel extends JPanel
{
   
            
    public DrawPanel()
    {
        super();
        setPreferredSize(new Dimension(1100, 700));
        setBackground(Color.GREEN);
       
    }
    
     public DrawPanel(int i){
         
     }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int space=0;
        for(Cards d : playerHand){
             g.setColor(Color.white);
             g.fillRect(475+space, 380, 100, 140);
             g.setColor(Color.BLACK);
             g.setFont(new Font("Serif", Font.BOLD,30));
            // g.drawString(d.getCard(d.size()-1).getCardValue(), 100+space, 400);
             space+=100;
        }
//         g.setColor(Color.white);
//        g.fillRect(475, 380, 100, 140);
//        g.setColor(Color.BLACK);
//        g.setFont(new Font("Serif", Font.BOLD,30));
//        g.drawString("helllo", 100, 400);
//        g.setColor(Color.white);
//        g.fillRect(580, 380, 100, 140);
//        //g.drawString(logo,62,125);
        
        
        
        
    }
}
        
        
        
        //used to check input was valid and no mismatch was occurring. Option for "x" to be used as an exit option.
	public static boolean isValidAnswer(String option) {
        
        try {
            Float.parseFloat(option);
        }  catch (Exception e) {
            if(option.equalsIgnoreCase("x")){
                return false;
            }
            System.out.print("Invalid Input. Please input your answer again: ");
            return false;
        }
        return true;
    }
        
	   
             
 
        public void Continue(){
            
            
            playerHand = new ArrayList<Cards>();
           dealerHand = new ArrayList<Deck>();
   
           System.out.println(risk +answer);
            Deck currentDeck = new Deck();	
        currentDeck.fullDeck();
	int p1Total=0;
	int dealTotal=0;
	ParticipantReg ps =new ParticipantReg();
           
           
				//player and dealer 
				Player p1 = new Player(currentDeck);
                                playerHand = p1.cards;
                                
				Dealer deal = new Dealer(currentDeck);
                                
				//p1.setMoney(bal);
                                
				boolean hitt = true;
                                boolean round = false;
                                System.out.println(p1.toString());
				System.out.println(deal.toString());
                
                   
                   //System.out.println(risk);
                   
                   
                   
                   
                   
                   
                  
                  
                  
                  
                 
                      
					//prints out the player and dealer cards
						//System.out.println(p1.toString());
						
						//System.out.println(deal.toString());
						
						//Checks if player has got a blackjack or not.
						int p1BlackJack = p1.posBlackJack();
                                                
						int dealBlackJack= deal.posBlackJack();
						
						if(p1BlackJack==1&&dealBlackJack!=p1BlackJack) {
							System.out.println("Congrulations!!! You got BlackJack! Thats a 3:2 pay out");
							bal+=(risk*1.5f);
							hitt=false;
							round=true;
			
                               }
						
				//if blackjack was awarded to player, there is no need to hit or stay. 
						while(hitt==true) {
							
				//before player is asked to hit, they are informed about basic strategy and what's the best option.
							BasicStrategy bg = new BasicStrategy(deal.faceCardValue(),p1.value());
							bg.Basic();
					    
						Scanner input =new Scanner(System.in);
						
				//if user input is invalid, user will have to keep inputting until correct. 
                                System.out.println("(1) hit or (2) stay? (press 1 to hit or 2 stay)");
						String answer = input.next();
                                
						
						if(answer.equals("1")) {
							
							p1Total=p1.hit();
							int key = p1.check();
							if(key == 3) {
								round=true;
								break;
							}
						}
						else if(answer.equals("2")){
							p1Total = p1.value();
							break;
						}
						
						
					}
						
					System.out.println(deal.toString()); 
                                        logo = deal.toString();
					
					dealTotal=deal.value();
    //below is the possible scenarios when playing against a dealer in blackjack
					if(dealTotal>16 && dealTotal>p1Total&& round==false) {
						System.out.println("The dealer won!");
						bal-=risk;
						round=true;
					}
					
					if(round ==false) {
						dealTotal=deal.hit();
						
					}
					
					System.out.println("Dealer hand: "  +dealTotal  + "      |           Your hand:"+p1Total);
					
					if(dealTotal>21&& round==false) {
						System.out.println("Dealer bust! You won!! Congratulations!");
						bal+=risk;
						round =true;
						
					}
					if(dealTotal==p1Total&& round==false) {
						System.out.println("Push, it is a tie. No one won.");
						round=true;
					}
					if(dealTotal < p1Total && round==false && dealTotal>16) {
						System.out.println("You won!! Congratulations!");
						bal+=risk;
						round = true;
					}
					else if(round==false) {
						System.out.println("You lost");
						System.out.println("delaer won");
						bal-=risk;
						round=true;
						
					}
					//returns the cars used in the hand to the deck
					p1.returnCards(currentDeck);
					deal.returnCards(currentDeck);
					System.out.println("The round is over. ");
                                        
                                        
//                                          if(source == chip5)
//     {
//          picky="Good Luck!";
//         starty();
//         panel.repaint();
//         
//     }
//     
//     if(source == chip10)
//     {
//         picky="Good Luck!";
//         starty();
//         panel.repaint();
//         
//     }
//     if(source == chip25)
//     {
//          picky="Good Luck!";
//         starty();
//         panel.repaint();
//         
//     }
//     if(source == chip100)
//     {
//          picky="Good Luck!";
//         starty();
//         panel.repaint();
//    	
//         
//     }
//chip5.setBounds(398, 425, 100, 75);
//                chip5.setBackground(Color.RED);
//                chip5.setFont(fonty);
//                chip5.addActionListener(this);
//                panel.add(chip5);
//                chip5.setVisible(true);
//                
//                 chip10.setBounds(512, 425, 100, 75);
//                chip10.setBackground(Color.CYAN);
//                chip10.setFont(fonty);
//                chip10.addActionListener(this);
//                panel.add(chip10);
//                chip10.setVisible(true);
//                
//                 chip25.setBounds(626, 425, 100, 75);
//                chip25.setBackground(Color.GREEN);
//                chip25.setFont(fonty);
//                chip25.addActionListener(this);
//                panel.add(chip25);
//                chip25.setVisible(true);
//                
//                
//                 chip100.setBounds(740, 425, 100, 75);
//                chip100.setBackground(Color.gray);
//                chip100.setFont(fonty);
//                chip100.addActionListener(this);
//                panel.add(chip100);
//                chip100.setVisible(true);
//				
			
                  
                  
                  
                  
                  
                
                 
			
           
           
            
            }
   
    

                 
        
                 
        
        
}