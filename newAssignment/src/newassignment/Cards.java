/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newassignment;

/*
 * class used for each individual card
 * @author Faraaz Khan 17985055
 */

public class Cards {
	
	private CardValues value;
	private CardSuit suit;
        private String num;
        private int suitType;
	
	
	public Cards (CardValues value,CardSuit suit) {
		this.value=value;
		this.suit=suit;
	}
	
	//toString to print out the indivual cards. 
	public String toString() {
		return"Cards are: " +this.suit +"-----" +this.value;
	}
	
	public CardSuit getSuit() {
		return this.suit;
	}
	
	public CardValues getValue() {
		return this.value;
	}
        
        public String getCardValue(){
           
		//CardValues face=value;
		
			switch(value){
			case TWO: num = "2"; break;
			case THREE: num = "3"; break;
			case FOUR: num = "4"; break;
			case FIVE: num = "5"; break;
			case SIX: num = "6"; break;
			case SEVEN: num = "7"; break;
			case EIGHT: num = "8"; break;
			case NINE: num = "9"; break;
			case TEN: num = "10"; break;
			case JACK: num = "J"; break;
			case QUEEN: num = "Q"; break;
			case KING: num = "K"; break;
			case ACE: num = "A"; break;
			}
		
	
            return num;
        }
        
        public int getCardSuity(){
            switch(suit) {
			case SPADES: suitType =1; break;
			case DIAMONDS: suitType=2; break;
			case HEARTS: suitType=3; break;
			case CLUBS: suitType=4;break;
			}
            return suitType;
        }
        
        
     
	

}