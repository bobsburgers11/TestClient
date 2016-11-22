package Targetsystem;

public class Checkpoint {
	
	private int id;
	private int cID;
	private String deviceType;
	private float value;
	private String tariff;
	private String name;
	private String address;
	
	
	public Checkpoint(int id, int cID, String deviceType, float value,
			String tariff, String name, String address) {
		super();
		this.id = id;
		this.cID = cID;
		this.deviceType = deviceType;
		this.value = value;
		this.tariff = tariff;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public String getTariff() {
		return tariff;
	}
	public void setTariff(String tariff) {
		this.tariff = tariff;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Checkpoint [id=" + id + ", cID=" + cID + ", deviceType="
				+ deviceType + ", value=" + value + ", tariff=" + tariff
				+ ", name=" + name + ", address=" + address + "]";
	}
	
	

}
