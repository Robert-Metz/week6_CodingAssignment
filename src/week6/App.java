package week6;

import java.util.List;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Johnny");
		Player player2 = new Player("Ted");
		
		List <Card> cards = deck.Shuffle(deck.cards);
		deck.setCardList(cards);
		
//		for(int i = 0; i < cards.size(); i++) {
//			System.out.println(cards.get(i).getCardName());
//		}
//		System.out.println(deck.draw(cards).getCardName());
//		System.out.println(deck.getCardList().size());
		
		

		System.out.println("Player 1 is: " + player1.name);
		System.out.println("Player 2 is: " + player2.name);
		System.out.println("**********************************************************************************");
	
		for(int i = 1; i <= 26; i++) {
			player1.draw(deck);
			System.out.println(player1.getHandList().get(0).getCardName());
			System.out.println(deck.getCardList().size());
			player2.draw(deck);
			System.out.println(player2.getHandList().get(0).getCardName());
			System.out.println(deck.getCardList().size());
		}
		
		System.out.println("**********************************************************************************");
		System.out.println(player1.name + " has " + player1.getHandList().size() + " cards.");
		System.out.println(player2.name + " has " + player2.getHandList().size() + " cards.");
		System.out.println("**********************************************************************************");
		
		for(int i = 1; i <= 26; i++) {
			Card player1Card = player1.flip(player1.getHandList());
			Card player2Card = player2.flip(player2.getHandList());
			int player1Value = player1Card.getValue();
			int player2Value = player2Card.getValue();
			String player1CardName = player1Card.getCardName();
			String player2CardName = player2Card.getCardName();
			
			System.out.println(player1.name + " flipped a " + player1CardName + " which is worth: " + player1Value);
			System.out.println(player2.name + " flipped a " + player2CardName + " which is worth: " + player2Value);

			
			if( player1Value > player2Value) {
				player1.incrementScore();
				System.out.println(player1.name + " WINS! Their score is: " + player1.score);
			}
			else if(player1Value < player2Value) {
				player2.incrementScore();
				System.out.println(player2.name + " WINS! Their score is: " + player2.score);
			}
			else {
				System.out.println("Draw");
			}
		}
		
		if (player1.score > player2.score) {
			System.out.println("**********************************************************************************");
			System.out.println("\t\t" + player1.name + " is the WINNER!\n\t\tWith a score of: " + player1.score + "\n\t\t" + player2.name + " lost with a score of: " + player2.score);
			System.out.println("**********************************************************************************");
		}
		else if (player1.score < player2.score) {
			System.out.println("**********************************************************************************");
			System.out.println("\t\t" + player2.name + " is the WINNER!\n\t\tWith a score of: " + player2.score + "\n\t\t" + player1.name + " lost with a score of: " + player1.score);
			System.out.println("**********************************************************************************");
		}
		else {
			System.out.println("**************************************************************************************");
			System.out.println("\t\tIMPOSSIBLE! ITS A DRAW! THEY TIED WITH SCORES OF " + player1.score + "-" + player2.score);
			System.out.println("**************************************************************************************");
		}
//		player1.draw(deck);
//		System.out.println(player1.getHandList().get(0).getCardName());
//		System.out.println(deck.getCardList().size());
//		
//		player2.draw(deck);
//		System.out.println(player2.getHandList().get(0).getCardName());
//		System.out.println(deck.getCardList().size());

	}

}
