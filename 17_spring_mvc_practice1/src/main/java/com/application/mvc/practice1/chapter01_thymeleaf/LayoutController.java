package com.application.mvc.practice1.chapter01_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/th/layout")
public class LayoutController {

	@GetMapping("/content1")
	public String content1() {
		return "chapter01_thymeleaf/layout/ex/content1";
	}
	
	@GetMapping("/content2")
	public String content2() {
		return "chapter01_thymeleaf/layout/ex/content2";
	}
	
	@GetMapping("/content3")
	public String content3() {
		return "chapter01_thymeleaf/layout/ex/content3";
	}
	
	@GetMapping("/index")
	public String index() {
		return "chapter01_thymeleaf/layout/bootstrap/index";
	}
	
	@GetMapping("/blog")
	public String blog() {
		return "chapter01_thymeleaf/layout/bootstrap/blog";
	}
	
	@GetMapping("/shop")
	public String shop() {
		return "chapter01_thymeleaf/layout/bootstrap/shop";
	}
}
