package enumeration;

public enum Level {
	Low(1),
	Medium(2),
	High(3);
	private int levelCode;
	private Level(int levelCode) {
		this.levelCode = levelCode;
	}
	public int getLEvelCode() {
		return levelCode;
	}
}
