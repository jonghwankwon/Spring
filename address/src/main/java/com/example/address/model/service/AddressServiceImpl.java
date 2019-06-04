package com.example.address.model.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.example.address.model.dao.AddressDAO;
import com.example.address.model.dto.AddressDTO;

public class AddressServiceImpl implements AddressService {

	@Inject
	AddressDAO addressDao;

	@Override
	public List<AddressDTO> addressList() {
		return addressDao.addressList();
	}

	@Override
	public void insertAddress(AddressDTO vo) {
		addressDao.insertAddress(vo);
	}

	@Override
	public void deleteMember(String name) {
		addressDao.deleteMember(name);
	}

	@Override
	public void updateMember(AddressDTO vo) {
		addressDao.updateMember(vo);
	}
}
