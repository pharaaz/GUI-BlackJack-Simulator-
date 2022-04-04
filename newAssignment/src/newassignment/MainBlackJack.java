/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newassignment;

import java.util.Scanner;
import java.sql.ResultSet;


/*
 * This is the main method of my assessment, I choose to do the 
 * topic of BlackJack.
 * 
 * This project will simulate a player vs dealer blackjack game, where the dealer must draw to 17.
 * Project also uses basic strategy for blackjack to assist the player to make good decisions in game. 
 * 
 * All players are saved onto a text file with their balance so they can continue playing with same balance.
 * 
 * 
 * @author Faraaz Khan pgx2172

 */

public class MainBlackJack implements Runnable{
    
   private static float money=0;
   private static float bet=0;
  // SecondGUI gui = new SecondGUI();
   //private static int key = 2;
  // Gui gui = new Gui();
   UserGUI frame = new UserGUI();
   
   public static void main(String[] args) {
       
       new Thread( new MainBlackJack() ).start();
       
            	UserGUI frame = new UserGUI();
            	
            //ConnectDB conecty=new ConnectDB();
            //conecty.connectToDB();
            
          
	}
    
    @Override
    public void run() {
       while(true){
           
          // gui.refreshy();
        frame.repaint();
          // gui.repaint();
       }
    }
}
   

