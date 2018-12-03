package kr.or.kosta.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/sample/*")
@Controller
public class SampleController {

	@GetMapping("/all")
	public void doAll() {
		log.info("모든 사용자 접근 가능 페이지");
	}
		
	@GetMapping("/member")
	public void doMember() {
		log.info("멤버만 접근 가능 페이지");			
	}
		
	@GetMapping("/admin")
	public void doAdmin() {
		log.info("관리자만 접근 가능 페이지");
	}

}
