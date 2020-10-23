package week6;

public class Card {
	
	int value = 0;
	String cardName = "";
	
	public Card (int val, String name) {
		value = val;
		cardName = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int cardValue) {
		this.value = cardValue;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public void cardDescribe() {
		System.out.println(cardName);
	
	}
	
}
