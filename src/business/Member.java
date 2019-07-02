package business;

public class Member extends Person {
	
	private int memberId;
	
	public Member(int id, String firstname, String lastname, Address address, String phone, int membderId) {
		super(id, firstname, lastname, address, phone);
		this.memberId = memberId;
	}


	public int getMemberId() {
		return memberId;
	}


}
