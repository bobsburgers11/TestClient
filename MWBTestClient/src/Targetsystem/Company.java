package Targetsystem;

public class Company {
	
	private int cID;
	private String name;
	private String street;
	private String zip;
	private String town;
	

	
	public Company(int cID, String name, String street, String zip, String town) {
		super();
		this.cID = cID;
		this.name = name;
		this.street = street;
		this.zip = zip;
		this.town = town;
	}
	

	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Company [cID=" + cID + ", name=" + name + ", street=" + street
				+ ", zip=" + zip + ", town=" + town + "]";
	}

}
