package business;

import java.util.List;

public interface Record {
	
	abstract List<Fine> allFines();
	abstract List<CheckoutRecord> checkoutRecords(Member member);

}
