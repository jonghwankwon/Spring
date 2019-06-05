package com.exmple.address.model.dao;

import java.util.List;

import com.exmple.address.model.dto.AddressDTO;

public interface AddressDAO {
	List<AddressDTO> listAddress();
	void insertAddress(AddressDTO dto);
	void updateAddress(AddressDTO dto);
	void deleteAddress(AddressDTO dto);
}
