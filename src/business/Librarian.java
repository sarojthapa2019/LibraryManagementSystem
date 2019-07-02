package business;

public class Librarian extends Person {
	
	private int librarianid;
	private Role role;

	public Librarian(int id, String firstname, String lastname, Address address, String phone, int librarianid) {
		super(id, firstname, lastname, address, phone);
		this.librarianid = librarianid;
	}
	
	public void checkoutBook() {
		
	}

	public int getLibrarianid() {
		return librarianid;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
