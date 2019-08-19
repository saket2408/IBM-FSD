package deck;

public class Deck {
	private Suit suit;
	private Rank rank;
	public Deck(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Deck [suit=" + suit + ", rank=" + rank + "]";
	}
	
	

}
