package warGame;

public class Card {
	private int rank;
	private int suit;
	
	public Card() {}
	
	public Card(int i, int j) {
		this.suit = i;
		this.rank = j;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	

}
