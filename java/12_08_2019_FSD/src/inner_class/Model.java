package inner_class;

public class Model {
	private int a;
	private int b;

	public void outerClass() {
		System.out.println("x: " + a + " y: " + b);
	}
	
	//inner class
	public class Square{
		public void innerClass() {
			a=10;
			b=20;
			outerClass();
		}
		
		//inner se bhi inner class
		public class Rectangle{
			public void innerToInner() {
				a= 100;
				b = 200;
				outerClass();
			}
		}
	}

}
