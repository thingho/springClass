package com.java.service;

import java.util.ArrayList;

import com.java.dto.MemberDto;

public interface MemberService {
	
	//회원 전체 가져오기
	ArrayList<MemberDto> memberSelectAll();

	//회원 1명 가져오기
	MemberDto memberSelectOne(String id);

}
