package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.dao.GoodsDAO;
import com.example.domain.GoodsVO;
import com.example.domain.NaverAPI;
import com.example.domain.QueryVO;
import com.example.service.GoodsService;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	
	@Autowired
	GoodsService service;
	
	@Autowired
	GoodsDAO dao;
	
	
	@GetMapping("/search") //테스트 /goods/search?query=4080&page=1&size=5
	public String search(@RequestParam("query") String query, @RequestParam("page") int page, @RequestParam("size") int size) {
		String result="";
		result = NaverAPI.search(query, page, size);
		return result;
	}
	
	
	
	@PostMapping("/insert")
	public int insert(@RequestBody GoodsVO vo) {
		return service.insert(vo);
	}
	
	@GetMapping("/list") //테스트 => /goods/list?page=1&size=3
	public HashMap<String, Object> list(QueryVO vo){
		return service.list(vo);
	}
	
	@PostMapping("/delete/{gid}")
	public void delete(@PathVariable("gid") String gid) {
		dao.delete(gid);
	}
	
	@PostMapping("/update/{gid}")
	public void update(@RequestBody GoodsVO vo) {
		dao.updqte(vo);
	}
	
	@GetMapping("/read/{gid}")
	public GoodsVO read(@PathVariable("gid") String gid) {
		return dao.read(gid);
	}
	
	//이미지 업로드
	@PostMapping("/update/image/{gid}")
	public void updateImage(@PathVariable("gid") String gid, MultipartHttpServletRequest multi) throws IllegalStateException, IOException {
		
		//파일업로드
		MultipartFile file = multi.getFile("byte");
		String filePath = "/upload/mall/";
		String fileName = gid+".jpg";
		//이미파일이 존재하는경우 삭제하기
		File oldFile = new File(filePath + fileName);
		if(oldFile.exists()) {
			oldFile.delete();
		}else {
			//이미지업로드한걸로 업데이트
			GoodsVO vo = new GoodsVO();
			vo.setGid(gid);
			vo.setImage("/display?file=" + filePath + fileName);
			dao.updateImage(vo);
		}
		file.transferTo(new File("c:" + filePath + fileName));

	}
	
	//텍스트 업로드
	@PostMapping("/update/contents")
	public void updateContents(@RequestBody GoodsVO vo) {
		dao.updateContents(vo);
	}
	
	
	
	
	
	
}
