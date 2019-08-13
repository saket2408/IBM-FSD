package singleton;

public class Test {

	public static void main(String[] args) {
		Messaging m = Messaging.createObject("saket");
		System.out.println(m);
		Messaging m1 = Messaging.createObject("sdada");
		System.out.println(m1);

	}

}
