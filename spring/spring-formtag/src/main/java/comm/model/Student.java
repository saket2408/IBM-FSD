package comm.model;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favLanguague;
	private String[] operatingSystem;

	

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("bra", "Brazil");
		countryOptions.put("ind", "India");
		countryOptions.put("pak", "Pakistan");
		countryOptions.put("aus", "Australia");
		countryOptions.put("usa", "USA");
		countryOptions.put("chn", "China");

	}
	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavLanguague() {
		return favLanguague;
	}

	public void setFavLanguague(String favLanguague) {
		this.favLanguague = favLanguague;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
