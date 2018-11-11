package API_Class_4_RestAssured.API_Class_4;

public class Basic_Data {
	
	private String firstname;
	private String lastname;
	private int age;
	private Address[] Address;
	
	public Address[] getAddress() {
		return Address;
	}
	public void setAddress(Address[] address) {
		this.Address = address;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}