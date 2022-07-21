package week1day4;

public class Business {
	
	private String name;
	protected String address;
	
	public Business() {
		name = "";
		address = "";
	}
	
	public Business(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void getDescription() {
		System.out.println("Name: " + name + ", Address: " + address);
	}
	
	public String getName() {
		return name;
	}
	
	

}
