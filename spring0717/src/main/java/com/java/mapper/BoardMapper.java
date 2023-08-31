package com.java.mapper;

import java.util.ArrayList;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.java.dto.BoardDto;
import com.java.dto.PageDto;

@Mapper
public interface BoardMapper {

	//게시글 전체 가져오기
	ArrayList<BoardDto> selectAll(PageDto pageDto);

	//전체 게시글 수
	int selectListCount();

	// 게시글 1개 저장
	void insertBoard(BoardDto boardDto);

}
