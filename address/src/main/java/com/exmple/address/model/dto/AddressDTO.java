package com.exmple.address.model.dto;

public class AddressDTO {
	private String name;
	private String gender;
	private String tel;
	private String address;

	public AddressDTO() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "AddressDTO [name=" + name + ", gender=" + gender + ", tel=" + tel + ", address=" + address + "]";
	}
	
	
}
