/*
 * A field for a customer number
 * Boolean for mailing list
 */

public class Customer extends Person{
	public boolean mailingList;
	public int customerNum;
	
	public boolean getmailingList() {
		return mailingList;
	}
	
	public int getcustomerNum() {
		return customerNum;
	}
	
	public void setmailingList(boolean mailingList) {
		this.mailingList=mailingList;
	}
	public void setcustomerNum(int customerNum) {
		this.customerNum=customerNum;
	}
	
	public Customer(String Name, String Address, long PhoneNum, boolean mailingList, int customerNum)
	throws NameException, AddressException, TelephoneException{
		 super(Name,Address,PhoneNum);
		 this.mailingList=mailingList;
		 this.customerNum=customerNum;
	}
	
	
}
