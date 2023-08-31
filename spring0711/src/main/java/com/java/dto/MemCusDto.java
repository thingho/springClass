package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemCusDto {
	
	private MemberDto memberDto;
	private CustomerDto customerDto;

}
