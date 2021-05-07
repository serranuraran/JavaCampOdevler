package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void Save(Customer customer) {
		System.out.println("Save db for Nero : " +customer.getFirstName());
	}
}
