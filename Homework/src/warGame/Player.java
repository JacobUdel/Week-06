package warGame;

public class Player {
	public static void main(String[] args) {
		Deck deck = new Deck(true);
		Deck hand1 = new Deck();
		Deck hand2 = new Deck();
		Deck discard = new Deck();
		Card card1 = new Card();
		Card card2 = new Card();
		
		
		// Deal out hands
		for (int i = 0; i < 26; i++) {
			hand1.takeCard(deck.dealCard());
			hand2.takeCard(deck.dealCard());
		}
		
		// play game
		while (hand1.getDeckSize() > 0 && hand2.getDeckSize() > 0) {
			card1 = discard.takeCard(hand1.dealCard());
			card2 = discard.takeCard(hand2.dealCard());
			if ((hand1.getDeckSize() > 0 && hand2.getDeckSize() > 0) && (card1.getRank() > card2.getRank())) {
				moveDecks(hand1, discard);
			} else if ((hand1.getDeckSize() > 0 && hand2.getDeckSize() > 0) && (card1.getRank() < card2.getRank())) {
				moveDecks(hand2, discard);
			} else { //War
				for (int i = 0; i < 3; i++) {
					card1 = discard.takeCard(hand1.dealCard());
					card2 = discard.takeCard(hand2.dealCard());
				}
			}
			
		}
		
		//Results
		if (hand1.getDeckSize() == 0) {
			System.out.println("Hand 2 wins!");
		} else {
			System.out.println("Hand 1 wins!");
		}

	}
	
	public static void moveDecks(Deck toDeck, Deck fromDeck) {
		int i = fromDeck.getDeckSize();
		while (i > 0) {
			toDeck.takeCard(fromDeck.dealCard());
			i = fromDeck.getDeckSize();
		}
	}
}
