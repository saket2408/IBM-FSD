package abstract_class;

public class Superman extends Flyer{

	@Override
	public void fly() {
		System.out.println("superman fly");
	}

	@Override
	public void land() {
		System.out.println("superman land");
	}

	@Override
	public void takeoff() {
		System.out.println("takeoff takeoff");
	}

}
