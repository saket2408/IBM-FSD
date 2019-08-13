package abstract_class.model;

public class Line extends Model {

	private int start;
	private int end;

	public Line() {

	}

	public Line(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	public int calculate() {
		return getEnd() - getStart(); 
	}

	@Override
	public boolean isGreater(Object obj) {
		Line l = (Line)obj;
		return this.calculate()>l.calculate();

	}

	@Override
	public boolean isSmaller(Object obj) {
		Line l = (Line)obj;
		return this.calculate()<l.calculate();

	}

	@Override
	public boolean isEquals(Object obj) {
		Line l = (Line)obj;
		return this.calculate()==l.calculate();
	}

}
