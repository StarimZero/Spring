package com.example.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.BBSDAO;
import com.example.domain.BBSVO;
import com.example.domain.QueryVO;

@RestController
@RequestMapping("/bbs")
public class BBSRestController {
	@Autowired
	BBSDAO dao;

	@GetMapping("/list.json") // 테스트 http://localhost:8080/bbs/list.json?key=uid&word=&page=1&size=3
	public HashMap<String, Object> list(QueryVO vo){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("total", dao.total(vo));
		map.put("documents", dao.list(vo));
		return map;
	}
	
	@GetMapping("/{bid}") //테스트 http://localhost:8080/bbs/114
	public BBSVO read(@PathVariable("bid") int bid) {
		return dao.read(bid);
	}
	
	@PostMapping("/delete/{bid}")
	public void delete(@PathVariable("bid") int bid) {
		dao.delete(bid);
	}
	
	@PostMapping("/update")
	public void update(BBSVO vo) {
		dao.update(vo);
	}
	
	@PostMapping("/insert")
	public void insert(BBSVO vo) {
		dao.insert(vo);
	}
	
}

