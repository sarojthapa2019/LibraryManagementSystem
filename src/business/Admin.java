package business;

public class Admin extends Person {
	
	private int adminId;
	private Role role;

	public Admin(int id, String firstname, String lastname, Address address, String phone, int adminId) {
		super(id, firstname, lastname, address, phone);
		this.adminId = adminId;
	}

	public int getAdminId() {
		return adminId;
	}

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
