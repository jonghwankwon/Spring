package com.exmple.address.model.service;

import java.util.List;

import com.exmple.address.model.dto.AddressDTO;

public interface AddressService {
	List<AddressDTO> listAddress();
	void updateAddress(AddressDTO dto);
	void deleteAddress(int product_id);
	void insertAddress(AddressDTO dto);
}
