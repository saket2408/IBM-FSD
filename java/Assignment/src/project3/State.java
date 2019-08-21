package project3;

import project1.Employee;

public class State implements Comparable<Object> {

	private String stateName;

	public State() {
		super();
	}

	public State(String stateName) {
		super();
		this.stateName = stateName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public int compareTo(Object o) {
		State s = (State) o;
		if (this.getStateName() == s.getStateName()) {
			return 0;
		} else if (this.getStateName().compareTo(s.getStateName()) > 0 ) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return stateName;
	}

}
