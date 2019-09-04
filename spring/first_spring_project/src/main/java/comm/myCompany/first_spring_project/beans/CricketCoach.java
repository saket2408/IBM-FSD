package comm.myCompany.first_spring_project.beans;

public class CricketCoach  {
	CoachService service;
	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CoachService getService() {
		return service;
	}

	public void setService(CoachService service) {
		this.service = service;
	}

	public String getWorkout() {
		// TODO Auto-generated method stub
		return "do 100 squats";
	}

	public String getDailyfortune() {
		return service.getDailyFortune();
	}

}
