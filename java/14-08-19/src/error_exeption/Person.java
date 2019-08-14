package error_exeption;

public class Person {
	private String name;
	private String lname;

	public Person() {
		super();
	}

	public Person(String name, String lname) {
		super();
		this.name = name;
		this.lname = lname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lname=" + lname + "]";
	}

	public void createPerson(String name, String lname) throws NameIsNotValidException {

		if (!((name.charAt(0) >= 'A') && (name.charAt(0) <= 'Z') && (lname.charAt(0) >= 'A')
				&& (lname.charAt(0) <= 'Z'))) {
			throw new NameIsNotValidException("name and last name should start with capital letter");
		}

		this.lname = lname;
		this.name = name;
	}

	public void equals(Object obj, Object obj1) throws ObjectSameException {
		Person p = (Person) obj;
		Person q = (Person) obj1;
		if ((q.lname.equals(p.lname)) && (q.name.equals(p.name))) {
			throw new ObjectSameException("sorry boss, credentials already exists");
		}

	}

}
