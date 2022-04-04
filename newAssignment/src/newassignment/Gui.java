/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newassignment;
//next visy
//

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @Faraaz Khan 17985055
 */
public class Gui extends JFrame implements ActionListener{
    
    Panel panel;
    
    //stages
    boolean pTurn=true;
    boolean dTurn=false;
    boolean round=false;
    
    
    
    
    //Colour for the background
    Color coloury=new Color(39,119,20);
    Color purple=new Color(102,0,153);
    
    
    //buttons
    JButton hit = new JButton("Hit");
    JButton stay = new JButton("Stay");
    JButton next = new JButton("Next");
    
    //
    int[] dX = new int[4];
    int[] dY = new int[4];
 
     
     //Preset Fonts
     Font fonty = new Font("Serif", Font.BOLD,30);
     Font welcomeM = new Font("Serif", Font.BOLD,25);
     Font cardFont = new Font("Serif", Font.BOLD,50);
     Font adviceText = new Font("Serif", Font.BOLD,25);
     Font adviceTextGG = new Font("Serif", Font.BOLD,23);
     Font avgSize = new Font("Serif", Font.BOLD,28);
     
     //global variables
     ParticipantReg ps =new ParticipantReg();
     String userName;
     Participant participant;
     float money=0;
     int suitType =0;
     
     int blankCard=0;
     Player p1;
      Deck op ;
      Deck dd;
      int p1Total=0;
    int dealTotal=0;
    Dealer deal;
    int lock = 1;
    ArrayList<Cards> fro;
    ArrayList<Cards> dee;
    ArrayList<String> convo;
    int key =0;
    String busty="Welcome to Faraaz's Casino";
    Deck currentDeck;
    String pScore=" ";
    String advice=" ";
    String mathy="If I did my maths right,";
    String title="according to basic strategy ";
    String gg =" ";
    BasicStrategy bg;
    String topy="teach the basics of BlackJack";
    String mula="This was designed to help ";
    String picky = "Hope you enjoy!!";
    

    public Gui(String userName){
        this.setTitle("Faraaz's Black Jack gui");
		this.setSize(1170, 650);
		this.setLocation(200,100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setResizable(false);
                
                panel = new Panel();
                this.setContentPane(panel);
                this.setLayout(null);
                
                hit.setBounds(500, 500, 115, 75);
                hit.setBackground(Color.CYAN);
                hit.setFont(fonty);
                hit.addActionListener(this);
                panel.add(hit);
                
                stay.setBounds(650, 500, 115, 75);
                stay.setBackground(Color.PINK);
                stay.setFont(fonty);
                stay.addActionListener(this);
                panel.add(stay);
                hit.setVisible(false);
                stay.setVisible(false);
                
                next.setBounds(1000, 500, 115, 75);
                next.setBackground(Color.lightGray);
                next.setFont(fonty);
                next.addActionListener(this);
                panel.add(next);
                
                next.setVisible(true);
                
                
                
                this.userName=userName;
                starty();
                

    }
    
//    public void refreshy(){
//        if(pTurn==true){
//            hit.setVisible(true);
//            stay.setVisible(true);
//        }
//        else if(dTurn==true){
//            hit.setVisible(false);
//            stay.setVisible(false);
//        }
//    }
    
    public void busty(){
        busty="Bust, thats too many :(";
        hit.setVisible(false);
        stay.setVisible(false);
       // panel.repaint();
    }
    
    public void onwards(){
        blankCard=0;
        hit.setVisible(false);
        stay.setVisible(false);
        if(dealTotal>16 && dealTotal>p1Total&& round==false) {
						
            System.out.println("The dealer won!");
            mathy="The dealer won!";
            title="Dealer had: " +dealTotal;;
            //money-=bet;
	    round=true;
					
        }
					
					
        if(round ==false) {
						
            dealTotal=deal.hit();
            dee=deal.dealer.cards;
            panel.repaint();
						
					
        }
					
					
        System.out.println("Dealer hand: "  +dealTotal  + "      |           Your hand:"+p1Total);
					
					
        if(dealTotal>21&& round==false) {
						
            System.out.println("Dealer bust! You won!! Congratulations!");
            mathy="Dealer bust! ";
            title="You won!! Dealer had: " +dealTotal;;
            advice="Congratulations! ";
						
           // money+=bet;
						
            round =true;
						
					
        }
					
        if(dealTotal==p1Total&& round==false) {
						
            System.out.println("Push, it is a tie. No one won.");
            mathy="Push, it is a tie.";
            title=" No one won.";
            advice="Dealer had: " +dealTotal;
						
            round=true;
					
        }
					
        if(dealTotal < p1Total && round==false && dealTotal>16) {
						
            System.out.println("You won!! Congratulations!");
            mathy="You won!! ";
            title="Congratulations!";
            advice="Dealer had: " +dealTotal;
						
           // money+=bet;
						
            round = true;
					
        }
					
        else if(round==false) {
						
            System.out.println("You lost");
						
            System.out.println("delaer won");
            mathy="You lost :(";
            title="delaer won";
            advice="Dealer had: " +dealTotal;
						
           // money-=bet;				
            round=true;
										
        }
					
                                    
			

				
    }
    
    public void starty(){

        
        round=false;
        busty="Welcome to Faraaz's Casino";
    
    pScore=" ";
     advice=" ";
     mathy="If I did my maths right,";
    title="according to basic strategy ";
    gg =" ";
                        currentDeck = new Deck();
		currentDeck.fullDeck();
		money=0;
		p1Total=0;
		dealTotal=0;
                key=0;
		ParticipantReg ps =new ParticipantReg();
                participant = ps.checkParticipant(userName);
                money=participant.getMoney();
                
                
		boolean exit = false;
		float bet=0;;
                
                p1 = new Player(currentDeck);
                deal = new Dealer(currentDeck);
                int i=1;
                
                blankCard=1;
               op = p1.player;
               dd = deal.dealer;
               dee=deal.dealer.cards;
               fro=p1.player.cards;
               
               pScore="Currently you have: " +p1.player.sum();
               
               
               //Checks if player has got a blackjack or not.
	       int p1BlackJack = p1.posBlackJack();
		int dealBlackJack= deal.posBlackJack();
						
		if(p1BlackJack==1&&dealBlackJack!=p1BlackJack) {
		System.out.println("Congrulations!!! You got BlackJack! Thats a 3:2 pay out");
		pScore="Congrulations!!!";
                gg="You got BlackJack! 3:2 payout";
                mathy=" ";
                title = " ";
                //money+=(bet*1.5f);
		//hit=false;
		round=true;
		}
                else{
                    bg = new BasicStrategy(deal.faceCardValue(),p1.value());
                    advice =bg.Basic();
                    
                    
                    hit.setVisible(true);
                    stay.setVisible(true);
                }
               
              // dScore=deal.toString();
               
                System.out.println(op.getCard(dd.size()-1).getCardValue());
                 System.out.println(op.getCard(dd.size()-2));
                //Deck op = p1.player;
                //op.getCard(op.size()-1);
//                for(Cards s : p1.){
//                    System.out.println(p1.getCard(i));
//                    i++;
//                }
        
    }
    
    public void endy(){
        //returns the cars used in the hand to the deck 
      pScore=" ";
    advice=" ";
   mathy="If I did my maths right,";
    title="according to basic strategy ";
     gg =" ";
        p1.returnCards(currentDeck);				
        deal.returnCards(currentDeck);	
        System.out.println("The round is over. ");
        
        participant.setMoney(money);
	ps.updateBal(participant);
        
        starty();
    }
    
    public class Panel extends JPanel{
        
        
         public void paintComponent(Graphics g){
             g.setColor(coloury);
             g.fillRect(0, 0, 1170, 650);
             int k=0;
             
             //player cards
//             for(int i =0; i <op.size(); i++){
//                 g.setColor(Color.WHITE);
//                 g.fillRect(475+k, 320, 100, 140);
//                 if(op.getCard(op.size()-1).getSuit().equals(1)|| op.getCard(op.size()-1).getSuit().equals(4)){
//                     g.setColor(Color.BLACK);
//                 }
//                 else{
//                     g.setColor(Color.RED);
//                 }
//                 g.setFont(cardFont);
//                g.drawString(op.getCard(op.size()-(i+1)).getCardValue(), 479+k, 313+140);
//                 k+=110;
//                 
//             }
            
            //player  carrds 
            for(Cards c : fro){
              g.setColor(Color.WHITE);
                 g.fillRect(400+k, 320, 100, 140);
                     
                 g.setFont(cardFont);
               
                
               if(c.getCardSuity()==1 ||c.getCardSuity()==4){
                   g.setColor(Color.BLACK);
                    g.drawString(c.getCardValue(), 400+k, 313+140);
                    
                    if(c.getCardSuity()==1){
                        g.fillOval(413+k, 375, 35, 35);
		g.fillOval(413+k+31, 375, 35, 35);
		g.fillArc(413+k-12, 300, 90, 90, 51+180, 78);
		g.fillRect(413+k+28, 378, 10, 40);
                    }
                    
                    else{
                         g.fillOval(385+k+40, 285+90, 35, 35);
		g.fillOval(385+k+75, 285+90, 35, 35);
		g.fillOval(385+k+58, 285+62, 35, 35);
		g.fillRect(385+k+70, 285+75, 10, 70);
                    }
                    
               }
               else{
                   g.setColor(Color.RED);
                    g.drawString(c.getCardValue(), 400+k, 313+140);
                    
                    if(c.getCardSuity()==2){
                        dX[0] = 385+k+75;
					dX[1] = 385+k+50;
					dX[2] = 385+k+75;
					dX[3] = 385+k+100;
					dY[0] = 285+60;
					dY[1] = 285+100;
					dY[2] = 285+140;
					dY[3] = 285+100;
					g.fillPolygon(dX, dY, 4);
                    }
                    else{
                         g.fillOval(385+k+42, 285+70, 35, 35);
		g.fillOval(385+k+73, 285+70, 35, 35);
		g.fillArc(385+k+30, 285+90, 90, 90, 51, 78);
                    }
               }
                
                 k+=110;
         }
            
            //dealer cards
            k=0;
            for(Cards c : dee){
              g.setColor(Color.WHITE);
                 g.fillRect(400+k, 60, 100, 140);
                 g.setFont(cardFont);
                 
                 if(c.getCardSuity()==1 ||c.getCardSuity()==4){
                   g.setColor(Color.BLACK);
                    
                    
                    if(c.getCardSuity()==1){
                        g.fillOval(413+k, 115, 35, 35);
		g.fillOval(413+k+31, 115, 35, 35);
		g.fillArc(413+k-12, 40, 90, 90, 51+180, 78);
		g.fillRect(413+k+28, 118, 10, 40);
                    }
                    
                    else{
                         g.fillOval(385+k+40, 20+90, 35, 35);
		g.fillOval(385+k+75, 20+90, 35, 35);
		g.fillOval(385+k+58, 20+62, 35, 35);
		g.fillRect(385+k+70, 20+75, 10, 70);
                    }
                    
               }
               else{
                   g.setColor(Color.RED);
                    
                    
                    if(c.getCardSuity()==2){
                        dX[0] = 385+k+75;
					dX[1] = 385+k+50;
					dX[2] = 385+k+75;
					dX[3] = 385+k+100;
					dY[0] = 20+60;
					dY[1] = 20+100;
					dY[2] = 20+140;
					dY[3] = 20+100;
					g.fillPolygon(dX, dY, 4);
                    }
                    else{
                         g.fillOval(385+k+42, 20+70, 35, 35);
		g.fillOval(385+k+73, 20+70, 35, 35);
		g.fillArc(385+k+30, 20+90, 90, 90, 51, 78);
                    }
               }
                 
               g.drawString(c.getCardValue(), 400+k, 60+130);
                 k+=110;
         }
            
            if(blankCard==1){
                g.setColor(purple);
                 g.fillRect(510, 60, 100, 140);
            }
            
            //terminal for me to talk to the player
            g.setColor(Color.pink);
                g.fillRect(50, 50, 321, 500);
                g.setColor(Color.BLUE);
                g.setFont(welcomeM);
                g.drawString(busty, 63, 80);
                g.setFont(fonty);
                g.drawString(pScore, 63, 135);
                g.setFont(adviceTextGG);
                g.drawString(gg, 57, 175);
                //basic stragetory here
                g.setFont(adviceText);
                g.drawString(mathy, 58, 255);
                g.drawString(title, 58, 285);
                g.drawString(advice, 58, 315);
                g.setColor(purple);
                g.drawString(mula, 58, 365);
                g.setFont(welcomeM);
                g.drawString(topy, 58, 395);
                g.setFont(avgSize);
                g.drawString(picky, 58, 450);
                
           
            
             
             //dealer cards
//             k=0;
//             for(int i =0; i <dd.size(); i++){
//                 g.setColor(Color.WHITE);
//                 g.fillRect(475+k, 60, 100, 140);
//                 if(dd.getCard(dd.size()-1).getSuit().equals(1)|| dd.getCard(dd.size()-1).getSuit().equals(4)){
//                     g.setColor(Color.BLACK);
//                 }
//                 else{
//                     g.setColor(Color.RED);
//                 }
//                 g.setFont(cardFont);
//                g.drawString(dd.getCard(dd.size()-(i+1)).getCardValue(), 479+k, 60+130);
//                 k+=110;
//                 
//             }
        
         }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
     if(source == hit)
     {
    	 System.out.println("hit");
         p1Total=p1.hit();
         //fro.add(p1.player.cards.get(0));
         fro=p1.player.cards;
         op = p1.player;
         pScore="Currently you have: " +p1.player.sum();
         int key = p1.check();
         if(key==3){
             busty();
             advice ="train harder for next time";
             //end method then back to new start methos!!
         }
         else{
             dealTotal=deal.value();
             //onwards();
             bg = new BasicStrategy(deal.faceCardValue(),p1.value());
             advice =bg.Basic();
         }
      
	
        
        panel.repaint();
	
								
         
     }
     if(source == stay)
     {
    	 System.out.println("stay");
         p1Total= p1.value();
         if(key!=3){
             onwards();
         }
          
         //hit.setVisible(false);
         pTurn=false;
         dTurn=true;
         
     }
      if(source == next)
     {
          panel.repaint();
         endy();
    	 System.out.println("nextt");
         
     }
    
    }
    
    
    
}
