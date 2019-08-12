package products;

public class tester {
	public static void main(String args[]) {
		Products p = new Products(2000);
		System.out.println(p.getDetails());
		System.out.println(Products.getCount());
		
		 p = new Book(2000, "abc" , "abcdef");
		System.out.println(p.getDetails());
		System.out.println(Products.getCount());
		
		p = new tv(23000, "2019", "mi");
		System.out.println(p.getDetails());
		System.out.println(Products.getCount());
		
		System.out.println(Products.getTax());
	}

}
