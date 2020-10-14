package ItacaDAM.MavenTestDAO;

public class User {

	private String name;
	private String email;

	public User(String name, String email) {
		this.email = email;
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// constructors / standard setters / getters
}
