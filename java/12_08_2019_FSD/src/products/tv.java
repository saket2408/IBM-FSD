package products;

public class tv extends Electronics {
	private String brand;

	public tv() {
		super();
	}

	public tv(int rate, String year, String brand) {
		super(rate, year);
		this.brand = brand;
	}

	@Override
	public String getDetails() {
		return super.getDetails() + " brand: " + brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
