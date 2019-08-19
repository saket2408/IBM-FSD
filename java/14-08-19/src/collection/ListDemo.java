package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListDemo {
	public static void main(String args[]) {
		Collection<String> list = new ArrayList<String>();
		list.add("saket");
		list.add("saxena");
		list.add("saket");
		
		Iterator<String> i = list.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(list);
	}

}
