package comm.model;

public class League {

	private String title;
	private String season;
	private int iYear;

	public League(String title, String season, int iYear) {
		super();
		this.title = title;
		this.season = season;
		this.iYear = iYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public int getiYear() {
		return iYear;
	}

	public void setiYear(int iYear) {
		this.iYear = iYear;
	}

}
