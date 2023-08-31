package com.java.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardDto {
	
	private int bno;
	private String id;
	private String btitle;
	private String bcontent;
	private Timestamp bdate;
	private int remaindate;
	private int bhit;
	private int bgruop;
	private int bstep;
	private int bindent;
	private String[] bfiles; // list 출력할 때 사용되는 이름
	private String bfile; //파일 저장

}
