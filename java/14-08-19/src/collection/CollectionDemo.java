package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionDemo {
	private String str[];
	private static Scanner sc = new Scanner(System.in); 
	private Set<String> set = new HashSet<String>();
	public CollectionDemo() {
		System.out.println("enter the number of elements: ");
		str = new String[sc.nextInt()];
		for(int i = 0; i<str.length ; i++) {
			System.out.println(i+"th element: ");
			str[i] = sc.next().toString().toLowerCase();
			if(!set.add(str[i])) {
				System.err.println("duplicate element found---->  " + str[i]);
				
			}
		}
		
		System.out.println("Elements in set are: ");
		for(String s: set) {
			System.out.println(s);
		}
	}
	
	
	
}
