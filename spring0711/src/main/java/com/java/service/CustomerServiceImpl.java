package com.java.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dto.CustomerDto;
import com.java.dto.MemCusDto;
import com.java.mapper.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerMapper customerMapper;
	
	//공지사항 전체 가져오기
	@Override
	public ArrayList<CustomerDto> selectAll() {

		ArrayList<CustomerDto> list = customerMapper.selectAll(); 
		return list;
	}

	//공지사항 전체 가져오기 - 2개의 테이블
	@Override
	public ArrayList<MemCusDto> selectAll2() {
		ArrayList<MemCusDto> list = customerMapper.selectAll2(); 
		return list;
	}

}
