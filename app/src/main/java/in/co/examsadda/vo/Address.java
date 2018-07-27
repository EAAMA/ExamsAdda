package in.co.examsadda.vo;

import java.io.Serializable;
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	private String addressId;
	private String city;
	private String country;
	private String doorNumber;
	private String locality;
	private String pincode;
	private String state;
	private String street;
	private String town;
	private boolean isNew = false;
	
	public Address() {
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

	@Override
	public String toString() {
		return "Address{" +
				"addressId='" + addressId + '\'' +
				", city='" + city + '\'' +
				", country='" + country + '\'' +
				", doorNumber='" + doorNumber + '\'' +
				", locality='" + locality + '\'' +
				", pincode='" + pincode + '\'' +
				", state='" + state + '\'' +
				", street='" + street + '\'' +
				", town='" + town + '\'' +
				", isNew=" + isNew +
				'}';
	}
}