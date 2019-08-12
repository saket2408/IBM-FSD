package products;

public  class Products {

	private int rate;
	private static int count;
	
	//final variable cannot be modified
	private static final double TAX= 12.06;
	
	
	public Products() {
		super();
	}

	public Products(int rate) {
		super();
		this.rate = rate;
		count++;
	}
	//static method
	public static String getCount() {
		return "count is : " + count; 
	}
	
	//static method returning final variable
	public static String getTax() {
		return "tax is : " + TAX; 
	}
	
	public String getDetails() {
		return "rate is : " + rate;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	
	
	
	
}
