package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionDemo {
	private String str[];
	private static Scanner sc = new Scanner(System.in); 
	private Set<String> set;
	public CollectionDemo() {
		System.out.println("enter the number of elements: ");
		str = new String[sc.nextInt()];
		for(int i = 0; i<str.length ; i++) {
			System.out.println(i+"th element: ");
			str[i] = sc.next().toString().toLowerCase();
		}
		
		set = new HashSet<String>();
		for(String s : str) {
			if(!set.add(s)) {
				System.out.println("duplicate element found---->  " + s);
			}
		}
		
		for(String s: set) {
			System.out.println(s);
		}
	}
	
	
	
}
