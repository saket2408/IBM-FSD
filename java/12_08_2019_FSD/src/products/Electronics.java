package products;

public class Electronics extends Products {
	private String year;

	public Electronics() {
		super();
	}

	public Electronics(int rate, String year) {
		super(rate);
		this.year = year;
	}

	@Override
	public String getDetails() {
		return super.getDetails() + " year: " + year;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
