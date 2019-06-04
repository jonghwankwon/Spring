package com.example.Spring_01.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Spring_01.model.dto.ProductDTO;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	// URL pattern mapping 으로 get이나 post방식 모두 사용 가능
	@RequestMapping("/") //루트로 매핑
	public String main(Model model) {
		// Model : 데이터에 담을 그릇 역할, map(키, 값)
		// model.addAttribute("변수","값")
		model.addAttribute("message", "저의 홈페이지 입니다."); // 키와 값
		return "main";
	}
	
	@RequestMapping(value="gugu.do", method=RequestMethod.GET)
	public String gugu(int dan, Model model) {
		String result="";
		for(int i=1; i<=9; i++) {
			result += dan + "X" + i + "=" + (dan*i) + "<br>";
		}
		model.addAttribute("result", result);
		return "test/gugu";
	}
	/*public String gugu(Model model) {
		int dan=7;
		String result="";
		for(int i=1; i<=9; i++) {
			result += dan + "X" + i + "=" + (dan*i) + "<br>";
		}
		model.addAttribute("result", result);
		return "test/gugu";
	}*/
	
	@RequestMapping("test")
//	리턴 타입이 void 인 경우 RequestMapping과 동일한 페이지로 이동 / test.jsp로 바로 넘어감
	public void test() {
		
	}
	
//	test/doA 매핑시키기
	@RequestMapping("test/doA")
	public String doA(Model model) {
		logger.info("doA Test message");
		model.addAttribute("message", "홈페이지 방문을 환영합니다."); // 키와 값
		return "test/doB";
		
	}

	//	test/doB 매핑시키기
	@RequestMapping("test/doB")
	public String doB() {
		logger.info("doB Test message");
		return "test/doB";
	}

	//	test/doC 매핑시키기
	//	Model And View로 객체와 출력페이지를 함께 가지고 전달
	//	Model : 데이터 저장소 / View : 출력 화면을 나타냄
	//	데이터와 포워드할 정보를 함께 전달
	//	forward : 
	//	redirect : 
	@RequestMapping("test/doC")
	public ModelAndView doC() {
		
		logger.info("doC Test message");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("product", new ProductDTO("샤프", 1000));
		return new ModelAndView("test/doC", "map",map);
		
	}

}
