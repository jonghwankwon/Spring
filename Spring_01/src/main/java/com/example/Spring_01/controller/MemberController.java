package com.example.Spring_01.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Spring_01.model.dto.MemberDTO;
import com.example.Spring_01.service.MemberService;

@Controller //현재 클래스를 Controller bean 으로 등록시킴
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//의존성 주입
	@Inject
	MemberService memberService;

	//회원가입 클릭 시 > MemberDAOImpl의 MemberList를 실행
	@RequestMapping("member/list.do")
	public String memberList(Model model) {
		logger.info("--Test--");
		List<MemberDTO> list = memberService.memberList();
		model.addAttribute("list", list);
		return "member/member_list";
	}
}
