

import java.time.LocalDate;
import java.util.Date;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args)   {
		
BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.Save(new Customer(1,"Serra" , "Aran", LocalDate.of(2002, 3, 3), "36425988756"));

	}

}