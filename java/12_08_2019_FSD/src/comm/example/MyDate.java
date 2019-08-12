package comm.example;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public void createDate(int d,int m, int y) {
		if(d>30) {
			System.out.println("day cant be greater than 30");
			System.exit(0);
		}
		else if(m>12 || m<0) {
			System.out.println("Invalid month");
			System.exit(0);
		}
		else if(y<1990 && y>2019) {
			System.out.println("invalid year");
			System.exit(0);
		}
		else {
			day = d;
			month = m;
			year = y;
		}
	}
	
	public String getDate() {
		return "Date is " + day + ":" + month +":" + year;
	}

}
