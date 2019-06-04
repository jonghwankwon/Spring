package com.example.address.model.dto;

public class AddressDTO {
	private String gender;
	private String name;
	private String tel;
	private String address;
	
	public AddressDTO() {
		super();
	}
	
	public AddressDTO(String gender, String name, String tel, String address) {
		super();
		this.gender = gender;
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "AddressDTO [gender=" + gender + ", name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}
	
	
	
}
