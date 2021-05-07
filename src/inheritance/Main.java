package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.id = 1;
		engin.firstName = "Engin";
		engin.lastName = "Demiroð";
		engin.customerNumber = "1234";
		engin.nationalId = "10000000001";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "1025";
		
		UnionCustomer abc = new UnionCustomer();
		abc.customerNumber = "39999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer [] customers = {engin, abc, hepsiBurada};
		
		
		customerManager.addMultiple(customers);
		
		
	}

}
