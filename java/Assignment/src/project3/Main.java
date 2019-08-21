package project3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of elements: ");
		int count = scanner.nextInt();
		int k = 0;
		String[] strArray = new String[2];
		Country[] country=new Country[count];
		String string;
		for(int i=0;i<count;i++) {
			
			boolean flag = false;
			int index=0;
			string = scanner.next();
			strArray = string.split("\\|");
			for(int j =0;j<k;j++) {
				if(strArray[0].equals(country[j].getName())) {
					flag=true;
					index=j;
					k--;
				}
				}
			if(flag) {
				country[index].setStateList(new State(strArray[1]));
			}
			else {
				country[k] = new Country(strArray[0]);
				country[k].setStateList(new State(strArray[1]));
			}
			k++;
		}
		
		for(int i=0;i<k;i++) {
			System.out.println(country[i].getName());
			Set<State> stateList = country[i].getStateList();
			for(State l: stateList) {
				System.out.println("--"+l);
			}
			
		}
	}

}
