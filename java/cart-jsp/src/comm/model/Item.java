package comm.model;

public class Item {

	private String name;
	private String discription;
	private String price;
	private String category;
	private String quantity;


	public Item(String name, String discription, String price, String category, String quantity) {
		super();
		this.name = name;
		this.discription = discription;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
