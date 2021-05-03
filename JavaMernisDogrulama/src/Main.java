import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Ercan Deniz");
		customer.setLastName("Durmaz");
		customer.setNationalityId("tc kimlik");
		customer.setDateOfBirtth(new Date(1997,3,15));
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.Save(customer);
	}

}
