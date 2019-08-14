package enumeration;

public class TennisCoach implements Coach {

	private String coachName;
	private Level level;

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	@Override
	public String getDailyWorkout() {
		return "leg workout..";

	}
	
	public void creatCoach(String name, Level level) {
		this.coachName = name;
		this.level = level;
	}

	public String getCoachDetails() {
		StringBuilder s = new StringBuilder();
		System.out.println(s);
		s.append("today's workout plan is : " + getDailyWorkout() + "\n");
		s.append("coach name : " + getCoachName()+ "\n");
		s.append("coach level : " + getLevel() + "\n");
		s.append("coach rank is : " + level.getLEvelCode() + "\n");
		return s.toString();
	}
}
