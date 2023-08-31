package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.service.EmailService;

@Controller
public class EmailController {

	@Autowired EmailService emailService;    //controller에다가 service를 붙여줘야한다
	
	@RequestMapping("/member/idsearch")
	public String idsearch() {
		return "member/idsearch";
	}

	@RequestMapping("/email/emailSend")
	@ResponseBody     //데이터로 변환해서넘기기
	public String emailSend(String name, String email) {
		System.out.println("name" + name);
		System.out.println("email" + email);
		
		//임시비밀번호 생성
		String pwCode = emailService.insertPwCode(name,email);
		
		//문자인증 코드 생성
		//공공 데이터 api 데이터 받아왔을때 구문 넣으면 됨
		
		return pwCode;
	}
	
}
