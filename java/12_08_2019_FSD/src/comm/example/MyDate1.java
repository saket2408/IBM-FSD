package comm.example;

public class MyDate1 {
	private int day;
	private int month;
	private int year;

	//constructor chaining
	public MyDate1() {
		this(24);
	}

	public MyDate1(int day) {
		this(day, 8);
	}

	public MyDate1(int day, int month) {
		this(day, month, 1997);
	}

	public MyDate1(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}//end of chaining

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public boolean setDay(int d) {
		if (d > 30) {
			return false;
		} else {
			day = d;
			return true;
		}
	}

	public boolean setMonth(int m) {
		if (m > 12) {
			return false;
		} else {
			month = m;
			return true;
		}
	}

	public boolean setYear(int y) {
		if (y > 2019) {
			return false;
		} else {
			year = y;
			return true;
		}
	}

}
