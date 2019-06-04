package com.example.address.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.example.address.model.dto.AddressDTO;

public class AddressDAOImpl implements AddressDAO {
	
	@Inject
	SqlSession sqlSession;

	@Override
	public List<AddressDTO> addressList() {
		return sqlSession.selectList("address.addressList");
	}

	@Override
	public void insertAddress(AddressDTO vo) {
		sqlSession.insert("address.insertAddress", vo);
	}

	@Override
	public void deleteMember(String name) {
		sqlSession.delete("address.deleteAddress", name);
		
	}

	@Override
	public void updateMember(AddressDTO vo) {
		sqlSession.update("address.updateAddress", vo);
		
	}
	
}
