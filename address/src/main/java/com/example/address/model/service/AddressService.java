package com.example.address.model.service;

import java.util.List;

import com.example.address.model.dto.AddressDTO;

public interface AddressService {

	public List <AddressDTO> addressList();
	public void insertAddress(AddressDTO vo);
	public void deleteMember(String name);
	public void updateMember(AddressDTO vo);
}
