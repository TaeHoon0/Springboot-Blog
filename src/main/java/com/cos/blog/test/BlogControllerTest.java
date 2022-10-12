package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// com.cos.blog 패키지 아래의 특정 어노테이션이 붙어있는 클래스 파일들을  
// new 해서(IoC) 스프링 컨테이너에서 관리
@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello Spring Boot </h1>";
	}
}
