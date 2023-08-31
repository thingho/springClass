package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor //전체 생성자
@NoArgsConstructor //기본 생성자
@Data //getter,setter
public class MemberDto {
	
	private String id,pw,name,phone,gender;
	private String[] hobbys;
	private String hobby;

}
