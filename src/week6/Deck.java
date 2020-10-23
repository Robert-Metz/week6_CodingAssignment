package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Deck {
	
	
	HashMap<Integer, String> cardValTranslator = new HashMap<Integer, String>();
	String[] valString = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	
	List<Card> cards = new ArrayList<Card>();
	
	String[] cardName = {"Diamonds", "Hearts", "Spades", "Clubs"};
	
	
	public Deck () {
		
		for (int i = 0; i < valString.length; i++) {
			cardValTranslator.put(i+2, valString[i]);
			
		}
		
		
		for(int name = 0; name < cardName.length; name++) {
			
			for(int val = 2; val <= 14; val++) {
				String fullCardName = cardValTranslator.get(val) + " of " + cardName[name] ;
				Card singleCard = new Card(val, fullCardName);
				cards.add(singleCard);
			}
		}
		

	}
	
	public List <Card> getCardList(){
		return cards;
		
	}
	
	public void setCardList(List <Card> newCardList) {
		this.cards = newCardList;	
	}

	public List <Card> Shuffle (List <Card> shuffledCards) {
		Collections.shuffle(shuffledCards);
		return shuffledCards;
		
	}
	
	public Card draw(List <Card> singleDraw) {
		Card removedCard = singleDraw.get(0);
		singleDraw.remove(0);
		setCardList(singleDraw);
		return removedCard;
		
	}
	
	
}
