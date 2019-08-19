package deck;

import java.util.*;

public class Handcard {
	private int hand;
	private int noOfCards;
	private List<Deck> list = new ArrayList<Deck>();
	private List<Object> deck = new ArrayList<Object>();

	public Handcard(int hand, int noOfCards) {
		super();
		this.hand = hand;
		this.noOfCards = noOfCards;
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				list.add(new Deck(s, r));
			}
		}

	}

	public void createDeck() {
		for (int i = 0; i < hand; i++) {
			deck.add("hand"+i);
			Collections.shuffle(list);
			for(int j = 0; j< noOfCards; j++) {
				deck.add(list.get(j));
			}

		}
		System.out.println(deck);

	}

}
