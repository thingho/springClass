package com.java.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.dto.BoardDto;
import com.java.dto.CommentDto;
import com.java.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;

	
	@RequestMapping("/board/notice")
	public String notice(Model model) {
		ArrayList<BoardDto> list = new ArrayList<>();
		
		//게시글 전체 가져오기
		list = boardService.selectAll();
		model.addAttribute("list", list);
		
		return "/board/notice";
	} //notice
	
	@RequestMapping("/board/noticeView")
	public String noticeView(int bno, Model model) {
		
		//게시글 1개 가져오기
		BoardDto bdto = boardService.selectOne(bno);
		model.addAttribute("bdto", bdto);
		
		//하단 댓글 전체 가져오기
		ArrayList<CommentDto> comList = boardService.selectComAll(bno); 
		model.addAttribute("comList", comList);
		
		return "/board/noticeView";
	} //noticeView
	
	
	@RequestMapping("/board/commentInsert")
	@ResponseBody //데이터로 리턴해서 가져와라
	public CommentDto commentInsert(CommentDto comDto) {
		System.out.println("ajax에서 넘어온 데이터1 : "+comDto.getCcontent());

		//하단댓글 저장, 1개 가져오기
		CommentDto cdto = boardService.commnetInsert(comDto);
		
		return cdto;
	} //commentInsert
	
	
	@RequestMapping("board/commentDelete")
	@ResponseBody //데이터로 리턴해서 가져와라
	public String commentDelete(int cno) {
		System.out.println("ajax 넘어온 데이터 : "+cno);
		
		//하단 댓글 1개 삭제하기
		boardService.commentDelete(cno);
		
		String result = "success";
		return result;
	} //commentDelete
	
	
	@RequestMapping("board/commentUpdateSave") //수정한 댓글 저장
	@ResponseBody //데이터로 리턴해서 가져와라
	public CommentDto commentUpdateSave(CommentDto comDto) {
		System.out.println("BoardController commentUpdateSave : "+comDto.getCcontent());
		
		//수정한 하단 댓글 저장
		CommentDto cdto = boardService.commentUpdateSave(comDto);
		//String result = "success";
		return cdto;
	} //commentUpdateSave 
	
}
