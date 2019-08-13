package abstract_class.model;

public class Tester {

	public static void main(String[] args) {
		Model obj = new Line(0,20);
		Model obj1 = new Line(0,30);
		
		System.out.println(obj.isGreater(obj1));
		System.out.println(obj.isSmaller(obj1));
		System.out.println(obj.isEquals(obj1));

	}

}
