package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

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
import com.example.domain.AttachVO;
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
	
	
	//여러개파일 업로드
	@PostMapping("/attach/{gid}")
	public void attach(@PathVariable("gid") String gid, MultipartHttpServletRequest multi) {
		try {
			String filePath = "/upload/mall/" + gid + "/";
			File folder = new File("c:" + filePath);
			if(!folder.exists()) folder.mkdir();
			List<MultipartFile> files = multi.getFiles("bytes");
			for(MultipartFile file:files) {
				String fileName = UUID.randomUUID().toString()+".jpg";
				file.transferTo(new File("c:" + filePath + fileName));
				AttachVO vo = new AttachVO();
				vo.setGid(gid);
				vo.setFilename("/display?file=" + filePath + fileName);
				dao.insertAttach(vo);
			}
		}catch(Exception e){
			System.out.println("사진여러개업로드하다가오류........." + e.toString());
		}
	}
	
	//파일보기
	@GetMapping("/attach/{gid}") //테스트 : /goods/attach/48102139619
	public List<AttachVO> listAttach(@PathVariable("gid") String gid){
		return dao.listAttach(gid);
	}
	
	//파일삭제 // /display?file=
	@PostMapping("/attach/delete")
	public void deleteAttach(@RequestBody AttachVO vo) {
		try {
			String displayName = vo.getFilename();
			int index = displayName.indexOf("=");
			String fileName = displayName.substring(index + 1);
			File file = new File("c:"  + fileName);
			if(file.exists()) file.delete();
			dao.deleteAttach(vo.getAid());
		}catch(Exception e) {
			System.out.println("파일삭제하다가오류 ...." + e.toString());
		}
	}
	
	//관련상품등록
	@PostMapping("/related/insert")
	public int insertRelate(@RequestBody HashMap<String, Object> map){
		return service.insertRelated(map.get("gid").toString(), map.get("rid").toString());
	}
	
	//관련상품목록
	@GetMapping("/related/list/{gid}")
	public List<HashMap<String, Object>> listRelated(@PathVariable("gid") String gid){
		return dao.listRelated(gid);
	}
	
	
	//관련상품삭제
	@PostMapping("/related/delete")
	public void deleteRelated(@RequestBody HashMap<String,Object> map) {
		String rid=map.get("rid").toString();
		String gid=map.get("gid").toString();
		dao.deleteRelated(rid, gid);
	}
	





	
	
	
}
