package deck;

import java.util.Scanner;

public class Test1 {
	public static void main(String Args[]) {
		int hand;
		int noOfCards;
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("enter number of hands : ");
		hand = scanner.nextInt();
		System.out.println("enter number of cards in each hand : ");
		noOfCards = scanner.nextInt();
		Handcard handcard = new Handcard(hand,noOfCards);
		
		handcard.createDeck();
		}
		while(true);
		
	}

}
