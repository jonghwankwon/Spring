package com.example.Spring_01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_01.model.dto.ProductDTO;

//ajax 처리 전용 컨트롤러
// 스프링 4.0부터 사용 가능
@RestController
public class SampleRestController {
	private static final Logger logger = LoggerFactory.getLogger(SampleRestController.class);
	
	@ResponseBody	//JSON 형식으로 데이터를 리턴
	@RequestMapping("test/doF")
	public ProductDTO doF(){
		logger.info("doF test-------");
		return new ProductDTO("냉장고", 500000); //JSON 데이터가 처리됨
	}
}

	/*
	 * @RestController 대신 @Controll을 사용해도 됨
	 * 하지만 현업에서는 3.0 버전을 사용
	 * 만약 3.0 버전에서 @Controller을 사용한다면  반드시 @ResponeBody를 해주어야함
	 * @RestController 는 @ResponeBody를 생략 가능
	 * 
	 */


