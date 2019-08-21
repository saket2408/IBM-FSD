package project5;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeMap<Character, Integer> frequency = new TreeMap<Character,Integer>();
		System.out.println("Enter input string:");
		String sentence = scanner.nextLine();
		LetterSequence letter = new LetterSequence(sentence);
		frequency = letter.computeFrequency();
		letter.displayLetterFrequency(frequency);
	}

}
