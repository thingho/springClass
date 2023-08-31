package com.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dto.MemberDto;
import com.java.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override //로그인 확인
	public MemberDto selectLogin(MemberDto memberDto) {
		System.out.println("MemberServiceImpl 1 : "+ memberDto.getId());
		System.out.println("MemberServiceImpl 2 : "+ memberDto.getPw());
		MemberDto mdto = memberMapper.selectLogin(memberDto);
		
		return mdto;
	}

}
