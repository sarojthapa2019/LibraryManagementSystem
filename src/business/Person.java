package business;

import java.util.List;

public class Person {
	
	private int id;
	private String firstname;
	private String lastname;
	private Address address;
	
	
	public Person(int id, String firstname, String lastname, Address address, String phone) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
	}
	private String phone;


	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public Address getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
		

}
