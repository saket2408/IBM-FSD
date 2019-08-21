package project3;

import java.util.ArrayList;
import java.util.List;

public class Country {

	private String name;
	private List<State> stateList = new ArrayList<State>();
	
	
	public Country(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<State> getStateList() {
		return stateList;
	}
	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}
	

}
