package com.java.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/boardWrite")
	public String boardWrite() {
		return "boardWrite";
	}
	
	@PostMapping("/uploadSummernoteImageFile")
	@ResponseBody
	public String uploadSummernoteImageFile(@RequestPart MultipartFile file) throws Exception {
		String urlName ="";
		
		if(!file.isEmpty()) {
			UUID uuid = UUID.randomUUID();
			String fileName = uuid+"_"+file.getOriginalFilename();
			String fileUrl = "c:/upload/";
			File f = new File(fileUrl+fileName);
			file.transferTo(f); //파일이 서버로 저장됨 -> try-catch
			
			urlName = "/upload/"+fileName; // http://localhost:8000/upload/127iy34iy3_1.jpg
			
			System.out.println("controller filename : "+ urlName);
		}
		
		return urlName;
	}
	
	@RequestMapping("/boardList")
	public String boardList() {
		return "boardList";
	}

}
