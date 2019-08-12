package products;

public class Book extends Products {
	private String bookName;
	private String author;

	public Book() {
		super();
	}

	public Book(int rate, String bookName, String author) {
		super(rate);
		this.bookName = bookName;
		this.author = author;
	}

	@Override
	public String getDetails() {
		return super.getDetails() + " book name: " + bookName + " author: " + author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
