package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();
	
	public Deck() {}
	
		

	public Deck(boolean bPopulate) { // populate deck with 52 cards and shuffle
		if (bPopulate) {
			for (int i = 0; i < 4; i++) { // suits
				for (int j = 2; j < 15; j++) { // rank
					//String card = "" + i + j;
					Card card = new Card(i,j);
					deck.add(card);
				}
			}
			Collections.shuffle(deck);
		}
	}
	
	public int getDeckSize() {
		return deck.size();
	}
	
	public void printDeck() {
		for (Card card : deck) {
			System.out.println("" + card.getSuit() + " " + card.getRank());
		}
	}
	
	public Card dealCard() {
		if (deck.size() > 0) {
			
			return deck.remove(deck.size() -1);
		}
		
		return null;
		
	}
	
	public Card takeCard(Card card) {
		deck.add(card);
		return card;
	}
	
	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	

}
