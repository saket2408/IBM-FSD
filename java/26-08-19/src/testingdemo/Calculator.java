package testingdemo;

public class Calculator {

	private int x;
	private int y;
	private int result;
	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int addMethod() {
		result = x+y;
		return result;
	}
	public int subMethod() {
		result = x-y;
		return result;
	}
	public int greaterMethod() {
		if(x>y) {
			return 1;
		}
		else if(x<y) {
			return -1;
		}
		else {
			return 0;
		}
	}
	

}
