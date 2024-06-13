package com.example.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ReplyDAO;
import com.example.domain.QueryVO;
import com.example.domain.ReplyVO;
import com.example.service.ReplyService;

@RestController
@RequestMapping("/reply")
public class ReplyRestController {

	
	@Autowired
	ReplyDAO dao;
	@Autowired
	ReplyService service;
	
	@PostMapping("/insert")
	public void insert(@RequestBody ReplyVO vo) {
		//dao.insert(vo);
		service.insert(vo);
	}
	
	@GetMapping("/list.json/{bid}") // 테스트 http://localhost:8080/reply/list.json/253?page=1&size=3
	public HashMap<String, Object> list(QueryVO vo, @PathVariable("bid") int bid){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("total", dao.total(bid));
		map.put("documents", dao.list(vo, bid));
		return map;
	}
	
	@PostMapping("/delete/{rid}") //테스트 http://localhost:8080/reply/delete/114
	public void delete(@PathVariable("rid") int rid) {
		//dao.delete(rid);
		service.delete(rid);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody ReplyVO vo) {
		dao.update(vo);
	}
	
	
	
	
	
}
