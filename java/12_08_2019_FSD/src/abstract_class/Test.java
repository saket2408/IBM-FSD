package abstract_class;

public class Test {
	public static void main(String args[]) {
		Flyer f = new Bird();
		f.fly();
		f = new Superman();
		f.fly();
	}

}
