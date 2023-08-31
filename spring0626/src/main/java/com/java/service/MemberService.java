package com.java.service;

import org.springframework.stereotype.Service;

import com.java.dto.MemberDto;

@Service
public interface MemberService {
	
	//로그인 확인
	MemberDto selectLogin(String id, String pw);


}
