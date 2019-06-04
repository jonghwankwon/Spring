package com.example.Spring_01.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.Spring_01.model.dao.MemberDAO;
import com.example.Spring_01.model.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO memberDao;
	
	@Override
	public List<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		return memberDao.memberList();
	}
	@Override
	public void insertMember(MemberDTO vo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public MemberDTO viewMember(String userid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteMember(String userid) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateMember(MemberDTO vo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean checkPw(String userid, String passwd) {
		// TODO Auto-generated method stub
		return false;
	}
}
