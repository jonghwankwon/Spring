package com.example.Spring_01.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	// URL pattern mapping 으로 get이나 post방식 모두 사용 가능
	@RequestMapping("/") //루트로 매핑
	public String main(Model model) {
		// Model : 데이터에 담을 그릇 역할, map(키, 값)
		// model.addAttribute
		model.addAttribute("message", "저의 홈페이지 입니다."); // 키와 값
		return "main";
	}
}
