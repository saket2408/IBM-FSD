package inner_class;

import inner_class.Model.Square;

public class Test {

	public static void main(String[] args) {
		Model m = new Model();
		Model.Square s = m.new Square();//inner class object
		Square.Rectangle r = s.new Rectangle();//inner se bhi inner class object
		
		m.outerClass();
		s.innerClass();
		r.innerToInner();
		
	}

}
