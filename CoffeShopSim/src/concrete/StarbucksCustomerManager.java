package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

private CustomerCheckService customerCheckService ;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService){
		
		this.customerCheckService = customerCheckService;
	}
	
	
	
	@Override
	public void Save(Customer customer) {
		
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		
		
	}

	
}
}