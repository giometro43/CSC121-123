
public class Main {

	public static void main(String[] args) {
		try {
			Person Gio = new Person("Giovanni Castillo", "1000 Victoria St", 3234223163L);
			
			Customer Gio1 = new Customer("Giovanni Castillo", "1001 Victoria St", 3234213164L,true ,31);
			
			System.out.println("Person Name: " + Gio.getName());
            System.out.println("Person Address: " + Gio.getAddress());
            System.out.println("Person Telephone: " + Gio.getPhoneNum());
            
            System.out.println("Customer Name: " + Gio1.getName());
            System.out.println("Customer Address: " + Gio1.getAddress());
            System.out.println("Customer Phone: " + Gio1.getPhoneNum());
            System.out.println("Customer Mail list ? : "+Gio1.getmailingList());
            System.out.println("Customer Number: " + Gio1.getcustomerNum());
            
		}
		catch(NameException | AddressException | TelephoneException e) {
			 System.err.println("Exception: " + e.getMessage());
		}
		
	}

}
