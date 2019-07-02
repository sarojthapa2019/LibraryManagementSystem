package business;

public class Author extends Person {
	
	private String credentials;
	private String bio;

	public Author(int id, String firstname, String lastname, Address address, String phone, String credentials, String bio) {
		super(id, firstname, lastname, address, phone);
		this.credentials = credentials;
		this.bio = bio;
	}

	public String getCredentials() {
		return credentials;
	}

	public String getBio() {
		return bio;
	}
	
	
	
}
