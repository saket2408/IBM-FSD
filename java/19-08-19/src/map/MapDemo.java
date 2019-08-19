package map;

import java.util.*;
import java.util.Map;

public class MapDemo {
	public static void main(String args[]) {
	Map<String, String> map ;
		map = new HashMap<String,String>();
		map.put("name", "saket");
		map.put("address", "bangalore");
		map.put("number", "12345");
		System.out.println(map);
		Set s  = map.keySet();
		System.out.println(s);
		
		Collection c = map.values();
		System.out.println(c);
	}
	
	

}
