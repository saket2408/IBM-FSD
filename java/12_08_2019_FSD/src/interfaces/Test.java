package interfaces;

public class Test {
	public static void main(String args[]) {
		Products book = new Book("ab", "cd");
		book.walk();
		// implementing anonymous inner class
		Dog dog = new Dog("xy", "yz");
		dog.getDetails();
	}

}
