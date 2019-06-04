package com.example.address.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.address.model.dto.AddressDTO;
import com.example.address.model.service.AddressService;


@Controller
public class AddressController {

	private static final Logger logger = LoggerFactory.getLogger(AddressController.class);
	
	@Inject
	AddressService addressService;
	
	@RequestMapping("address/list.do")
	public String addressList(Model model) {
		logger.info("--Test--");
		List<AddressDTO> list = addressService.addressList();
		model.addAttribute("list", list);
		return "address/address_list";
	}
	//회원가입 클릭 시 컨트롤러 경유
	@RequestMapping("address/write.do")
	public String write() {
		logger.info("--Test--");
		return "address/write";
	}
	@RequestMapping("address/insert.do")	// 사용자가 요청한 주소
	public String insert(@ModelAttribute AddressDTO dto) {
		logger.info("--Test--");
		addressService.insertAddress(dto);
		return "redirect:/address/list.do";
	}
	
}

