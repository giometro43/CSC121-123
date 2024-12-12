
public class Person {
	public String Name;
	public long PhoneNum;
	public String Address;
	
	public Person(String Name, String address, long PhoneNum)
	throws NameException,AddressException, TelephoneException{
		setName(Name);
		setAddress(address);
		setPhoneNum(PhoneNum);
	}	
	
	
	public String getAddress() {
		return Address;
	}
	
	
	public long getPhoneNum() {
		return PhoneNum;
	}
	
	public void setPhoneNum(long PhoneNum) throws TelephoneException{
		String phoneNumStr= Long.toString(PhoneNum);
		if(!isValidPhoneNumber(phoneNumStr)) {
			throw new TelephoneException(" Phone number can only be base 10 numbers.");
		}
		this.PhoneNum=PhoneNum;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name)throws NameException {
		if(!isValidName(Name)) {
			throw new NameException("The name can only include letters.");
		}
			this.Name=Name;
		}
	
	public void setAddress(String Address)throws AddressException{
		if(!isValidAddress(Address)) {
			throw new AddressException("The address may only be a series of numbers, a space than letters.");
		}
		this.Address=Address;
	}
	
	//Now here add the validation methods isValidAddress, 
	//isValidName, isValidPhone 
	
	public boolean isValidPhoneNumber(String phoneNumStr) {
		return phoneNumStr.matches("^[0-9]{10}$");
	}
	
	public boolean isValidName(String Name) {
		return Name.matches("^[a-zA-Z]+ [a-zA-Z]+$");
	}
	public boolean isValidAddress(String address) {
		return address.matches("^[0-9]+ [a-zA-Z]+ [a-zA-Z]+$");
	}
	
}
