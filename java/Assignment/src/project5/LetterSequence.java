package project5;

import java.util.Map;
import java.util.TreeMap;

public class LetterSequence {

	private String sentence;
	private TreeMap<Character, Integer> frequency = new TreeMap<Character,Integer>();

	public LetterSequence(String sentence) {
		super();
		this.sentence = sentence;
	}

	public TreeMap<Character,Integer> computeFrequency(){
		 char[] stringArray = sentence.toCharArray();
		 for (char c : stringArray)
	        {
	            if(frequency.containsKey(c))
	            {
	                frequency.put(c, frequency.get(c)+1);
	            }
	            else
	            {
	                frequency.put(c, 1);
	            }
	        }
		 return frequency;
		
	}
	
	public void displayLetterFrequency(TreeMap<Character,Integer> frequencyMap) {
		for(Map.Entry<Character,Integer> map : frequencyMap.entrySet()) {
				Character key = map.getKey();
			  Integer value = map.getValue();
			  System.out.print(key + ":");
			  for(int i =0 ;i<value;i++) {
				  System.out.print('*');
			  }
			  System.out.println("\n");
		}
		
	}
}
