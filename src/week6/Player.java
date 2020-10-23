package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	int score;
	String name = "";
	
	
	public Player(String name) {
		score = 0;
		this.name = name;
	}
	
	public List <Card> getHandList(){
		return hand;
	}
	
	public void setHandList(List <Card> newHandList) {
		this.hand = newHandList;	
	}
	
	public void  describePlayer() {
		System.out.println("Player name: " + name + "\nPlayer score: " + score + "\nPlayer hand list: ");
		for(int i = 0; i < hand.size(); i++) {
			hand.get(i).cardDescribe();
			}
	}
	
	
	public Card flip(List <Card> currentHand) {
		Card returnCard = currentHand.get(0);
		currentHand.remove(0);
		setHandList(currentHand);
		return returnCard;
		
	}
	public void draw(Deck pulledDeck) {
		List <Card> myHand = getHandList();
		myHand.add(pulledDeck.draw(pulledDeck.getCardList()));
		System.out.print(name + " drew: ");
		
	}
	
	public void incrementScore() {
		score += 1;
	}
	
	
}

