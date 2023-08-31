package com.java.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.java.dto.CustomerDto;
import com.java.dto.MemCusDto;

@Service
public interface CustomerService {

	//공지사항 전체 가져오기
	ArrayList<CustomerDto> selectAll();

	//공지사항 전체 가져오기 - 2개 테이블
	ArrayList<MemCusDto> selectAll2();

}
