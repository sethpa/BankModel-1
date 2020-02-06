package bank;

public class BrickandMortar extends Bank {
	
	private String address;

	public BrickandMortar() {
	
	}

	public String getAddress() {
		return address;
		
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString()	{
		return("Company Name: " + super.toString() + "\nAddress: " + address);
	}

}
