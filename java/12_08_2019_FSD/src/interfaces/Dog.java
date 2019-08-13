package interfaces;

public class Dog {
	private String name;
	private String breed;

	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public void getDetails() {

		// anonymous inner class
		Products product = new Products() {

			@Override
			public void walk() {
				System.out.println("Dog name : " + name + " breed: " + breed + " count: " + Products.count);
			}

		};
		product.walk();
	}

}
