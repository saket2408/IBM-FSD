package interfaces;

public class Book implements Products {

	private String name;
	private String author;

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	@Override
	public void walk() {
		System.out.println("Book name:" + name + " author: " + author + " count of products: " + Products.count);
	}

}
