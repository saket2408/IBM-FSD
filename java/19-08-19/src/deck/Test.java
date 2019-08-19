package deck;

import java.util.List;
import java.util.ArrayList;

public class Test {
	public static void main(String args[]) {
		List<Deck> deck = new ArrayList<Deck>();
		
		for(Suit s : Suit.values()) {
			for(Rank r : Rank.values()) {
				deck.add(new Deck(s,r));
			}
		}
		for(Deck d:deck) {
			System.out.println(d);
		}
		
		
	}

}
